
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alkahestry.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AlkahestryModTabs {
	public static CreativeModeTab TAB_CREATIVE_TAB;

	public static void load() {
		TAB_CREATIVE_TAB = new CreativeModeTab("tabcreative_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(AlkahestryModItems.ALKAHEST_POCKET_WATCH.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
