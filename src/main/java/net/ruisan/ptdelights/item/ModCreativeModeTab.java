package net.ruisan.ptdelights.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {

    public static final CreativeModeTab PTDELIGHTS_TAB = new CreativeModeTab("ptdelightstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FRANCESINHA.get());
        }
    };

}
