package com.compaszer.wnf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.matez.wildnature.common.objects.biomes.land.WNOutback;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(value = WNF.MODID)
@Mod.EventBusSubscriber(modid = WNF.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class WNF {

	public static final String MODID = "wnf";
	public static WNF instance;

	public static final Logger LOGGER = LogManager.getLogger();

	public WNF() {
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

		instance = this;
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void setup(final FMLCommonSetupEvent event) {
		WNOutback wo = new WNOutback();
		wo.buildBiome();
	}
}
