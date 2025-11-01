package net.aelysium.aelysiummod.command;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.RegisterCommandsEvent;

public class Deus {

    @SubscribeEvent
    public void registerCommands(RegisterCommandsEvent event) {
        event.getDispatcher().register(
                Commands.literal("aelysium")
                        .then(Commands.literal("reload")
                                .executes(ctx -> {
                                    Deus_Config.load(ctx.getSource().getServer());
                                    ctx.getSource().sendSuccess(() -> Component.literal("Config recarregada!"), true);
                                    return 1;
                                }))


                        .then(Commands.literal("deus")
                                .then(Commands.argument("player", EntityArgument.player())
                                        .executes(ctx -> {
                                            if (Deus_Config.DATA == null)
                                                Deus_Config.load(ctx.getSource().getServer());

                                            return DIVINDADE(ctx);
                                        })))
        );
    }

    private int DIVINDADE(CommandContext<CommandSourceStack> ctx) throws CommandSyntaxException {
        ServerPlayer p = EntityArgument.getPlayer(ctx, "player");
        var cfg = Deus_Config.DATA;

        if (cfg == null) {
            ctx.getSource().sendFailure(Component.literal("Config não carregada."));
            return 0;
        }

        // Time
        if (cfg.team.enabled) {
            p.getServer().getCommands().performPrefixedCommand(ctx.getSource(), "team add " + cfg.team.name);
            p.getServer().getCommands().performPrefixedCommand(ctx.getSource(), "team join " + cfg.team.name + " " + p.getName().getString());
        }

        // Atributos
        if (cfg.attributes.enabled) {
            for (var a : cfg.attributes.list) {
                var attrib = Deus_Config.getAttribute(a.attribute);
                if (attrib != null && p.getAttributes().hasAttribute(attrib)) {
                    p.getAttribute(attrib).setBaseValue(a.value);
                }
            }
        }

        // Efeitos Extras
        p.getAbilities().mayfly = cfg.abilities.allow_flight;
        p.onUpdateAbilities();

        if (cfg.effects.enable_darkness) {
            p.addEffect(new MobEffectInstance(MobEffects.DARKNESS, 100, 0));
        }

        if (cfg.effects.enable_heal) {
            p.addEffect(new MobEffectInstance(MobEffects.HEAL, 60, 10));
        }

        // Efeitos
        if (cfg.effects.enabled) {
            for (var e : cfg.effects.list) {
                var effectHolder = Deus_Config.getEffect(e.effect);
                if (effectHolder != null) {
                    p.addEffect(new MobEffectInstance(effectHolder, e.duration * 20, e.amplifier));

                }

            }
        }

        ctx.getSource().sendSuccess(() -> Component.literal(p.getName().getString() + " foi ascendido!"), true);
        return 1;
    }
}
