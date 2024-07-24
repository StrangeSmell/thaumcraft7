package me.alegian.thaumcraft7.enumextension;

import me.alegian.thaumcraft7.Thaumcraft;
import net.minecraft.client.model.HumanoidModel;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;
import net.neoforged.neoforge.client.IArmPoseTransformer;

public class ThaumometerArmPose {
  private static final boolean TWO_HANDED = true;

  private static final IArmPoseTransformer ARM_POSE_TRANSFORMER = (model, entity, arm) -> {
    model.rightArm.xRot = (float) (-0.8 * Math.PI / 2);
    model.leftArm.xRot = (float) (-0.8 * Math.PI / 2);
    model.leftArm.yRot = (float) (Math.PI / 8);
    model.rightArm.yRot = (float) (-1 * Math.PI / 8);
  };

  public static final EnumProxy<HumanoidModel.ArmPose> ENUM_PARAMS = new EnumProxy<>(
      HumanoidModel.ArmPose.class, TWO_HANDED, ARM_POSE_TRANSFORMER
  );

  public static HumanoidModel.ArmPose value() {
    return HumanoidModel.ArmPose.valueOf(Thaumcraft.MODID + "_THAUMOMETER");
  }
}
