package net.westsidesal.taenwing;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.util.registry.Registry;
import net.westsidesal.taenwing.item.ModItems;
import net.westsidesal.taenwing.util.ModRegistries;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

public class Taenwing implements ModInitializer {
	public static final String MOD_ID = "taenwing";
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);


	@Override
	public void onInitialize() {
		GeckoLib.initialize();

		FabricDefaultAttributeRegistry.register(Declarar.TAENWING, AnimalEntity.createLivingAttributes()
				.add(EntityAttributes.GENERIC_MAX_HEALTH, 60)
				.add(EntityAttributes.GENERIC_MOVEMENT_SPEED,0.4)
				.add(EntityAttributes.GENERIC_FLYING_SPEED, 2.25)
		);
		Registry.register(Registry.ITEM,Declarar.getTaenwingId("taenwing_egg"),Declarar.TAENWING_EGG);
		ModRegistries.registerModStuffs();
	}
}

