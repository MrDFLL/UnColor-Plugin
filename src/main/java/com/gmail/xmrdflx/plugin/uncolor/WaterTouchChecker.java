package com.gmail.xmrdflx.plugin.uncolor;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class WaterTouchChecker implements Runnable {

  public static ArrayList<DroppedItem> items = new ArrayList<>();
  ArrayList<DroppedItem> removeItem = new ArrayList<>();

  @Override
  public void run() {

    for (DroppedItem item : items) {
      if (item.item.getVelocity().getY() == 0 && !item.item.isInWater()
          || !item.item.isValid()) {
        removeItem.add(item);
        continue;
      }

      if (item.item.isValid() && item.item.isInWater()) {
        GivePlayer(item);
        removeItem.add(item);
      }
    }

    for (DroppedItem item : removeItem) {
      items.remove(item);
    }

    removeItem.clear();
  }

  static void GivePlayer(DroppedItem item) {
    Location location = item.item.getLocation();
    item.item.remove();

    int amount = item.item.getItemStack().getAmount();

    location.getWorld().dropItem(location, new ItemStack(item.mat.material, amount));

    if (new Random().nextInt(100) <= UnColor.dyePercent * amount) {
      location.getWorld().dropItem(location, new ItemStack(
          item.mat.dye, (int) (UnColor.dyePercent / 100.0f * amount)));
    }
  }
}
