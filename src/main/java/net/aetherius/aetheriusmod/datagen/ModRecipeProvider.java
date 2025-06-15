package net.aetherius.aetheriusmod.datagen;

import net.aetherius.aetheriusmod.AetheriusMod;
import net.aetherius.aetheriusmod.item.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        List<ItemLike> CIANE_SMELTABLES = List.of(ModItems.CIANE_CRU);

        oreSmelting(recipeOutput, CIANE_SMELTABLES, RecipeCategory.MISC, ModItems.CIANE_FRAGMENTO.get(), 0.3f, 200, "ciane");
        oreBlasting(recipeOutput, CIANE_SMELTABLES, RecipeCategory.MISC, ModItems.CIANE_FRAGMENTO.get(), 0.3f, 100, "ciane");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AEDA_PRATA.get())
                .pattern("CC")
                .pattern("CC")
                .define('C', ModItems.AEDA_COBRE.get())
                .unlockedBy("has_aeda_cobre", has(ModItems.AEDA_COBRE)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AEDA_OURO.get())
                .pattern("PP")
                .pattern("PP")
                .define('P', ModItems.AEDA_PRATA.get())
                .unlockedBy("has_aeda_prata", has(ModItems.AEDA_PRATA)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AEDA_RUBI.get())
                .pattern("OO")
                .pattern("OO")
                .define('O', ModItems.AEDA_OURO.get())
                .unlockedBy("has_aeda_ouro", has(ModItems.AEDA_OURO)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.AEDA_CIANE.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RRR")
                .define('R', ModItems.AEDA_RUBI.get())
                .unlockedBy("has_aeda_rubi", has(ModItems.AEDA_RUBI)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AEDA_COBRE.get(), 4)
                .requires(ModItems.AEDA_PRATA)
                .unlockedBy("has_aeda_prata", has(ModItems.AEDA_PRATA))
                .save(recipeOutput, "aetheriusmod:aeda_cobre_prata");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AEDA_PRATA.get(), 4)
                .requires(ModItems.AEDA_OURO)
                .unlockedBy("has_aeda_ouro", has(ModItems.AEDA_OURO))
                .save(recipeOutput, "aetheriusmod:aeda_prata_ouro");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AEDA_OURO.get(), 4)
                .requires(ModItems.AEDA_RUBI)
                .unlockedBy("has_aeda_rubi", has(ModItems.AEDA_RUBI))
                .save(recipeOutput, "aetheriusmod:aeda_ouro_rubi");
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AEDA_RUBI.get(), 9)
                .requires(ModItems.AEDA_CIANE)
                .unlockedBy("has_aeda_ciane", has(ModItems.AEDA_CIANE))
                .save(recipeOutput, "aetheriusmod:aeda_rubi_ciane");

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CIANE_BARRA.get(), 1)
                .requires(ModItems.CIANE_FRAGMENTO)
                .requires(ModItems.CIANE_FRAGMENTO)
                .requires(ModItems.CIANE_FRAGMENTO)
                .requires(ModItems.CIANE_FRAGMENTO)
                .requires(Items.NETHERITE_INGOT)
                .requires(Items.NETHERITE_INGOT)
                .requires(Items.NETHERITE_INGOT)
                .requires(Items.NETHERITE_INGOT)
                .unlockedBy("has_ciane_scrap", has(ModItems.CIANE_FRAGMENTO))
                .save(recipeOutput, "aetheriusmod:ciane_ingot");

    }

    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, AetheriusMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
