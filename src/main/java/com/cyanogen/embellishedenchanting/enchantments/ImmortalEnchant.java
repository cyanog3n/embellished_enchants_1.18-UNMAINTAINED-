package com.cyanogen.embellishedenchanting.enchantments;

import com.cyanogen.embellishedenchanting.config.Options;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.*;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;


public class ImmortalEnchant extends Enchantment {

    protected ImmortalEnchant(Enchantment.Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, pCategory , pApplicableSlots);
    }

    public static boolean isEnabled =  Options.COMMON.Immortal.get();

    @Override
    public boolean isTreasureOnly() {
        return true;
    }

    @Override
    public boolean isAllowedOnBooks() {
        return isEnabled;
    }

    @Override
    public boolean isDiscoverable() {
        return isEnabled;
    }

    @Override
    public boolean isTradeable() { return false; }

    @Override
    public boolean canEnchant(ItemStack pStack) {
        if(pStack.getItem().canBeDepleted() && !(pStack.getItem() instanceof ArmorItem)){
            return true;
        }
        else{
            return canApplyAtEnchantingTable(pStack);
        }
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 1;
    }

    public static void itemDestroyed(PlayerDestroyItemEvent event){

        ItemStack i = event.getOriginal();
        InteractionHand hand = event.getHand();

        int level = EnchantmentHelper.getItemEnchantmentLevel(_RegisterEnchants.IMMORTAL.get(),i);
        if(level == 1){
            i.setDamageValue(0);
            event.getPlayer().getEnderChestInventory().addItem(i);
        }
    }

}
