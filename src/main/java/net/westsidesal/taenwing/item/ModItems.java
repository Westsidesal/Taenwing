package net.westsidesal.taenwing.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.westsidesal.taenwing.Taenwing;
import net.westsidesal.taenwing.Declarar;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TAENWING_EGG = new SpawnEggItem(Declarar.TAENWING, 11141120, 5592575, new FabricItemSettings().group(ItemGroup.MISC));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Taenwing.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Taenwing.LOGGER.info("Registering Mod Items for " + Taenwing.MOD_ID);
    }

}
