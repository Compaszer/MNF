### What does this mod do?

This mod fixes a compatibility issue between WildNature | A Wilder Experience and Oh The Biomes You'll Go (and potentially other Oh The Biomes You'll Go-compatible mods as well) that would result in a crash when not fixed.

### Technical details:

Wild Nature adds the PATCH_GRASS_SAVANNA biome feature before the badlandGrass features in the outback biome. Oh The Biomes You'll Go does it the other way round (actually only the dead_bush_2 feature is added). This results in a Feature order cycle found exception, which leads to a server crash. This mod fixes this via a simple mixin.