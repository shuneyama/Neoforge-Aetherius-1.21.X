package net.aetherius.aetheriusmod.item;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(AetheriusMod.MOD_ID);





    public static final DeferredItem<SwordItem> ESPADA_ADM = ITEMS.register("espada_adm",
            () -> new SwordItem(ModToolTiers.ADM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.ADM, 96, 6f))));

    public static final DeferredItem<Item> AEDA_COBRE = ITEMS.register("aeda_cobre",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AEDA_PRATA = ITEMS.register("aeda_prata",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AEDA_OURO = ITEMS.register("aeda_ouro",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AEDA_AMETISTA = ITEMS.register("aeda_ametista",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AEDA_RUBI = ITEMS.register("aeda_rubi",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> AEDA_CYANNAZ = ITEMS.register("aeda_cyannaz",
            () -> new Item(new Item.Properties()));




    public static final DeferredItem<Item> CHAVERACHA = ITEMS.register("cyan_black_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA2 = ITEMS.register("cyan_golden_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA3 = ITEMS.register("red_black_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA4 = ITEMS.register("red_golden_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA5 = ITEMS.register("green_black_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA6 = ITEMS.register("green_golden_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA7 = ITEMS.register("purple_black_key",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> CHAVERACHA8 = ITEMS.register("purple_golden_key",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
