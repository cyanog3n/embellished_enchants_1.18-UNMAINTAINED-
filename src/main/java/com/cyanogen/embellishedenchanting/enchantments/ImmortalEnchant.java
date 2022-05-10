package com.cyanogen.embellishedenchanting.enchantments;

import com.cyanogen.embellishedenchanting.config.Options;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.enchantment.*;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDamageEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;


public class ImmortalEnchant extends Enchantment {

    protected ImmortalEnchant(Enchantment.Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, pCategory , pApplicableSlots);
    }

    public static boolean isEnabled =  Options.COMMON.Immortal.get();

    public static void totemPopped(LivingDamageEvent event) {

        LivingEntity living = event.getEntityLiving();
        Level level = living.level;
        BlockPos pos = living.blockPosition();

        ItemStack mainhand = living.getItemBySlot(EquipmentSlot.MAINHAND);
        ItemStack offhand = living.getItemBySlot(EquipmentSlot.OFFHAND);

        ItemStack stack = new ItemStack(Items.ENCHANTED_BOOK,1);
        stack.enchant(_RegisterEnchants.IMMORTAL.get(), 1);

        if(living instanceof Player && event.getAmount() >= living.getHealth()){
            if(mainhand.is(Items.TOTEM_OF_UNDYING) || offhand.is(Items.TOTEM_OF_UNDYING)){
                System.out.println("totem popped");

                ServerLevel server = (ServerLevel) level;
                if(Math.random() <= 0.35d){
                    server.addFreshEntity(new ItemEntity(server, pos.getX(), pos.getY(), pos.getZ(), stack, 0,0,0));
                }

            }
        }


    }

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
        return false;
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
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        return super.canApplyAtEnchantingTable(stack);
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
