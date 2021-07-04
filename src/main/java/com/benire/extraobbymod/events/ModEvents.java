package com.benire.extraobbymod.events;

import com.benire.extraobbymod.item.ModItems;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ModEvents
{
    @SubscribeEvent
    public void onBlazeSheep(AttackEntityEvent event)
    {
        if (event.getPlayer().getHeldItemMainhand().getItem() == ModItems.BLAZE_MEAT.get());
        {
            if (event.getTarget().isAlive())
            {
                LivingEntity target = (LivingEntity)event.getTarget();
                if (target instanceof BlazeEntity)
                {
                    PlayerEntity player = event.getPlayer();

                    player.getHeldItemMainhand().shrink(1);
                }
            }
        }
    }

}
