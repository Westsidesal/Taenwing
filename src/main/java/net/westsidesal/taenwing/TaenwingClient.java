package net.westsidesal.taenwing;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.westsidesal.taenwing.entity.ModEntities;
import net.westsidesal.taenwing.entity.client.TaenwingRenderer;

public class TaenwingClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.TAENWING, TaenwingRenderer::new);

    }
}
