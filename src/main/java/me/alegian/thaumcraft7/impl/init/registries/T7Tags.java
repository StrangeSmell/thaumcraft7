package me.alegian.thaumcraft7.impl.init.registries;

import me.alegian.thaumcraft7.impl.Thaumcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Fluid;

public class T7Tags {
  public static final String COMMON = "c";

  public static class CrucibleHeatSourceTag {
    public static final TagKey<Block> BLOCK = TagKey.create(
        Registries.BLOCK,
        Thaumcraft.id("crucible_heat_source")
    );

    public static final TagKey<Fluid> FLUID = TagKey.create(
        Registries.FLUID,
        Thaumcraft.id("crucible_heat_source")
    );
  }

  public static final TagKey<Item> WAND_HANDLE = TagKey.create(
      Registries.ITEM,
      Thaumcraft.id("wand_handle")
  );

  public static final TagKey<Item> WAND_CORE = TagKey.create(
      Registries.ITEM,
      Thaumcraft.id("wand_core")
  );

  public static final TagKey<Item> TESTA = TagKey.create(
      Registries.ITEM,
      Thaumcraft.id("testa")
  );

  public static final TagKey<Item> CATALYST = TagKey.create(
      Registries.ITEM,
      Thaumcraft.id("catalyst")
  );
}
