package com.cyanogen.embellishedenchanting.config;

import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class Options {

    public static class Common
    {
        private static final boolean defaultState = true;
        private static final Enchantment.Rarity COMMON = Enchantment.Rarity.COMMON;
        private static final Enchantment.Rarity UNCOMMON = Enchantment.Rarity.UNCOMMON;
        private static final Enchantment.Rarity RARE = Enchantment.Rarity.RARE;
        private static final Enchantment.Rarity VERY_RARE = Enchantment.Rarity.VERY_RARE;

        public final ForgeConfigSpec.ConfigValue<Boolean> Annihilation;
        public final ForgeConfigSpec.ConfigValue<Boolean> Antigrav;
        public final ForgeConfigSpec.ConfigValue<Boolean> Decay;
        public final ForgeConfigSpec.ConfigValue<Boolean> Grappling;
        public final ForgeConfigSpec.ConfigValue<Boolean> Hex;
        public final ForgeConfigSpec.ConfigValue<Boolean> Immortal;
        public final ForgeConfigSpec.ConfigValue<Boolean> Shockwave;
        public final ForgeConfigSpec.ConfigValue<Boolean> Shattering;
        public final ForgeConfigSpec.ConfigValue<Boolean> Stun;
        public final ForgeConfigSpec.ConfigValue<Boolean> Thunderbolt;
        public final ForgeConfigSpec.ConfigValue<Boolean> Voiding;

        public final ForgeConfigSpec.ConfigValue<Boolean> DeflagrationCurse;

        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> AnnihilationRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> AntigravRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> DecayRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> GrapplingRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> HexRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> ImmortalRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> ShockwaveRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> ShatteringRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> StunRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> ThunderboltRarity;
        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> VoidingRarity;

        public final ForgeConfigSpec.ConfigValue<Enchantment.Rarity> DeflagrationCurseRarity;


        public Common(ForgeConfigSpec.Builder builder)
        {

            //treasure
            builder.push("Annihilation");
            this.Annihilation = builder.comment("Enable or disable the Annihilation Enchantment")
                    .define("AnnihilationEnchantEnabled", defaultState);
            this.AnnihilationRarity = builder.comment("Set rarity of the Annihilation Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("AnnihilationRarity",UNCOMMON);
            builder.pop();

            //treasure
            builder.push("Antigravity");
            this.Antigrav = builder.comment("Enable or disable the Antigravity Enchantment")
                    .define("AntigravityEnchantEnabled", defaultState);
            this.AntigravRarity = builder.comment("Set rarity of the Antigravity Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("AntigravityRarity",UNCOMMON);
            builder.pop();

            //all
            builder.push("Decay");
            this.Decay = builder.comment("Enable or disable the Decay Enchantment")
                    .define("DecayEnchantEnabled", defaultState);
            this.DecayRarity = builder.comment("Set rarity of the Decay Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("DecayRarity",UNCOMMON);
            builder.pop();

            //all
            builder.push("Grappling");
            this.Grappling = builder.comment("Enable or disable the Grappling Enchantment")
                    .define("GrapplingEnchantEnabled", defaultState);
            this.GrapplingRarity = builder.comment("Set rarity of the Grappling Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("GrapplingRarity",COMMON);
            builder.pop();

            //all
            builder.push("Hex");
            this.Hex = builder.comment("Enable or disable the Hex Enchantment")
                    .define("HexEnchantEnabled", defaultState);
            this.HexRarity = builder.comment("Set rarity of the Hex Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("HexRarity",UNCOMMON);
            builder.pop();

            //all
            builder.push("Shockwave");
            this.Shockwave = builder.comment("Enable or disable the Shockwave Enchantment")
                    .define("ShockwaveEnchantEnabled", defaultState);
            this.ShockwaveRarity = builder.comment("Set rarity of the Shockwave Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("ShockwaveRarity",UNCOMMON);
            builder.pop();

            //all
            builder.push("Shattering");
            this.Shattering = builder.comment("Enable or disable the Shattering Enchantment")
                    .define("ShatteringEnchantEnabled", defaultState);
            this.ShatteringRarity = builder.comment("Set rarity of the Shattering Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("ShatteringRarity",UNCOMMON);
            builder.pop();

            //all
            builder.push("Stun");
            this.Stun = builder.comment("Enable or disable the Stun Enchantment")
                    .define("StunEnchantEnabled", defaultState);
            this.StunRarity = builder.comment("Set rarity of the Stun Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("StunRarity",UNCOMMON);
            builder.pop();

            //all
            builder.push("Voiding");
            this.Voiding = builder.comment("Enable or disable the Voiding Enchantment")
                    .define("VoidingEnchantEnabled", defaultState);
            this.VoidingRarity = builder.comment("Set rarity of the Voiding Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("VoidingRarity",COMMON);
            builder.pop();

            //loot only
            builder.push("Thunderbolt");
            this.Thunderbolt = builder.comment("Enable or disable the Thunderbolt Enchantment")
                    .define("ThunderboltEnchantEnabled", defaultState);
            this.ThunderboltRarity = builder.comment("Set rarity of the Thunderbolt Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("ThunderboltRarity",RARE);
            builder.pop();

            //loot only
            builder.push("Immortal");
            this.Immortal = builder.comment("Enable or disable the Immortal Enchantment")
                    .define("ImmortalEnchantEnabled", defaultState);
            this.ImmortalRarity = builder.comment("Set rarity of the Immortal Enchantment","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("ImmortalRarity",VERY_RARE);
            builder.pop();

            //treasure
            builder.push("Curse of Deflagration");
            this.DeflagrationCurse = builder.comment("Enable or disable Curse of Deflagration")
                    .define("DeflagrationCurseEnabled", defaultState);
            this.DeflagrationCurseRarity = builder.comment("Set rarity of Curse of Deflagration","Accepted values: COMMON, UNCOMMON, RARE, VERY_RARE")
                    .define("DeflagrationCurseRarity",UNCOMMON);
            builder.pop();
        }
    }

    public static final Common COMMON;
    public static final ForgeConfigSpec COMMON_SPEC;

    static //constructor
    {
        Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON = commonSpecPair.getLeft();
        COMMON_SPEC = commonSpecPair.getRight();
    }
}