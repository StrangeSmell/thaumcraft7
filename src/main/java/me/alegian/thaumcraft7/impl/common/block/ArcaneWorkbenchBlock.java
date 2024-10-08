package me.alegian.thaumcraft7.impl.common.block;

import me.alegian.thaumcraft7.impl.Thaumcraft;
import me.alegian.thaumcraft7.impl.common.menu.ArcaneWorkbenchMenu;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class ArcaneWorkbenchBlock extends Block {
  private static final Component CONTAINER_TITLE = Component.translatable("container." + Thaumcraft.MODID + ".arcane_workbench");

  public ArcaneWorkbenchBlock() {
    super(BlockBehaviour.Properties.ofFullCopy(Blocks.CRAFTING_TABLE));
  }

  @Override
  protected InteractionResult useWithoutItem(BlockState pState, Level pLevel, BlockPos pPos, Player pPlayer, BlockHitResult pHitResult) {
    if (pLevel.isClientSide)
      return InteractionResult.SUCCESS;
    else {
      pPlayer.openMenu(pState.getMenuProvider(pLevel, pPos));
      return InteractionResult.CONSUME;
    }
  }

  @Override
  protected MenuProvider getMenuProvider(BlockState pState, Level pLevel, BlockPos pPos) {
    return new SimpleMenuProvider(
        (pContainerId, pPlayerInventory, player) -> new ArcaneWorkbenchMenu(pContainerId, pPlayerInventory, ContainerLevelAccess.create(pLevel, pPos)),
        CONTAINER_TITLE
    );
  }

}
