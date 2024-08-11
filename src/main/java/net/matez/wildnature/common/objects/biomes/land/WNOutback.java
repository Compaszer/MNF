package net.matez.wildnature.common.objects.biomes.land;

import net.matez.wildnature.common.registry.biomes.WNBiome;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;

public class WNOutback extends WNBiome {
	public net.minecraft.world.level.biome.BiomeGenerationSettings.Builder buildBiome() {
		net.minecraft.world.level.biome.BiomeGenerationSettings.Builder biomeBuilder = new net.minecraft.world.level.biome.BiomeGenerationSettings.Builder();
		globalOverworldGeneration(biomeBuilder);
		BiomeDefaultFeatures.addBadlandGrass(biomeBuilder);
		return biomeBuilder;
	}
}
