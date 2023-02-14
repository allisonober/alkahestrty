
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alkahestry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.alkahestry.item.SilexineRockItem;
import net.mcreator.alkahestry.item.LignorumFloraItem;
import net.mcreator.alkahestry.item.CrystallinumMineralItem;
import net.mcreator.alkahestry.item.AlkahestPocketWatchItem;
import net.mcreator.alkahestry.AlkahestryMod;

public class AlkahestryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AlkahestryMod.MODID);
	public static final RegistryObject<Item> ALKAHEST_POCKET_WATCH = REGISTRY.register("alkahest_pocket_watch", () -> new AlkahestPocketWatchItem());
	public static final RegistryObject<Item> LIGNORUM_FLORA = REGISTRY.register("lignorum_flora", () -> new LignorumFloraItem());
	public static final RegistryObject<Item> SILEXINE_ROCK = REGISTRY.register("silexine_rock", () -> new SilexineRockItem());
	public static final RegistryObject<Item> CRYSTALLINUM_MINERAL = REGISTRY.register("crystallinum_mineral", () -> new CrystallinumMineralItem());
}
