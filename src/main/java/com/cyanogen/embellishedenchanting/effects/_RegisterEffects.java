package com.cyanogen.embellishedenchanting.effects;

import com.cyanogen.embellishedenchanting.EmbellishedEnchanting;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class _RegisterEffects {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, EmbellishedEnchanting.MOD_ID);

    public static final RegistryObject<MobEffect> SENESCENCE = EFFECTS.register("senescence", SenescenceEffect::new);

    public static final RegistryObject<MobEffect> VAMPIRISM = EFFECTS.register("vampirism", VampirismEffect::new);

    public static void register(IEventBus eventBus){
        EFFECTS.register(eventBus);
    }

}
