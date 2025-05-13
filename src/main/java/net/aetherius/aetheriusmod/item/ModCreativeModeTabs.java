package net.aetherius.aetheriusmod.item;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AetheriusMod.MOD_ID);

    public static final Supplier<CreativeModeTab> AETHERIUS_ITEMS_TAB = CREATIVE_MODE_TAB.register("aetherius_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AEDA_CYANNAZ.get()))
                    .title(Component.translatable("creativetab.aetherius.mod.aetherius_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        //moedas=========================
                        output.accept(ModItems.AEDA_CYANNAZ);
                        output.accept(ModItems.AEDA_AMETISTA);
                        output.accept(ModItems.AEDA_COBRE);
                        output.accept(ModItems.AEDA_OURO);
                        output.accept(ModItems.AEDA_PRATA);
                        output.accept(ModItems.AEDA_RUBI);
                        //chaves=========================
                        output.accept(ModItems.CHAVERACHA1);
                        output.accept(ModItems.CHAVERACHA2);
                        output.accept(ModItems.CHAVERACHA3);
                        output.accept(ModItems.CHAVERACHA4);
                        output.accept(ModItems.CHAVERACHA5);
                        output.accept(ModItems.CHAVERACHA6);
                        output.accept(ModItems.CHAVERACHA7);
                        output.accept(ModItems.CHAVERACHA8);




                    })


                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
