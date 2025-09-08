package net.aetherius.aetheriusmod.datagen;

import net.aetherius.aetheriusmod.block.ModBlocks;
import net.aetherius.aetheriusmod.item.ModItems;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {

        add(ModBlocks.CIANE_MINERIO.get(),
                block -> createOreDrop(ModBlocks.CIANE_MINERIO.get(), ModItems.CIANE_CRU.get()));
        add(ModBlocks.DAMA_DA_NOITE.get(),
                block -> createSingleItemTable(ModBlocks.DAMA_DA_NOITE.get()));
        add(ModBlocks.DAMA_DA_NOITE_VERMELHO.get(),
                block -> createSingleItemTable(ModBlocks.DAMA_DA_NOITE_VERMELHO.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}