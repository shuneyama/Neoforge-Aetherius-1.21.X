package net.aetherius.aetheriusmod.item;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.Unbreakable;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AetheriusMod.MOD_ID);





// espadinhas :3 =======================================================================================================
        public static final DeferredItem<SwordItem> ESPADA_ADM = ITEMS.register("espada_adm",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 50, 1f))));

        public static final DeferredItem<SwordItem> CANO = ITEMS.register("cano",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1).durability(0)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 10, -1.8f))){
                    @Override
                    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                        if (Screen.hasShiftDown()) {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.cano.shift_down"));
                        } else {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.cano"));
                        }
                        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    }
                });

        public static final DeferredItem<SwordItem> EXPERIMENTO_646 = ITEMS.register("experimento_646",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 14, -2f))){
                    @Override
                    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                        if (Screen.hasShiftDown()) {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.experimento_646.shift_down"));
                        } else {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.experimento_646"));
                        }
                        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    }
                });

        public static final DeferredItem<SwordItem> AURORA_HIBERNA = ITEMS.register("aurora_hiberna",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 16, -1.8f))){
                    @Override
                    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                        if (Screen.hasShiftDown()) {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.aurora_hiberna.shift_down"));
                        } else {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.aurora_hiberna"));
                        }
                        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    }
                });

        public static final DeferredItem<SwordItem> FULMENS_FANG = ITEMS.register("fulmens_fang",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 6f))){
                    @Override
                    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                        if (Screen.hasShiftDown()) {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.fulmens_fang.shift_down"));
                        } else {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.fulmens_fang"));
                        }
                        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    }
                });

        public static final DeferredItem<SwordItem> DARK_JUDGMENT = ITEMS.register("dark_judgment",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 6f))){
                    @Override
                    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                        if (Screen.hasShiftDown()) {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.dark_judgment.shift_down"));
                        } else {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.dark_judgment"));
                        }
                        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    }
                });

        public static final DeferredItem<SwordItem> CRIMSON_WHISPER = ITEMS.register("crimson_whisper",
                () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                        .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 26, -1.8f))){
                    @Override
                    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                        if (Screen.hasShiftDown()) {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.crimson_whisper.shift_down"));
                        } else {
                            tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.crimson_whisper"));
                        }
                        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                    }
                });

    public static final DeferredItem<SwordItem> THYRSUS = ITEMS.register("thyrsus",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 26, -1.8f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.thyrsus.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.thyrsus"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<SwordItem> DIVINE_SILENCE = ITEMS.register("divine_silence",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 26, -1.8f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.divine_silence.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.divine_silence"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });

    public static final DeferredItem<SwordItem> LAMINA_DA_ALVORADA = ITEMS.register("lamina_da_alvorada",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 26, -1.8f))){
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.lamina_da_alvorada.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.lamina_da_alvorada"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });


// moedas <3 ===========================================================================================================
        public static final DeferredItem<Item> AEDA_COBRE = ITEMS.register("aeda_cobre",
                () -> new Item(new Item.Properties().stacksTo(16)));
        public static final DeferredItem<Item> AEDA_PRATA = ITEMS.register("aeda_prata",
                () -> new Item(new Item.Properties().stacksTo(16)));
        public static final DeferredItem<Item> AEDA_OURO = ITEMS.register("aeda_ouro",
                () -> new Item(new Item.Properties().stacksTo(16)));
        public static final DeferredItem<Item> AEDA_AMETISTA = ITEMS.register("aeda_ametista",
                () -> new Item(new Item.Properties().stacksTo(16)));
        public static final DeferredItem<Item> AEDA_RUBI = ITEMS.register("aeda_rubi",
                () -> new Item(new Item.Properties().stacksTo(16)));
        public static final DeferredItem<Item> AEDA_CYANNAZ = ITEMS.register("aeda_cyannaz",
                () -> new Item(new Item.Properties().stacksTo(16)));


// chaves !! ===========================================================================================================
        public static final DeferredItem<Item> CHAVERACHA1 = ITEMS.register("chave_ciano_dourado",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA2 = ITEMS.register("chave_ciano_escuro",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA3 = ITEMS.register("chave_roxo_dourado",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA4 = ITEMS.register("chave_roxo_escuro",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA5 = ITEMS.register("chave_verde_dourado",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA6 = ITEMS.register("chave_verde_escuro",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA7 = ITEMS.register("chave_vermelho_dourado",
                () -> new Item(new Item.Properties().stacksTo(1)));
        public static final DeferredItem<Item> CHAVERACHA8 = ITEMS.register("chave_vermelho_escuro",
                () -> new Item(new Item.Properties().stacksTo(1)));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
