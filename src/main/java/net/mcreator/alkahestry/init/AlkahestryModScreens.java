
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alkahestry.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import net.mcreator.alkahestry.client.gui.TestGrid1Screen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AlkahestryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(AlkahestryModMenus.TEST_GRID_1, TestGrid1Screen::new);
		});
	}
}
