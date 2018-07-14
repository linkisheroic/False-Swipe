package com.natura.falseswipe;

import com.natura.falseswipe.items.FalseSwipeItems;
import com.natura.falseswipe.proxy.CommonProxy;

import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

@Mod(modid = FalseSwipe.MODID, name = FalseSwipe.MODNAME, version = FalseSwipe.VERSION, useMetadata = true, acceptedMinecraftVersions = "[1.12,1.12.2]")
public class FalseSwipe {

	public static final String MODID = "falseswipe";
    public static final String MODNAME = "False Swipe";
    public static final String VERSION = "0.1.0";
    
    @SidedProxy(clientSide = "com.natura.falseswipe.proxy.ClientProxy", serverSide = "com.natura.falseswipe.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance(MODID)
    public static FalseSwipe instance;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event); 
    	MinecraftForge.EVENT_BUS.register(FalseSwipeItems.class);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
	
}
