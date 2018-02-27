package sadnut.world;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class WorldProviderSadnut extends WorldProvider
{ 
 public void registerWorldChunkManager()
 {
 this.biomeProvider = new BiomeProviderSingle(Biomes.VOID);
 this.setDimension(WorldTypeSadnut.dimID);
 this.setAllowedSpawnTypes(false, false);
 }

 @Override
 public IChunkGenerator createChunkGenerator()
 {
 return new ChunkGeneratorSadnut(this.world);
 }

 public Biome getBiomeGenForCoords(BlockPos pos)
 {
 return Biomes.VOID;
 }

 @Override
 public boolean canRespawnHere()
 {
 return true;
 }

 @Override
 public int getRespawnDimension(EntityPlayerMP player)
 {
 return WorldTypeSadnut.dimID;
 }

 @Override
 public boolean isSurfaceWorld()
 {
 return true;
 }


 @Override
 public DimensionType getDimensionType() 
 {
 return SadnutDimensionHandler.SADNUT_DIMENSION;
 }
}