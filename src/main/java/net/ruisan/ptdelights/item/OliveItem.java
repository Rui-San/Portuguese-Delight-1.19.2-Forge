package net.ruisan.ptdelights.item;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class OliveItem extends Item {

    public OliveItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level world, LivingEntity entityLiving) {
        if (entityLiving instanceof Player) {
            Player player = (Player) entityLiving;
            player.getInventory().add(new ItemStack(ModItems.OLIVE_SEEDS.get()));
        }
        return super.finishUsingItem(stack, world, entityLiving);
    }
}