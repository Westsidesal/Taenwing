package net.westsidesal.taenwing.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.westsidesal.taenwing.entity.ModEntities;
import net.westsidesal.taenwing.entity.custom.TaenwingEntity;

public class ModRegistries {
    public static void registerModStuffs() {
        registerAtributes();
    }

    private static void registerAtributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.TAENWING, TaenwingEntity.setAttributes());
    }
}
