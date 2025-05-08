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





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
