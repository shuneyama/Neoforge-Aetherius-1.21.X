package net.aetherius.aetheriusmod.item;

import net.aetherius.aetheriusmod.util.ModTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;

public class ModToolTiers {
    public static final Tier ADM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_ADM_TOOL,
            1400, 4f, 3f, 28, () -> Ingredient.of(ModItems.ESPADA_ADM));
}