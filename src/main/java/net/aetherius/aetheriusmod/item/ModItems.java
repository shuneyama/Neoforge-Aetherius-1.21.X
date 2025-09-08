package net.aetherius.aetheriusmod.item;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AetheriusMod.MOD_ID);





// espadinhas :3 =======================================================================================================
    public static final DeferredItem<SwordItem> ESPADA_ADM = ITEMS.register("espada_adm",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 124, 60f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.espada_adm.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.espada_adm"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> ESPADA_ESPECIAL = ITEMS.register("espada_especial",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 9, -2.6f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.espada_especial.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.espada_especial"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> CANO = ITEMS.register("cano",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1).durability(0)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 10, -1.8f))) {
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
    public static final DeferredItem<SwordItem> PARAR = ITEMS.register("parar",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 124, 60f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.parar.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.parar"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> EXPERIMENTO_646 = ITEMS.register("experimento_646",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 14, -2.2f))) {
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
    public static final DeferredItem<SwordItem> CRIMSON_WHISPER = ITEMS.register("crimson_whisper",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 26, -1.5f))) {
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
    public static final DeferredItem<SwordItem> AURORA_HIBERNA = ITEMS.register("aurora_hiberna",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
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
    public static final DeferredItem<SwordItem> LUZ_DA_ULTIMA_FENIX = ITEMS.register("luz_da_ultima_fenix",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.luz_da_ultima_fenix.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.luz_da_ultima_fenix"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> FULMENS_FANG = ITEMS.register("fulmens_fang",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
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
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
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
    public static final DeferredItem<SwordItem> DIVINE_SILENCE = ITEMS.register("divine_silence",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
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
    public static final DeferredItem<SwordItem> THYRSUS = ITEMS.register("thyrsus",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
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
    public static final DeferredItem<SwordItem> ALVORADA_CELESTE = ITEMS.register("alvorada_celeste",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.alvorada_celeste.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.alvorada_celeste"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> PROTOCOLO_GENESIS = ITEMS.register("protocolo_genesis",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 24, -1.7f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.protocolo_genesis.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.protocolo_genesis"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> THUNDERLASH = ITEMS.register("thunderlash",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 15, -1.7f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.thunderlash.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.thunderlash"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> BLOOD_REGRET = ITEMS.register("blood_regret",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 4, -2.4f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.blood_regret.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.blood_regret"));
                    }
                    super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
                }
            });
    public static final DeferredItem<SwordItem> AEON = ITEMS.register("aeon",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().stacksTo(1)
                    .attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 1f))) {
                @Override
                public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
                    if (Screen.hasShiftDown()) {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.aeon.shift_down"));
                    } else {
                        tooltipComponents.add(Component.translatable("tooltip.aetheriusmod.aeon"));
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
    public static final DeferredItem<Item> AEDA_CIANE = ITEMS.register("aeda_ciane",
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


// elementos !! ========================================================================================================
    public static final DeferredItem<Item> ELEMENTO_FOGO = ITEMS.register("elemento_fogo",
           () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ELEMENTO_GELO = ITEMS.register("elemento_gelo",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ELEMENTO_NATUREZA = ITEMS.register("elemento_natureza",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ELEMENTO_RAIO = ITEMS.register("elemento_raio",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ELEMENTO_SACRA = ITEMS.register("elemento_sacra",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ELEMENTO_SANGUE = ITEMS.register("elemento_sangue",
            () -> new Item(new Item.Properties().stacksTo(16)));
    public static final DeferredItem<Item> ELEMENTO_VAZIO = ITEMS.register("elemento_vazio",
            () -> new Item(new Item.Properties().stacksTo(16)));


// ciane !! ============================================================================================================
    public static final DeferredItem<Item> CIANE_CRU = ITEMS.register("ciane_cru",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> CIANE_FRAGMENTO = ITEMS.register("ciane_fragmento",
            () -> new Item(new Item.Properties().stacksTo(64)));
    public static final DeferredItem<Item> CIANE_BARRA = ITEMS.register("ciane_barra",
            () -> new Item(new Item.Properties().stacksTo(64)));

    public static final DeferredItem<ArmorItem> CIANE_CAPACETE = ITEMS.register("ciane_capacete",
            () -> new ArmorItem(ModArmorMaterials.CIANE_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Properties()
                    .stacksTo(1).fireResistant().durability(ArmorItem.Type.HELMET.getDurability(50))));
    public static final DeferredItem<ArmorItem> CIANE_PEITORAL = ITEMS.register("ciane_peitoral",
            () -> new ArmorItem(ModArmorMaterials.CIANE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Properties()
                    .stacksTo(1).fireResistant().durability(ArmorItem.Type.CHESTPLATE.getDurability(40))));
    public static final DeferredItem<ArmorItem> CIANE_CALCINHA = ITEMS.register("ciane_calcinha",
            () -> new ArmorItem(ModArmorMaterials.CIANE_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Properties()
                    .stacksTo(1).fireResistant().durability(ArmorItem.Type.LEGGINGS.getDurability(40))));
    public static final DeferredItem<ArmorItem> CIANE_BOTAS = ITEMS.register("ciane_botas",
            () -> new ArmorItem(ModArmorMaterials.CIANE_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Properties()
                    .stacksTo(1).fireResistant().durability(ArmorItem.Type.BOOTS.getDurability(40))));

    public static final DeferredItem<PickaxeItem> CIANE_PICARETA = ITEMS.register("ciane_picareta",
            () -> new PickaxeItem(ModToolTiers.CIANE, new Item.Properties()
                    .stacksTo(1).attributes(PickaxeItem.createAttributes(ModToolTiers.CIANE, 5, -3f))));
    public static final DeferredItem<ShovelItem> CIANE_PA = ITEMS.register("ciane_pa",
            () -> new ShovelItem(ModToolTiers.CIANE, new Item.Properties()
                    .stacksTo(1).attributes(ShovelItem.createAttributes(ModToolTiers.CIANE, 5.5F, -3f))));
    public static final DeferredItem<HoeItem> CIANE_ENXADA = ITEMS.register("ciane_enxada",
            () -> new HoeItem(ModToolTiers.CIANE, new Item.Properties()
                    .stacksTo(1).attributes(HoeItem.createAttributes(ModToolTiers.CIANE, 0, -3f))));
    public static final DeferredItem<AxeItem> CIANE_MACHADO = ITEMS.register("ciane_machado",
            () -> new AxeItem(ModToolTiers.CIANE, new Item.Properties()
                    .stacksTo(1).attributes(AxeItem.createAttributes(ModToolTiers.CIANE, 9, -3f))));
    public static final DeferredItem<SwordItem> CIANE_ESPADA = ITEMS.register("ciane_espada",
            () -> new SwordItem(ModToolTiers.CIANE, new Item.Properties()
                    .stacksTo(1).attributes(SwordItem.createAttributes(ModToolTiers.ADM, 7, -2.2f))));

    public static final DeferredItem<Item> POEIRA_LUNAR = ITEMS.register("poeira_lunar",
            () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }

}