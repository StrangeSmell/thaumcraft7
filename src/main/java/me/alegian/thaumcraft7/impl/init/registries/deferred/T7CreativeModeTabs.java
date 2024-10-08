package me.alegian.thaumcraft7.impl.init.registries.deferred;

import me.alegian.thaumcraft7.impl.Thaumcraft;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredRegister;

public class T7CreativeModeTabs {
  public static final DeferredRegister<CreativeModeTab> REGISTRAR = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Thaumcraft.MODID);

  static {
    REGISTRAR.register(
        "thaumcraft_tab",
        () -> CreativeModeTab
            .builder()
            .title(Component.translatable("thaumcraft"))
            .icon(() -> T7Items.THAUMONOMICON.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
              output.accept(T7Blocks.AURA_NODE.get());
              output.accept(T7Blocks.IGNIS_INFUSED_STONE.get());
              output.accept(T7Blocks.AER_INFUSED_STONE.get());
              output.accept(T7Blocks.TERRA_INFUSED_STONE.get());
              output.accept(T7Blocks.AQUA_INFUSED_STONE.get());
              output.accept(T7Blocks.ORDO_INFUSED_STONE.get());
              output.accept(T7Blocks.PERDITIO_INFUSED_STONE.get());
              output.accept(T7Blocks.ARCANUM_BLOCK.get());
              output.accept(T7Blocks.ORICHALCUM_BLOCK.get());

              output.accept(T7Blocks.GREATWOOD_LEAVES.get());
              output.accept(T7Blocks.GREATWOOD_LOG.get());
              output.accept(T7Blocks.GREATWOOD_PLANKS.get());
              output.accept(T7Blocks.GREATWOOD_SAPLING.get());

              output.accept(T7Blocks.SILVERWOOD_LEAVES.get());
              output.accept(T7Blocks.SILVERWOOD_SAPLING.get());
              output.accept(T7Blocks.SILVERWOOD_LOG.get());
              output.accept(T7Blocks.SILVERWOOD_PLANKS.get());

              output.accept(T7Blocks.ARCANE_WORKBENCH.get());

              output.accept(T7Blocks.ESSENTIA_CONTAINER.get());

              output.accept(T7Items.IRON_HANDLE.get());
              output.accept(T7Items.GOLD_HANDLE.get());
              output.accept(T7Items.ORICHALCUM_HANDLE.get());
              output.accept(T7Items.ARCANUM_HANDLE.get());

              output.accept(T7Items.GREATWOOD_CORE.get());
              output.accept(T7Items.SILVERWOOD_CORE.get());

              output.accept(T7Items.RUNE.get());
              output.accept(T7Items.ARCANUM_INGOT.get());
              output.accept(T7Items.ARCANUM_NUGGET.get());
              output.accept(T7Items.ORICHALCUM_INGOT.get());
              output.accept(T7Items.ORICHALCUM_NUGGET.get());
              output.accept(T7Items.RESEARCH_SCROLL.get());
              output.accept(T7Items.COMPLETED_RESEARCH.get());
              output.accept(T7Items.THAUMOMETER.get());
              output.accept(T7Items.THAUMONOMICON.get());

              output.accept(T7Items.wand(WandHandleMaterials.IRON, WandCoreMaterials.WOOD));
              output.accept(T7Items.wand(WandHandleMaterials.GOLD, WandCoreMaterials.GREATWOOD));
              output.accept(T7Items.wand(WandHandleMaterials.ARCANUM, WandCoreMaterials.SILVERWOOD));

              output.accept(T7Items.GOGGLES.get());
              output.accept(T7Items.ARCANUM_HELMET.get());
              output.accept(T7Items.ARCANUM_CHESTPLATE.get());
              output.accept(T7Items.ARCANUM_LEGGINGS.get());
              output.accept(T7Items.ARCANUM_BOOTS.get());

              output.accept(T7Items.IGNIS_TESTA.get());
              output.accept(T7Items.AER_TESTA.get());
              output.accept(T7Items.TERRA_TESTA.get());
              output.accept(T7Items.AQUA_TESTA.get());
              output.accept(T7Items.ORDO_TESTA.get());
              output.accept(T7Items.PERDITIO_TESTA.get());

              output.accept(T7Items.ARCANUM_SWORD.get());
              output.accept(T7Items.ARCANUM_AXE.get());
              output.accept(T7Items.ARCANUM_PICKAXE.get());
              output.accept(T7Items.ARCANUM_HAMMER.get());
              output.accept(T7Items.ARCANUM_SHOVEL.get());
              output.accept(T7Items.ARCANUM_HOE.get());
              output.accept(T7Items.ARCANUM_KATANA.get());
            })
            .build()
    );
  }
}
