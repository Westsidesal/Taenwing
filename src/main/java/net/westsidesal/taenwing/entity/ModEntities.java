package net.westsidesal.taenwing.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.westsidesal.taenwing.Taenwing;
import net.westsidesal.taenwing.entity.custom.TaenwingEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<TaenwingEntity> TAENWING = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Taenwing.MOD_ID, "taenwing"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, TaenwingEntity::new).dimensions(EntityDimensions.fixed((float) 0.4, (float) 0.3)).build());


;
}
