package net.westsidesal.taenwing.entity.client;

import net.westsidesal.taenwing.Taenwing;
import net.westsidesal.taenwing.entity.custom.TaenwingEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class TaenwingModel extends AnimatedGeoModel<TaenwingEntity> {
    @Override
    public Identifier getModelLocation(TaenwingEntity object) {
        return new Identifier(Taenwing.MOD_ID, "geo/taenwing.geo.json");
    }

    @Override
    public Identifier getTextureLocation(TaenwingEntity object) {
        return new Identifier(Taenwing.MOD_ID, "textures/entity/taenwing/taenwing.png");
    }

    @Override
    public Identifier getAnimationFileLocation(TaenwingEntity animatable) {
        return new Identifier(Taenwing.MOD_ID, "geo/taenwing.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(TaenwingEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("Head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}