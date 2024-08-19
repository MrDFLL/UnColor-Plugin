package com.gmail.xmrdflx.plugin.uncolor;

import org.bukkit.entity.Item;
import org.bukkit.entity.Player;

public class DroppedItem {
  public final Player player;
  public final Item item;
  public final UnColorMat mat;

  public DroppedItem(Player player, Item item, UnColorMat mat) {
    this.player = player;
    this.item = item;
    this.mat = mat;
  }
}
