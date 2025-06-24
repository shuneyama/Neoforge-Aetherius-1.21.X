package net.aetherius.aetheriusmod.datagen;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.aetherius.aetheriusmod.item.ModItems;
import net.aetherius.aetheriusmod.item.ModToolTiers;
import net.aetherius.aetheriusmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
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
                .add(ModItems.CIANE_PICARETA.get());
        tag(ItemTags.AXES)
                .add(ModItems.CIANE_MACHADO.get());
        tag(ItemTags.SHOVELS)
                .add(ModItems.CIANE_PA.get());
        tag(ItemTags.HOES)
                .add(ModItems.CIANE_ENXADA.get());
        tag(ItemTags.SWORDS)
                .add(ModItems.CIANE_ESPADA.get())
                .add(ModItems.ESPADA_ESPECIAL.get())
                .add(ModItems.PARAR.get())
                .add(ModItems.CANO.get());
        tag(ItemTags.HEAD_ARMOR)
                .add(ModItems.CIANE_CAPACETE.get());
        tag(ItemTags.CHEST_ARMOR)
                .add(ModItems.CIANE_PEITORAL.get());
        tag(ItemTags.LEG_ARMOR)
                .add(ModItems.CIANE_CALCINHA.get());
        tag(ItemTags.FOOT_ARMOR)
                .add(ModItems.CIANE_BOTAS.get());


    }
}