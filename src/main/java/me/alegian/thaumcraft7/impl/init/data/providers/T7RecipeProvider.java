package me.alegian.thaumcraft7.impl.init.data.providers;

import me.alegian.thaumcraft7.impl.init.registries.deferred.T7Blocks;
import me.alegian.thaumcraft7.impl.init.registries.deferred.T7Items;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.Tags;

import java.util.concurrent.CompletableFuture;

public class T7RecipeProvider extends RecipeProvider {
  public T7RecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
    super(pOutput, pRegistries);
  }

  @Override
  protected void buildRecipes(RecipeOutput pRecipeOutput) {
    planksFromLog(pRecipeOutput, T7Blocks.GREATWOOD_PLANKS, T7Blocks.GREATWOOD_LOG);
    wandCap(pRecipeOutput, T7Items.IRON_CAP.get(), Items.IRON_NUGGET);
    wand(pRecipeOutput, T7Items.IRON_WOOD_WAND.get(), T7Items.IRON_CAP.get(), Tags.Items.RODS_WOODEN);
  }

  protected static void wand(RecipeOutput pRecipeOutput, ItemLike wand, ItemLike cap, ItemLike core) {
    ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, wand)
        .define('a', cap)
        .define('b', core)
        .pattern("  a")
        .pattern(" b ")
        .pattern("a  ")
        .group("wand")
        .unlockedBy(getHasName(cap), has(cap))
        .save(pRecipeOutput);
  }

  protected static void wand(RecipeOutput pRecipeOutput, ItemLike wand, ItemLike cap, TagKey<Item> core) {
    ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, wand)
        .define('a', cap)
        .define('b', core)
        .pattern("  a")
        .pattern(" b ")
        .pattern("a  ")
        .group("wand")
        .unlockedBy(getHasName(cap), has(cap))
        .save(pRecipeOutput);
  }

  protected static void wandCap(RecipeOutput pRecipeOutput, ItemLike cap, ItemLike material) {
    ShapedRecipeBuilder.shaped(RecipeCategory.MISC, cap)
        .define('m', material)
        .pattern("mmm")
        .pattern("m m")
        .group("wand_cap")
        .unlockedBy(getHasName(material), has(material))
        .save(pRecipeOutput);
  }

  protected static void planksFromLog(RecipeOutput pRecipeOutput, ItemLike pPlanks, ItemLike pLog) {
    ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pPlanks, 4)
        .requires(pLog)
        .group("planks")
        .unlockedBy("has_logs", has(pLog))
        .save(pRecipeOutput);
  }
}
