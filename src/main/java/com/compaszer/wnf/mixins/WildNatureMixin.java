package com.compaszer.wnf.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.compaszer.wnf.WNF;

import net.matez.wildnature.common.registry.biomes.WNRegion;
import net.matez.wildnature.common.registry.biomes.WNSurfaceConstructor;
import net.matez.wildnature.setup.WildNature;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.SurfaceRuleManager.RuleCategory;

@Mixin(WildNature.class)
public class WildNatureMixin {

	@Inject(method = "terraBlender", at = @At("HEAD"), cancellable = true)
	public void terraBlender(FMLCommonSetupEvent event, CallbackInfo ci) {
		event.enqueueWork(WildNatureMixin::work);
		WNF.LOGGER.debug("EXECUTED WNF WildNatureMixin");
		ci.cancel();
	}

	private static void work() {
		Regions.register(new WNRegion(new ResourceLocation("wildnature", "overworld"), 10));
		SurfaceRuleManager.addSurfaceRules(RuleCategory.OVERWORLD, "wildnature", WNSurfaceConstructor.makeRules());
	}
}
