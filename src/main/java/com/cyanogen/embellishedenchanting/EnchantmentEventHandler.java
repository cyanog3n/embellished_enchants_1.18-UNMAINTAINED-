package com.cyanogen.embellishedenchanting;

import com.cyanogen.embellishedenchanting.enchantments.DeflagrationCurseEnchant;
import com.cyanogen.embellishedenchanting.enchantments.ImmortalEnchant;
import com.cyanogen.embellishedenchanting.enchantments.VoidingEnchant;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class EnchantmentEventHandler {

    //for immortal enchant
    @SubscribeEvent
    public void onBreak(PlayerDestroyItemEvent event) {
        ImmortalEnchant.itemDestroyed(event);
    }

    //for deflagration curse
    @SubscribeEvent
    public void onBreakCurse(PlayerDestroyItemEvent event) {
        DeflagrationCurseEnchant.itemDestroyed(event);
    }

    @SubscribeEvent
    public void onDestroyBlockVoiding(BlockEvent.BreakEvent event){
        VoidingEnchant.onBreakBlock(event);
    }

}
