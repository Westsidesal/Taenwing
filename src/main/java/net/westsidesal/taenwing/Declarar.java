package net.westsidesal.taenwing;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.westsidesal.taenwing.entity.custom.TaenwingEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Declarar {
    public static String MOD_ID = "taenwing";

    public static Identifier getTaenwingId(String path) {
        return new Identifier(MOD_ID, path);
    }

    public static final EntityType<TaenwingEntity> TAENWING = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Taenwing.MOD_ID, "taenwing"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TaenwingEntity::new).dimensions(EntityDimensions.fixed((float) 0.4, (float) 0.3)).build());

    public static final Item TAENWING_EGG = new SpawnEggItem(Declarar.TAENWING, 11141120, 5592575, new FabricItemSettings().group(ItemGroup.MISC));



}
