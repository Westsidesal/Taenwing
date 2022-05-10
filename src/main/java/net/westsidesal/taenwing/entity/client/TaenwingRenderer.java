package net.westsidesal.taenwing.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.westsidesal.taenwing.entity.custom.TaenwingEntity;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class TaenwingRenderer extends GeoEntityRenderer<TaenwingEntity>
{
    public TaenwingRenderer(EntityRendererFactory.Context renderManager)
    {
        super(renderManager, new TaenwingModel());
        this.shadowRadius = 0.7F;

    }
}
