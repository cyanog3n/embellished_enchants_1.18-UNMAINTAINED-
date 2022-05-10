package com.cyanogen.embellishedenchanting.effects;

import com.cyanogen.embellishedenchanting.effects.SenescenceEffect;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.event.entity.living.LivingHealEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EffectEventHandler {

    @SubscribeEvent
    public void onHeal(LivingHealEvent event){
        SenescenceEffect.livingOnHeal(event);
    }

    @SubscribeEvent
    public void onAttack(PlayerInteractEvent event) { VampirismEffect.playerOnAttack(event); }
}
