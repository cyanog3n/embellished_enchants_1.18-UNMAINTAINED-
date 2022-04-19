package com.cyanogen.embellishedenchanting.enchantments;

import com.cyanogen.embellishedenchanting.config.Options;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.entity.PartEntity;

public class HexEnchant extends Enchantment{

    protected HexEnchant(Enchantment.Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot[] pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    public static boolean isEnabled =  Options.COMMON.Hex.get();

    @Override
    public boolean isAllowedOnBooks() {
        return isEnabled;
    }

    @Override
    public boolean isDiscoverable() {
        return isEnabled;
    }

    @Override
    public boolean isTradeable() { return isEnabled; }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 4;
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack) {
        if(isEnabled){
            return stack.canApplyAtEnchantingTable(this);
        }
        else{
            return false;
        }
    }

    @Override
    protected boolean checkCompatibility(Enchantment pOther) {

        return pOther != _RegisterEnchants.ANNIHILATION.get() && pOther != Enchantments.SHARPNESS && pOther != this;

    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {

        ItemStack heldItem = pAttacker.getMainHandItem();
        float attackDamage = 1f;

        if(heldItem.getItem() instanceof SwordItem sword){
            attackDamage = sword.getDamage() + 1;
        }

        pTarget.hurt(DamageSource.mobAttack(pAttacker), attackDamage); //normal attack

        if(pTarget instanceof LivingEntity target){

            float health = target.getMaxHealth();
            float magicDamage = 0.01f * health * pLevel;

            if(magicDamage <= 20){
                target.hurt(DamageSource.MAGIC, magicDamage);
            }
            else{
                target.hurt(DamageSource.MAGIC, 20); //caps out at 20 additional damage
            }
        }
        else if(pTarget instanceof PartEntity<?> t && t.getParent() instanceof LivingEntity target){
            //if entity is a component of a multipart eg. enderdragon

            float health = target.getMaxHealth();
            float magicDamage = 0.01f * health * pLevel;

            if(magicDamage <= 20){
                target.hurt(DamageSource.MAGIC, magicDamage);
            }
            else{
                target.hurt(DamageSource.MAGIC, 20);
            }

        }

    }
}
