package me.alegian.thaumcraft7.impl.client;

import me.alegian.thaumcraft7.impl.init.registries.T7Capabilities;
import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.EquipmentSlot;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ClientHelper {
  public static boolean isLocalPlayerWearingGoggles() {
    var player = Minecraft.getInstance().player;
    if (player == null) return false;
    var helmet = player.getItemBySlot(EquipmentSlot.HEAD);
    return helmet.getCapability(T7Capabilities.REVEALING) != null;
  }
}
