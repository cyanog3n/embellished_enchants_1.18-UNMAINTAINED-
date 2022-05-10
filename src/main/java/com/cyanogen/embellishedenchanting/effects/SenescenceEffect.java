package com.cyanogen.embellishedenchanting.effects;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.event.entity.living.LivingHealEvent;

public class SenescenceEffect extends MobEffect {

    public SenescenceEffect() {
        super(MobEffectCategory.HARMFUL, 3874864);
    }

    public static void livingOnHeal(LivingHealEvent event) {
        if(event.getEntityLiving().hasEffect(_RegisterEffects.SENESCENCE.get())){

            event.setCanceled(true);
        }
    }

    @Override
    public void applyEffectTick(LivingEntity living, int amplifier) {
        super.applyEffectTick(living, amplifier);
    }
}
