package com.natura.falseswipe.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class FalseSwipeItems {
	
	public static final CreativeTabs tabFalseSwipe = new CreativeTabs("tabFalseSwipe")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(leek);
		}
	};
	
	public static Item leek = new ItemFalseSwipeLeek("leek", "leek").setCreativeTab(tabFalseSwipe);

	//Register Items
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event)
	{
		IForgeRegistry<Item> registry = event.getRegistry();
			
		registry.register(leek);
	}

}
