package com.cyanogen.embellishedenchanting.enchantments;

import com.cyanogen.embellishedenchanting.EmbellishedEnchanting;
import com.cyanogen.embellishedenchanting.config.Options;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class _RegisterEnchants {

    public static final DeferredRegister<Enchantment> ENCHANTS = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, EmbellishedEnchanting.MOD_ID);


    //---ONLY OBTAINABLE THROUGH LOOT---//

    public static final RegistryObject<Enchantment> THUNDERBOLT = ENCHANTS.register("thunderbolt", () -> new ThunderboltEnchant(
            Options.COMMON.ThunderboltRarity.get(),
            EnchantmentCategory.BOW,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND }
            //todo: disable effect triggering by punching, in a more reliable manner
    ));

    public static final RegistryObject<Enchantment> IMMORTAL = ENCHANTS.register("immortal", () -> new ImmortalEnchant(
            Options.COMMON.ImmortalRarity.get(),
            EnchantmentCategory.DIGGER,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND }
    ));

    //---TREASURE---//

    public static final RegistryObject<Enchantment> ANNIHILATION = ENCHANTS.register("annihilation", () -> new AnnihilationEnchant(
            Options.COMMON.AnnihilationRarity.get(),
            EnchantmentCategory.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND}
    ));

    public static final RegistryObject<Enchantment> ANTIGRAVITY = ENCHANTS.register("antigravity", () -> new AntigravityEnchant(
            Options.COMMON.AntigravRarity.get(),
            EnchantmentCategory.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND}
    ));

    public static final RegistryObject<Enchantment> DEFLAGRATION_CURSE = ENCHANTS.register("deflagration_curse", () -> new DeflagrationCurseEnchant(
            Options.COMMON.DeflagrationCurseRarity.get(),
            EnchantmentCategory.DIGGER,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND }
    ));

    //---OBTAINABLE NORMALLY---//

    public static final RegistryObject<Enchantment> DECAY = ENCHANTS.register("decay", () -> new DecayEnchant(
            Options.COMMON.DecayRarity.get(),
            EnchantmentCategory.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND}
    ));


    public static final RegistryObject<Enchantment> HEX = ENCHANTS.register("hex", () -> new HexEnchant(
            Options.COMMON.HexRarity.get(),
            EnchantmentCategory.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND}

    ));

    public static final RegistryObject<Enchantment> STUN = ENCHANTS.register("stun", () -> new StunEnchant(
            Options.COMMON.StunRarity.get(),
            EnchantmentCategory.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND}

    ));

    public static final RegistryObject<Enchantment> GRAPPLING = ENCHANTS.register("grappling", () -> new GrapplingEnchant(
            Options.COMMON.GrapplingRarity.get(),
            EnchantmentCategory.CROSSBOW,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND, EquipmentSlot.OFFHAND }
    ));

    public static final RegistryObject<Enchantment> SHATTERING = ENCHANTS.register("blurse_of_shattering", () -> new ShatteringEnchant(
            Options.COMMON.ShatteringRarity.get(),
            EnchantmentCategory.WEAPON,
            new EquipmentSlot[]{ EquipmentSlot.MAINHAND }
    ));

    //---UNOBTAINABLE---//


    public static void register(IEventBus eventBus){
        ENCHANTS.register(eventBus);
    }

}
