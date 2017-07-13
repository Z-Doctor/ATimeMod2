package com.Router1011.ATimeMod2;

import com.Router1011.ATimeMod2.Items.ATimeItems;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = ATimeMod.modId, name = ATimeMod.name, version = ATimeMod.version, acceptedMinecraftVersions = "[1.10.2]")
public class ATimeMod {

	@SidedProxy(serverSide = "com.Router1011.ATimeMod2.CommonProxy", clientSide = "com.Router1011.ATimeMod2.ClientProxy")
	public static CommonProxy proxy;
	
	public static final String modId = "atimemod2";
	public static final String name = "AdventureTime Mod 2";
	public static final String version = "1.0";
	
	public static final ATimeTab creativeTab = new ATimeTab();
	
	@Mod.Instance(modId)
	public static ATimeMod instance;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("We're back boys.");
		ATimeItems.init();
	}
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}