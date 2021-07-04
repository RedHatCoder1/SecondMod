package com.benire.extraobbymod.block;

import com.benire.extraobbymod.ExtraObbyMod;
import com.benire.extraobbymod.util.Registration;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks
{
    public static final RegistryObject<Block> BLOCK_OF_TEARS = register("block_of_tears",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(50f,1200f)
                    .sound(SoundType.METAL)));

    public static final RegistryObject<Block> BLOCK_OF_INFERNO = register("block_of_inferno",
            () -> new Block(AbstractBlock.Properties.create(Material.IRON)
                    .hardnessAndResistance(50f,1200f)
                    .sound(SoundType.METAL)));

    public static void register(){}

    private static <T extends Block>RegistryObject<T> register(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = Registration.BLOCKS.register(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().group(ExtraObbyMod.EXTRA_OBBY_MOD)));
        return toReturn;
    }
}
