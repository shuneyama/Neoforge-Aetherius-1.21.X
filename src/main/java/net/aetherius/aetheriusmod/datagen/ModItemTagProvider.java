package net.aetherius.aetheriusmod.datagen;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.aetherius.aetheriusmod.item.ModItems;
import net.aetherius.aetheriusmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;


import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, AetheriusMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.PICKAXES)
                .add(ModItems.PICARETA_CIANE.get());
        tag(ItemTags.AXES)
                .add(ModItems.MACHADO_CIANE.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.PA_CIANE.get());
        tag(ItemTags.HOES)
                .add(ModItems.ENXADA_CIANE.get());
    }
}