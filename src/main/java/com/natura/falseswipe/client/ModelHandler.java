package com.natura.falseswipe.client;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import static com.natura.falseswipe.items.FalseSwipeItems.*;


@SideOnly(Side.CLIENT)
public class ModelHandler {

	@SubscribeEvent
	public static void handleModelRegistry(ModelRegistryEvent event)
	{
		itemModels();
		blockModels();
	}
	
	private static void itemModels()
	{
		register(leek);
	}
	
	private static void blockModels()
	{
		
	}
	
	private static void register(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Item.REGISTRY.getNameForObject(item), "inventory"));
	}
	
	private static void register(Block block)
	{
		register(Item.getItemFromBlock(block));
	}
	
}
