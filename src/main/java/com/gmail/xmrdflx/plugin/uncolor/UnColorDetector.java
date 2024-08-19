package com.gmail.xmrdflx.plugin.uncolor;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

public class UnColorDetector implements Listener {

  public static boolean requireSneaking;
  static HashMap<UUID, Boolean> isSneaking = new HashMap<>();

  @EventHandler
  public void onPlayerToggleSneak(PlayerToggleSneakEvent event) {
    if (!requireSneaking)
      return;

    Player player = event.getPlayer();
    isSneaking.put(player.getUniqueId(), !player.isSneaking());
  }

  @EventHandler
  public void onPlayerDropItem(PlayerDropItemEvent event) {
    if (requireSneaking && !isSneaking.getOrDefault(event.getPlayer().getUniqueId(), false)) {
      return;
    }

    if (UnColor.needPermission && !event.getPlayer().hasPermission(UnColor.permission)) {
      return;
    }
    UnColorMat mat = UnColor.GetDyeMaterial(event.getItemDrop().getItemStack().getType());
    if (mat == null)
      return;

    WaterTouchChecker.items.add(new DroppedItem(event.getPlayer(), event.getItemDrop(), mat));
  }
}
