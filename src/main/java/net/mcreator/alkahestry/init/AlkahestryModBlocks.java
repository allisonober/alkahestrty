
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.alkahestry.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.alkahestry.block.ContructionTableBlock;
import net.mcreator.alkahestry.AlkahestryMod;

public class AlkahestryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AlkahestryMod.MODID);
	public static final RegistryObject<Block> CONTRUCTION_TABLE = REGISTRY.register("contruction_table", () -> new ContructionTableBlock());
}
