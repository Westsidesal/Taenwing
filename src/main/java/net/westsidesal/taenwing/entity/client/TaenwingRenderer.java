package net.westsidesal.taenwing.entity.client;

import net.westsidesal.taenwing.Taenwing;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.westsidesal.taenwing.entity.client.TaenwingModel;
import net.westsidesal.taenwing.entity.custom.TaenwingEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TaenwingRenderer extends GeoEntityRenderer<TaenwingEntity> {
    public TaenwingRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new TaenwingModel());
    }

    @Override
    public Identifier getTextureLocation(TaenwingEntity instance) {
        return new Identifier(Taenwing.MOD_ID, "textures/entity/taenwing/taenwing.png");
    }
}
