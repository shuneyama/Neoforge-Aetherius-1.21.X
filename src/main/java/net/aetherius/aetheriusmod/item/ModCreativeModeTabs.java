package net.aetherius.aetheriusmod.item;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.aetherius.aetheriusmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AetheriusMod.MOD_ID);

    public static final Supplier<CreativeModeTab> AETHERIUS_ITENS_TAB = CREATIVE_MODE_TAB.register("aetherius_itens_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AEDA_CYANNAZ.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AetheriusMod.MOD_ID, "aetherius_blocos_tab"))
                    .title(Component.translatable("creativetab.aetheriusmod.aetherius_itens"))
                    .displayItems((itemDisplayParameters, output) -> {

//moedas !! ============================================================================================================
                        output.accept(ModItems.AEDA_CYANNAZ);
                        output.accept(ModItems.AEDA_AMETISTA);
                        output.accept(ModItems.AEDA_COBRE);
                        output.accept(ModItems.AEDA_OURO);
                        output.accept(ModItems.AEDA_PRATA);
                        output.accept(ModItems.AEDA_RUBI);

//chaves !! ============================================================================================================
                        output.accept(ModItems.CHAVERACHA1);
                        output.accept(ModItems.CHAVERACHA2);
                        output.accept(ModItems.CHAVERACHA3);
                        output.accept(ModItems.CHAVERACHA4);
                        output.accept(ModItems.CHAVERACHA5);
                        output.accept(ModItems.CHAVERACHA6);
                        output.accept(ModItems.CHAVERACHA7);
                        output.accept(ModItems.CHAVERACHA8);
                    }).build());

    public static final Supplier<CreativeModeTab> AETHERIUS_BLOCOS_TAB = CREATIVE_MODE_TAB.register("aetherius_blocos_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOCO_AR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AetheriusMod.MOD_ID, "aetherius_armas_tab"))
                    .title(Component.translatable("creativetab.aetheriusmod.aetherius_blocos"))
                    .displayItems((itemDisplayParameters, output) -> {

//blocos !! ============================================================================================================
                        output.accept(ModBlocks.BLOCO_AR);
                    }).build());

    public static final Supplier<CreativeModeTab> AETHERIUS_ARMAS_TAB = CREATIVE_MODE_TAB.register("aetherius_armas_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CANO.get()))
                    .title(Component.translatable("creativetab.aetheriusmod.aetherius_armas"))
                    .displayItems((itemDisplayParameters, output) -> {

//armas !! =============================================================================================================
                        output.accept(ModItems.CANO);
                        output.accept(ModItems.CRIMSON_WHISPER);
                        output.accept(ModItems.DARK_JUDGMENT);
                        output.accept(ModItems.DIVINE_SILENCE);
                        output.accept(ModItems.ESPADA_ADM);
                        output.accept(ModItems.ESPADA_ESPECIAL);
                        output.accept(ModItems.EXPERIMENTO_646);
                        output.accept(ModItems.FULMENS_FANG);
                        output.accept(ModItems.LAMINA_DA_ALVORADA);
                        output.accept(ModItems.AURORA_HIBERNA);
                        output.accept(ModItems.THYRSUS);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
