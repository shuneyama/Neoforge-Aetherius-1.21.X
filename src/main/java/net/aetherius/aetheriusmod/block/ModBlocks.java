package net.aetherius.aetheriusmod.block;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.*;
import net.aetherius.aetheriusmod.AetheriusMod;
import net.aetherius.aetheriusmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(AetheriusMod.MOD_ID);

// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=





    public static final DeferredBlock<Block> BLOCO_AR = registerBlock("bloco_ar",
            () -> new BarrierBlock(BlockBehaviour.Properties.of()
                    .noOcclusion().noLootTable().strength(-1.0F, 3600000.8F)
                    .pushReaction(PushReaction.BLOCK).noTerrainParticles()));

    public static final DeferredBlock<Block> CIANE_MINERIO = registerBlock("ciane_minerio",
            () -> new DropExperienceBlock(UniformInt.of(5, 10),
                    BlockBehaviour.Properties.of().strength(7f).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DAMA_DA_NOITE = registerBlock("dama_da_noite",
            () -> new FlowerBlock(MobEffects.SATURATION, 0.35F, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));
    public static final DeferredBlock<Block> DAMA_DA_NOITE_VERMELHO = registerBlock("dama_da_noite_vermelho",
            () -> new FlowerBlock(MobEffects.SATURATION, 0.35F, BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XZ).pushReaction(PushReaction.DESTROY)));





// -=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

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