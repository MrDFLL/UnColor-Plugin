package com.gmail.xmrdflx.plugin.uncolor;

import org.bukkit.Material;

public class UnColor {
  public static boolean enableWool, enableBeds, enableTerracotta, enableConcrete, enableConcretePowder;
  public static int dyePercent;
  public static String permission;
  public static boolean needPermission;

  static Material[] wools = new Material[] {
      Material.RED_WOOL, Material.BLUE_WOOL, Material.CYAN_WOOL, Material.GRAY_WOOL,
      Material.LIME_WOOL, Material.PINK_WOOL, Material.BLACK_WOOL, Material.BROWN_WOOL,
      Material.GREEN_WOOL, Material.ORANGE_WOOL, Material.PURPLE_WOOL, Material.YELLOW_WOOL, Material.MAGENTA_WOOL,
      Material.LIGHT_BLUE_WOOL, Material.LIGHT_GRAY_WOOL
  };

  static Material[] beds = new Material[] {
      Material.RED_BED, Material.BLUE_BED, Material.CYAN_BED, Material.GRAY_BED,
      Material.LIME_BED, Material.PINK_BED, Material.BLACK_BED, Material.BROWN_BED,
      Material.GREEN_BED, Material.ORANGE_BED, Material.PURPLE_BED, Material.YELLOW_BED, Material.MAGENTA_BED,
      Material.LIGHT_BLUE_BED, Material.LIGHT_GRAY_BED
  };

  static Material[] terracotas = new Material[] {
      Material.RED_TERRACOTTA, Material.BLUE_TERRACOTTA, Material.CYAN_TERRACOTTA, Material.GRAY_TERRACOTTA,
      Material.LIME_TERRACOTTA, Material.PINK_TERRACOTTA, Material.BLACK_TERRACOTTA, Material.BROWN_TERRACOTTA,
      Material.GREEN_TERRACOTTA, Material.ORANGE_TERRACOTTA, Material.PURPLE_TERRACOTTA, Material.YELLOW_TERRACOTTA,
      Material.MAGENTA_TERRACOTTA,
      Material.LIGHT_BLUE_TERRACOTTA, Material.LIGHT_GRAY_TERRACOTTA
  };

  static Material[] concretes = new Material[] {
      Material.RED_CONCRETE, Material.BLUE_CONCRETE, Material.CYAN_CONCRETE, Material.GRAY_CONCRETE,
      Material.LIME_CONCRETE, Material.PINK_CONCRETE, Material.BLACK_CONCRETE, Material.BROWN_CONCRETE,
      Material.GREEN_CONCRETE, Material.ORANGE_CONCRETE, Material.PURPLE_CONCRETE, Material.YELLOW_CONCRETE,
      Material.MAGENTA_CONCRETE, Material.LIGHT_BLUE_CONCRETE, Material.LIGHT_GRAY_CONCRETE
  };

  static Material[] concretePowders = new Material[] {
      Material.RED_CONCRETE_POWDER, Material.BLUE_CONCRETE_POWDER, Material.CYAN_CONCRETE_POWDER,
      Material.GRAY_CONCRETE_POWDER,
      Material.LIME_CONCRETE_POWDER, Material.PINK_CONCRETE_POWDER, Material.BLACK_CONCRETE_POWDER,
      Material.BROWN_CONCRETE_POWDER,
      Material.GREEN_CONCRETE_POWDER, Material.ORANGE_CONCRETE_POWDER, Material.PURPLE_CONCRETE_POWDER,
      Material.YELLOW_CONCRETE_POWDER,
      Material.MAGENTA_CONCRETE_POWDER, Material.LIGHT_BLUE_CONCRETE_POWDER, Material.LIGHT_GRAY_CONCRETE_POWDER
  };

  public static UnColorMat GetDyeMaterial(Material material) {
    if (enableWool && IsWool(material)) {
      return new UnColorMat(Material.WHITE_WOOL, GetWoolColor(material));
    } else if (enableBeds && IsBed(material)) {
      return new UnColorMat(Material.WHITE_BED, GetBedColor(material));
    } else if (enableTerracotta && IsTerracotta(material)) {
      return new UnColorMat(Material.WHITE_TERRACOTTA, GetTerracottaColor(material));
    } else if (enableConcrete && IsConcrete(material)) {
      return new UnColorMat(Material.WHITE_CONCRETE, GetConcreteColor(material));
    } else if (enableConcretePowder && IsConcretePowder(material)) {
      return new UnColorMat(Material.WHITE_CONCRETE_POWDER, GetConcretePowderColor(material));
    }

    return null;
  }

  static boolean IsWool(Material material) {
    for (int i = 0; i < wools.length; i++) {
      if (material == wools[i])
        return true;
    }
    return false;
  }

  static boolean IsBed(Material material) {
    for (int i = 0; i < beds.length; i++) {
      if (material == beds[i])
        return true;
    }
    return false;
  }

  static boolean IsTerracotta(Material material) {
    for (int i = 0; i < terracotas.length; i++) {
      if (material == terracotas[i])
        return true;
    }
    return false;
  }

  static boolean IsConcrete(Material material) {
    for (int i = 0; i < concretes.length; i++) {
      if (material == concretes[i])
        return true;
    }
    return false;
  }

  static boolean IsConcretePowder(Material material) {
    for (int i = 0; i < concretePowders.length; i++) {
      if (material == concretePowders[i])
        return true;
    }
    return false;
  }

  static Material GetWoolColor(Material wool) {
    switch (wool) {
      case RED_WOOL:
        return Material.RED_DYE;
      case BLUE_WOOL:
        return Material.BLUE_DYE;
      case CYAN_WOOL:
        return Material.CYAN_DYE;
      case GRAY_WOOL:
        return Material.GRAY_DYE;
      case LIME_WOOL:
        return Material.LIME_DYE;
      case PINK_WOOL:
        return Material.PINK_DYE;
      case BLACK_WOOL:
        return Material.BLACK_DYE;
      case BROWN_WOOL:
        return Material.BROWN_DYE;
      case GREEN_WOOL:
        return Material.GREEN_DYE;
      case ORANGE_WOOL:
        return Material.ORANGE_DYE;
      case PURPLE_WOOL:
        return Material.PURPLE_DYE;
      case YELLOW_WOOL:
        return Material.YELLOW_DYE;
      case MAGENTA_WOOL:
        return Material.MAGENTA_DYE;
      case LIGHT_BLUE_WOOL:
        return Material.LIGHT_BLUE_DYE;
      case LIGHT_GRAY_WOOL:
        return Material.LIGHT_GRAY_DYE;

      default:
        return Material.AIR;
    }
  }

  static Material GetBedColor(Material bed) {
    switch (bed) {
      case RED_BED:
        return Material.RED_DYE;
      case BLUE_BED:
        return Material.BLUE_DYE;
      case CYAN_BED:
        return Material.CYAN_DYE;
      case GRAY_BED:
        return Material.GRAY_DYE;
      case LIME_BED:
        return Material.LIME_DYE;
      case PINK_BED:
        return Material.PINK_DYE;
      case BLACK_BED:
        return Material.BLACK_DYE;
      case BROWN_BED:
        return Material.BROWN_DYE;
      case GREEN_BED:
        return Material.GREEN_DYE;
      case ORANGE_BED:
        return Material.ORANGE_DYE;
      case PURPLE_BED:
        return Material.PURPLE_DYE;
      case YELLOW_BED:
        return Material.YELLOW_DYE;
      case MAGENTA_BED:
        return Material.MAGENTA_DYE;
      case LIGHT_BLUE_BED:
        return Material.LIGHT_BLUE_DYE;
      case LIGHT_GRAY_BED:
        return Material.LIGHT_GRAY_DYE;

      default:
        return Material.AIR;
    }
  }

  static Material GetTerracottaColor(Material terracotta) {
    switch (terracotta) {
      case RED_TERRACOTTA:
        return Material.RED_DYE;
      case BLUE_TERRACOTTA:
        return Material.BLUE_DYE;
      case CYAN_TERRACOTTA:
        return Material.CYAN_DYE;
      case GRAY_TERRACOTTA:
        return Material.GRAY_DYE;
      case LIME_TERRACOTTA:
        return Material.LIME_DYE;
      case PINK_TERRACOTTA:
        return Material.PINK_DYE;
      case BLACK_TERRACOTTA:
        return Material.BLACK_DYE;
      case BROWN_TERRACOTTA:
        return Material.BROWN_DYE;
      case GREEN_TERRACOTTA:
        return Material.GREEN_DYE;
      case ORANGE_TERRACOTTA:
        return Material.ORANGE_DYE;
      case PURPLE_TERRACOTTA:
        return Material.PURPLE_DYE;
      case YELLOW_TERRACOTTA:
        return Material.YELLOW_DYE;
      case MAGENTA_TERRACOTTA:
        return Material.MAGENTA_DYE;
      case LIGHT_BLUE_TERRACOTTA:
        return Material.LIGHT_BLUE_DYE;
      case LIGHT_GRAY_TERRACOTTA:
        return Material.LIGHT_GRAY_DYE;

      default:
        return Material.AIR;
    }
  }

  static Material GetConcreteColor(Material concrete) {
    switch (concrete) {
      case RED_CONCRETE:
        return Material.RED_DYE;
      case BLUE_CONCRETE:
        return Material.BLUE_DYE;
      case CYAN_CONCRETE:
        return Material.CYAN_DYE;
      case GRAY_CONCRETE:
        return Material.GRAY_DYE;
      case LIME_CONCRETE:
        return Material.LIME_DYE;
      case PINK_CONCRETE:
        return Material.PINK_DYE;
      case BLACK_CONCRETE:
        return Material.BLACK_DYE;
      case BROWN_CONCRETE:
        return Material.BROWN_DYE;
      case GREEN_CONCRETE:
        return Material.GREEN_DYE;
      case ORANGE_CONCRETE:
        return Material.ORANGE_DYE;
      case PURPLE_CONCRETE:
        return Material.PURPLE_DYE;
      case YELLOW_CONCRETE:
        return Material.YELLOW_DYE;
      case MAGENTA_CONCRETE:
        return Material.MAGENTA_DYE;
      case LIGHT_BLUE_CONCRETE:
        return Material.LIGHT_BLUE_DYE;
      case LIGHT_GRAY_CONCRETE:
        return Material.LIGHT_GRAY_DYE;

      default:
        return Material.AIR;
    }
  }

  static Material GetConcretePowderColor(Material concretePowder) {
    switch (concretePowder) {
      case RED_CONCRETE_POWDER:
        return Material.RED_DYE;
      case BLUE_CONCRETE_POWDER:
        return Material.BLUE_DYE;
      case CYAN_CONCRETE_POWDER:
        return Material.CYAN_DYE;
      case GRAY_CONCRETE_POWDER:
        return Material.GRAY_DYE;
      case LIME_CONCRETE_POWDER:
        return Material.LIME_DYE;
      case PINK_CONCRETE_POWDER:
        return Material.PINK_DYE;
      case BLACK_CONCRETE_POWDER:
        return Material.BLACK_DYE;
      case BROWN_CONCRETE_POWDER:
        return Material.BROWN_DYE;
      case GREEN_CONCRETE_POWDER:
        return Material.GREEN_DYE;
      case ORANGE_CONCRETE_POWDER:
        return Material.ORANGE_DYE;
      case PURPLE_CONCRETE_POWDER:
        return Material.PURPLE_DYE;
      case YELLOW_CONCRETE_POWDER:
        return Material.YELLOW_DYE;
      case MAGENTA_CONCRETE_POWDER:
        return Material.MAGENTA_DYE;
      case LIGHT_BLUE_CONCRETE_POWDER:
        return Material.LIGHT_BLUE_DYE;
      case LIGHT_GRAY_CONCRETE_POWDER:
        return Material.LIGHT_GRAY_DYE;

      default:
        return Material.AIR;
    }
  }
}
