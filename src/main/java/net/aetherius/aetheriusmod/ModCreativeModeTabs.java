package net.aetherius.aetheriusmod;

import net.aetherius.aetheriusmod.block.ModBlocks;
import net.aetherius.aetheriusmod.item.ModItems;
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

//itens !! =============================================================================================================
    public static final Supplier<CreativeModeTab> AETHERIUS_ITENS_TAB = CREATIVE_MODE_TAB.register("aetherius_itens_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AEDA_CIANE.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AetheriusMod.MOD_ID, "aetherius_blocos_tab"))
                    .title(Component.translatable("creativetab.aetheriusmod.aetherius_itens"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.AEDA_COBRE);
                        output.accept(ModItems.AEDA_PRATA);
                        output.accept(ModItems.AEDA_OURO);
                        output.accept(ModItems.AEDA_RUBI);
                        output.accept(ModItems.AEDA_CIANE);
                        output.accept(ModItems.AEDA_AMETISTA);

                        output.accept(ModItems.CHAVERACHA1);
                        output.accept(ModItems.CHAVERACHA2);
                        output.accept(ModItems.CHAVERACHA3);
                        output.accept(ModItems.CHAVERACHA4);
                        output.accept(ModItems.CHAVERACHA5);
                        output.accept(ModItems.CHAVERACHA6);
                        output.accept(ModItems.CHAVERACHA7);
                        output.accept(ModItems.CHAVERACHA8);

                        output.accept(ModItems.ELEMENTO_FOGO);
                        output.accept(ModItems.ELEMENTO_GELO);
                        output.accept(ModItems.ELEMENTO_NATUREZA);
                        output.accept(ModItems.ELEMENTO_RAIO);
                        output.accept(ModItems.ELEMENTO_SACRA);
                        output.accept(ModItems.ELEMENTO_SANGUE);
                        output.accept(ModItems.ELEMENTO_VAZIO);

                        output.accept(ModItems.CIANE_BARRA);
                        output.accept(ModItems.CIANE_CRU);
                        output.accept(ModItems.CIANE_FRAGMENTO);
                    }).build());


//blocos !! ============================================================================================================
    public static final Supplier<CreativeModeTab> AETHERIUS_BLOCOS_TAB = CREATIVE_MODE_TAB.register("aetherius_blocos_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLOCO_AR.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(AetheriusMod.MOD_ID, "aetherius_armas_tab"))
                    .title(Component.translatable("creativetab.aetheriusmod.aetherius_blocos"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModBlocks.BLOCO_AR);
                        output.accept(ModBlocks.CIANE_MINERIO);
                    }).build());


//armas !! =============================================================================================================
    public static final Supplier<CreativeModeTab> AETHERIUS_ARMAS_TAB = CREATIVE_MODE_TAB.register("aetherius_armas_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CANO.get()))
                    .title(Component.translatable("creativetab.aetheriusmod.aetherius_armas"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.CIANE_CAPACETE);
                        output.accept(ModItems.CIANE_PEITORAL);
                        output.accept(ModItems.CIANE_CALCINHA);
                        output.accept(ModItems.CIANE_BOTAS);

                        output.accept(ModItems.CIANE_ESPADA);
                        output.accept(ModItems.CIANE_PICARETA);
                        output.accept(ModItems.CIANE_MACHADO);
                        output.accept(ModItems.CIANE_PA);
                        output.accept(ModItems.CIANE_ENXADA);

                        output.accept(ModItems.CANO);
                        output.accept(ModItems.PARAR);
                        output.accept(ModItems.CRIMSON_WHISPER);
                        output.accept(ModItems.DARK_JUDGMENT);
                        output.accept(ModItems.DIVINE_SILENCE);
                        output.accept(ModItems.ESPADA_ADM);
                        output.accept(ModItems.ESPADA_ESPECIAL);
                        output.accept(ModItems.EXPERIMENTO_646);
                        output.accept(ModItems.FULMENS_FANG);
                        output.accept(ModItems.ALVORADA_CELESTE);
                        output.accept(ModItems.AURORA_HIBERNA);
                        output.accept(ModItems.LUZ_DA_ULTIMA_FENIX);
                        output.accept(ModItems.THYRSUS);
                        output.accept(ModItems.PROTOCOLO_GENESIS);
                        output.accept(ModItems.THUNDERLASH);
                        output.accept(ModItems.BLOOD_REGRET);
                        output.accept(ModItems.AEON);
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}