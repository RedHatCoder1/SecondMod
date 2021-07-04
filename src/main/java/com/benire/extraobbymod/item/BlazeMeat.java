package com.benire.extraobbymod.item;

import com.benire.extraobbymod.ExtraObbyMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class BlazeMeat extends Item
{
    public BlazeMeat()
    {
        super(new Properties().group(ExtraObbyMod.EXTRA_OBBY_MOD)
        .food(new Food.Builder()
                .hunger(20)
                .saturation(20f)
                .effect(() -> new EffectInstance(Effects.FIRE_RESISTANCE, 300, 250), 0.4f)
                .build()));
    }
}
