package com.compaszer.wnf.mixins;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.compaszer.wnf.WNF;

import net.matez.wildnature.common.objects.biomes.land.WNOutback;
import net.matez.wildnature.common.registry.biomes.WNBiome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;

@Mixin(WNOutback.class)
public class WNOutbackMixin {

	@Inject(method = "buildBiome", at = @At("HEAD"), cancellable = true)
	public void buildBiome(CallbackInfoReturnable<BiomeGenerationSettings.Builder> ci) {
		BiomeGenerationSettings.Builder biomeBuilder = new BiomeGenerationSettings.Builder();
		globalOverworldGeneration(biomeBuilder);
		BiomeDefaultFeatures.addBadlandGrass(biomeBuilder);
		biomeBuilder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_SAVANNA);
		WNF.LOGGER.debug("buildBiome switched PATCH_GRASS_SAVANNA with BADLAND_BUSH");
		ci.setReturnValue(biomeBuilder);
	}

	private static void globalOverworldGeneration(BiomeGenerationSettings.Builder builder) {
		BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, WNBiome.SAPPHIRE_GEODE);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, WNBiome.RUBY_GEODE);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, WNBiome.AMETHYST_GEODE);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, WNBiome.TOPAZ_GEODE);
		BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
		BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
		BiomeDefaultFeatures.addDefaultOres(builder);
		BiomeDefaultFeatures.addDefaultSoftDisks(builder);
		builder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_TALL_GRASS);
		builder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_NORMAL);
//		builder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_SAVANNA);
		builder.addFeature(Decoration.UNDERGROUND_ORES, WNBiome.AMBER_ORE);
		builder.addFeature(Decoration.UNDERGROUND_ORES, WNBiome.SILVER_ORE);
		builder.addFeature(Decoration.UNDERGROUND_ORES, WNBiome.TIN_ORE);
		BiomeDefaultFeatures.addDefaultSprings(builder);
		BiomeDefaultFeatures.addSurfaceFreezing(builder);
		WNF.LOGGER.debug("globalOverworldGeneration skipped PATCH_GRASS_SAVANNA");
	}
}
