package net.ruisan.ptdelights.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.BowlFoodItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ruisan.ptdelights.ptdelights;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ptdelights.MOD_ID);

    public static final RegistryObject<Item> OLIVES = ITEMS.register("olives",
            () -> new OliveItem(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.OLIVES) ));

    public static final RegistryObject<Item> OLIVE_SEEDS = ITEMS.register("olive_seeds",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)));

    public static final RegistryObject<Item> OLIVE_OIL = ITEMS.register("olive_oil",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)));


    public static final RegistryObject<Item> FRANCESINHA = ITEMS.register("francesinha",
            () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.FRANCESINHA)));

    public static final RegistryObject<Item> BIFANA = ITEMS.register("bifana",
            () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.BIFANA)));

    public static final RegistryObject<Item> CHORIZO = ITEMS.register("chorizo",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.CHORIZO)));

    public static final RegistryObject<Item> SARDINE = ITEMS.register("sardine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.SARDINE)));

    public static final RegistryObject<Item> CALDO_VERDE = ITEMS.register("caldo_verde",
            () -> new BowlFoodItem(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.CALDO_VERDE)));

    public static final RegistryObject<Item> COOKED_SARDINE = ITEMS.register("cooked_sardine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.COOKED_SARDINE)));

    public static final RegistryObject<Item> TART_CRUST = ITEMS.register("tart_crust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.TART_CRUST)));

    public static final RegistryObject<Item> BELEM_TART = ITEMS.register("belem_tart",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.BELEM_TART)));

    public static final RegistryObject<Item> TRIPES = ITEMS.register("tripes",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.TRIPES)));

    public static final RegistryObject<Item> COOKED_PIGLET = ITEMS.register("cooked_piglet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.COOKED_PIGLET)));

    public static final RegistryObject<Item> LEITAO = ITEMS.register("leitao",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)
                    .food(ModFoods.LEITAO)));

    public static final RegistryObject<Item> DEAD_PIGLET = ITEMS.register("dead_piglet",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PTDELIGHTS_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
