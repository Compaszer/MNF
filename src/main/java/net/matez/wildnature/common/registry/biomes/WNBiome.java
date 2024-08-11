package net.matez.wildnature.common.registry.biomes;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.BiomeDefaultFeatures;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.biome.BiomeGenerationSettings.Builder;
import net.minecraft.world.level.levelgen.GenerationStep.Decoration;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class WNBiome {
	protected static void globalOverworldGeneration(Builder builder) {
		System.err.println("rofl");
		BiomeDefaultFeatures.addDefaultCarversAndLakes(builder);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, SAPPHIRE_GEODE);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, RUBY_GEODE);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, AMETHYST_GEODE);
		builder.addFeature(Decoration.LOCAL_MODIFICATIONS, TOPAZ_GEODE);
		BiomeDefaultFeatures.addDefaultMonsterRoom(builder);
		BiomeDefaultFeatures.addDefaultUndergroundVariety(builder);
		BiomeDefaultFeatures.addDefaultOres(builder);
		BiomeDefaultFeatures.addDefaultSoftDisks(builder);
		builder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_TALL_GRASS);
		builder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_NORMAL);
		builder.addFeature(Decoration.VEGETAL_DECORATION, VegetationPlacements.PATCH_GRASS_SAVANNA);
		builder.addFeature(Decoration.UNDERGROUND_ORES, AMBER_ORE);
		builder.addFeature(Decoration.UNDERGROUND_ORES, SILVER_ORE);
		builder.addFeature(Decoration.UNDERGROUND_ORES, TIN_ORE);
		BiomeDefaultFeatures.addDefaultSprings(builder);
		BiomeDefaultFeatures.addSurfaceFreezing(builder);
	}

	public static final Holder<PlacedFeature> MARBLE = null;
	public static final Holder<PlacedFeature> GNEISS = null;
	public static final Holder<PlacedFeature> LIMESTONE = null;
	public static final Holder<PlacedFeature> SLATE_BLUE = null;
	public static final Holder<PlacedFeature> SLATE_PURPLE = null;
	public static final Holder<PlacedFeature> QUARTZITE = null;
	public static final Holder<PlacedFeature> BASANITE = null;
	public static final Holder<PlacedFeature> AMBER_ORE = null;
	public static final Holder<PlacedFeature> SILVER_ORE = null;
	public static final Holder<PlacedFeature> TIN_ORE = null;
	public static final Holder<PlacedFeature> AMETHYST_GEODE = null;
	public static final Holder<PlacedFeature> TOPAZ_GEODE = null;
	public static final Holder<PlacedFeature> RUBY_GEODE = null;
	public static final Holder<PlacedFeature> SAPPHIRE_GEODE = null;
	public static final Holder<PlacedFeature>[] UNDER_SURFACE_DECORATION = null;
	public static final Holder<PlacedFeature>[] LUSH_CAVE_DECORATION = null;
	public static final Holder<PlacedFeature>[] DRIPSTONE_DECORATION = null;
	public static final Holder<PlacedFeature>[] DEEPSLATE_DECORATION = null;
}
