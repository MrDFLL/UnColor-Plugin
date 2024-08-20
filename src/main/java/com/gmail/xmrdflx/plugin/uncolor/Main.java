package com.gmail.xmrdflx.plugin.uncolor;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

  int scheduleDelay;

  @Override
  public void onEnable() {
    LoadConfing();

    getServer().getPluginManager().registerEvents(new UnColorDetector(), this);
    Bukkit.getScheduler().runTaskTimer(this, new WaterTouchChecker(), 200, scheduleDelay);
  }

  void LoadConfing() {
    saveDefaultConfig();

    UnColor.enableWool = getConfig().getBoolean("enable-wool");
    UnColor.enableBeds = getConfig().getBoolean("enable-beds");
    UnColor.enableTerracotta = getConfig().getBoolean("enable-terracotta");
    UnColor.enableConcrete = getConfig().getBoolean("enable-concrete");
    UnColor.enableConcretePowder = getConfig().getBoolean("enable-concrete-powder");
    UnColor.dyePercent = getConfig().getInt("dye-percent");
    UnColor.needPermission = getConfig().getBoolean("need-permission");
    UnColor.permission = getConfig().getString("permission");

    if (UnColor.permission.isEmpty()) {
      UnColor.needPermission = false;
    }

    if (UnColor.dyePercent < 0)
      UnColor.dyePercent = 0;
    else if (UnColor.dyePercent > 100)
      UnColor.dyePercent = 100;

    UnColorDetector.requireSneaking = getConfig().getBoolean("require-sneaking", true);

    scheduleDelay = getConfig().getInt("run-item-check-schedule-every");
    if (scheduleDelay == 0)
      scheduleDelay = 10;
  }
}
