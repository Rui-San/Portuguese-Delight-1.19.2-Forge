package net.ruisan.ptdelights.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.brewing.BrewingRecipe;
import net.ruisan.ptdelights.block.ModBlocks;

public class OliveOilBrewingRecipe extends BrewingRecipe {

    public OliveOilBrewingRecipe() {
        super(Ingredient.of(new ItemStack(Items.GLASS_BOTTLE)), Ingredient.of(new ItemStack(ModBlocks.OLIVE_BAG.get())), new ItemStack(ModItems.OLIVE_OIL.get()));
    }

    @Override
    public boolean isInput(ItemStack input) {
        return input.getItem() == Items.GLASS_BOTTLE;
    }

    @Override
    public boolean isIngredient(ItemStack ingredient) {
        return ingredient.getItem() == ModBlocks.OLIVE_BAG.get().asItem();
    }
}