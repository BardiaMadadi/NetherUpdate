package com.ganeowner.netherupdate.creativemodetab;

import com.ganeowner.netherupdate.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class NetherUpdateCreativeModeTab {

    public static final CreativeModeTab NetherUpdateCreativeModeTab = new CreativeModeTab("netherupdatecreativemodetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.RAW_MAGMA_INGOT.get(),1);
        }
    };

}
