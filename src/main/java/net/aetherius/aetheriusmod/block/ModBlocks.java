package net.aetherius.aetheriusmod.block;

import net.minecraft.world.level.block.BarrierBlock;
import net.minecraft.world.level.block.Block;
import net.aetherius.aetheriusmod.AetheriusMod;
import net.aetherius.aetheriusmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AetheriusMod.MOD_ID);





    public static final DeferredBlock<Block> BLOCO_AR = registerBlock("bloco_ar",
            () -> new BarrierBlock(BlockBehaviour.Properties.of()
                    .noOcclusion().noLootTable().strength(-1.0F, 3600000.8F).pushReaction(PushReaction.BLOCK).noTerrainParticles()));





    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
       DeferredBlock<T> toReturn = BLOCKS.register(name, block);
       registerBlockItem(name, toReturn);
       return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}