//package com.compaszer.wnf.mixins;
//
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.Shadow;
//import org.spongepowered.asm.mixin.injection.At;
//import org.spongepowered.asm.mixin.injection.Inject;
//import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
//
//import com.compaszer.wnf.WNF;
//
//import net.matez.wildnature.common.objects.biomes.setup.WNBiomeBuilder;
//import net.matez.wildnature.common.objects.biomes.setup.WNVanillaBiomeExtension;
//import net.minecraft.resources.ResourceKey;
//import net.minecraft.world.level.biome.Biome;
//import net.minecraftforge.common.BiomeDictionary;
//import net.minecraftforge.common.BiomeManager;
//
//@Mixin(WNVanillaBiomeExtension.class)
//public class WNVanillaBiomeExtensionMixin {
//
//	@Shadow
//	private WNBiomeBuilder builder;
//
//	@Inject(method = "postRegister", at = @At("HEAD"), cancellable = true)
//	public void postRegister(ResourceKey<Biome> key, CallbackInfo ci) {
//		BiomeDictionary.addTypes(key, this.builder.getAdditionalTypes().toArray(new BiomeDictionary.Type[0]));
//		BiomeManager.BiomeType type = BiomeManager.BiomeType.WARM;
//
//		if (builder.getAdditionalTypes().contains(BiomeDictionary.Type.SANDY) || builder.getAdditionalTypes().contains(BiomeDictionary.Type.SAVANNA)) {
//			type = BiomeManager.BiomeType.DESERT;
//		} else if (builder.getAdditionalTypes().contains(BiomeDictionary.Type.COLD)) {
//			if (builder.getAdditionalTypes().contains(BiomeDictionary.Type.SNOWY)) {
//				type = BiomeManager.BiomeType.ICY;
//			} else {
//				type = BiomeManager.BiomeType.COOL;
//			}
//		}
//		BiomeManager.addBiome(type, new BiomeManager.BiomeEntry(key, 2));
//		WNF.LOGGER.debug("EXECUTED WNF WNVanillaBiomeExtensionMixin");
//		ci.cancel();
//	}
//}
