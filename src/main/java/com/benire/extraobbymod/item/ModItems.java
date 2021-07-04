package com.benire.extraobbymod.item;

import com.benire.extraobbymod.ExtraObbyMod;
import com.benire.extraobbymod.util.Registration;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;

public class ModItems
{
    public static final RegistryObject<Item> TEAR_INGOT =
            Registration.ITEMS.register("tear_ingot",
                    () -> new Item(new Item.Properties().group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> INFERNO_INGOT =
            Registration.ITEMS.register("inferno_ingot",
                    () -> new Item(new Item.Properties().group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> BLAZE_ESSENCE =
            Registration.ITEMS.register("blaze_essence",
                    () -> new Item(new Item.Properties().group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> BLAZE_MEAT =
            Registration.ITEMS.register("blaze_meat",
                    () -> new BlazeMeat());
//            TOOLS

    public static final RegistryObject<Item> SHOVEL_OF_TEARS =
            Registration.ITEMS.register("shovel_of_tears",
                    () -> new ShovelItem(ModItemTier.TEARS, 4.75f, -2.5f,
                            new Item.Properties()
                                .defaultMaxDamage(1796)
                                .addToolType(ToolType.SHOVEL, 2)
                                .group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> SWORD_OF_TEARS =
            Registration.ITEMS.register("sword_of_tears",
                    () -> new SwordItem(ModItemTier.TEARS, 7, -2.4f,
                            new Item.Properties()
                                    .defaultMaxDamage(1796)
                                    .group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> AXE_OF_TEARS =
            Registration.ITEMS.register("axe_of_tears",
                    () -> new AxeItem(ModItemTier.TEARS, 8.5f, -3f,
                            new Item.Properties()
                                    .defaultMaxDamage(1796)
                                    .addToolType(ToolType.AXE, 2)
                                    .group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> PICKAXE_OF_TEARS =
            Registration.ITEMS.register("pickaxe_of_tears",
                    () -> new PickaxeItem(ModItemTier.TEARS, 5, -2.8f,
                            new Item.Properties()
                                    .defaultMaxDamage(1796)
                                    .addToolType(ToolType.PICKAXE, 4)
                                    .group(ExtraObbyMod.EXTRA_OBBY_MOD)));

    public static final RegistryObject<Item> HOE_OF_TEARS =
            Registration.ITEMS.register("hoe_of_tears",
                    () -> new HoeItem(ModItemTier.TEARS, 1, 0f,
                            new Item.Properties()
                                    .defaultMaxDamage(1796)
                                    .addToolType(ToolType.HOE, 2)
                                    .group(ExtraObbyMod.EXTRA_OBBY_MOD)));








    public static void register() {}

    ;public enum ModItemTier implements IItemTier {
        TEARS(4, 1796, 7f, 0f, 25, Ingredient.fromStacks(new ItemStack(ModItems.TEAR_INGOT.get())));

        private final int harvestLevel;
        private final int maxUses;
        private final float efficiency;
        private final float attackDamage;
        private final int enchantability;
        private final Ingredient repairMaterial;

    ModItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Ingredient repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
        public int getMaxUses() {
            return maxUses;
        }

        @Override
        public float getEfficiency() {
            return efficiency;
        }

        @Override
        public float getAttackDamage() {
            return attackDamage;
        }

        @Override
        public int getHarvestLevel() {
            return harvestLevel;
        }

        @Override
        public int getEnchantability() {
            return enchantability;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return repairMaterial;
        }
    }

}
