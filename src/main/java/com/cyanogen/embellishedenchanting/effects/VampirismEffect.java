package com.cyanogen.embellishedenchanting.effects;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;


public class VampirismEffect extends MobEffect {

    public VampirismEffect() {
        super(MobEffectCategory.NEUTRAL, 16726072);
    }

    public static void playerOnAttack(PlayerInteractEvent event) {
        event.getEntityLiving();

    }


    @Override
    public void applyEffectTick(LivingEntity living, int amplifier) {
        super.applyEffectTick(living, amplifier);

        Level level = living.level;
        BlockPos pos = living.blockPosition();

        System.out.println(pos);

        if(level.canSeeSky(pos)){
            living.setSecondsOnFire(amplifier);
        }
    }


}
