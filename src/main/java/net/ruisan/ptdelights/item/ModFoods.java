package net.ruisan.ptdelights.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class ModFoods {

    public static final FoodProperties OLIVES = (new FoodProperties.Builder()).fast().nutrition(1).saturationMod(0.1F).build();
    public static final FoodProperties SARDINE = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.1F).build();
    public static final FoodProperties COOKED_SARDINE = (new FoodProperties.Builder()).nutrition(5).saturationMod(0.6F).build();
    public static final FoodProperties FRANCESINHA = (new FoodProperties.Builder()).nutrition(20).saturationMod(1.0F).build();
    public static final FoodProperties TRIPES = (new FoodProperties.Builder()).nutrition(2).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.POISON, 600, 0), 1.0F).meat().build();
    public static final FoodProperties BIFANA = (new FoodProperties.Builder()).nutrition(10).saturationMod(0.5F).build();
    public static final FoodProperties CHORIZO = (new FoodProperties.Builder()).nutrition(9).saturationMod(0.5F).effect(new MobEffectInstance(MobEffects.POISON, 200, 0), 0.1F).meat().build();
    public static final FoodProperties CALDO_VERDE = (new FoodProperties.Builder()).nutrition(10).saturationMod(5.0F).build();
    public static final FoodProperties TART_CRUST = (new FoodProperties.Builder()).nutrition(1).saturationMod(0.0F).effect(new MobEffectInstance(MobEffects.POISON, 200, 0), 0.3F).meat().build();
    public static final FoodProperties BELEM_TART = (new FoodProperties.Builder()).fast().nutrition(4).saturationMod(0.5F).build();

    public static final FoodProperties COOKED_PIGLET = (new FoodProperties.Builder()).nutrition(12).saturationMod(0.6F).build();

    public static final FoodProperties LEITAO = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.2F).build();


}
