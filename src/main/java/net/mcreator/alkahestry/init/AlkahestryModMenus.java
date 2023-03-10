
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alkahestry.init;

import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.inventory.AbstractContainerMenu;

import net.mcreator.alkahestry.world.inventory.TestGrid1Menu;
import net.mcreator.alkahestry.world.inventory.ConstructorGUIMenu;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AlkahestryModMenus {
	private static final List<MenuType<?>> REGISTRY = new ArrayList<>();
	public static final MenuType<TestGrid1Menu> TEST_GRID_1 = register("test_grid_1", (id, inv, extraData) -> new TestGrid1Menu(id, inv, extraData));
	public static final MenuType<ConstructorGUIMenu> CONSTRUCTOR_GUI = register("constructor_gui",
			(id, inv, extraData) -> new ConstructorGUIMenu(id, inv, extraData));

	private static <T extends AbstractContainerMenu> MenuType<T> register(String registryname, IContainerFactory<T> containerFactory) {
		MenuType<T> menuType = new MenuType<T>(containerFactory);
		menuType.setRegistryName(registryname);
		REGISTRY.add(menuType);
		return menuType;
	}

	@SubscribeEvent
	public static void registerContainers(RegistryEvent.Register<MenuType<?>> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new MenuType[0]));
	}
}
