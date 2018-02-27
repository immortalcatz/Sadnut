package sadnut.world;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiCreateWorld;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldTypeSadnut extends WorldType
{
    public WorldTypeSadnut(int nextID, String name){
    	super(name);
    	this.hasInfoNotice();
    }
    public static int getNextID()
    {
        for (int x = 0; x < WORLD_TYPES.length; x++)
        {
            if (WORLD_TYPES[x] == null)
            {
                return x;
            }
        }

        int oldLen = WORLD_TYPES.length;
        WORLD_TYPES = java.util.Arrays.copyOf(WORLD_TYPES, oldLen + 16);
        return oldLen;
    }

    public static int dimID = getNextID();
 
    @Override
    public BiomeProvider getBiomeProvider(World world) {
    	return new BiomeProviderSadnut();
    }
    
    @Override
    public IChunkGenerator getChunkGenerator(World world, String generatorOptions) {
    	return new ChunkGeneratorSadnut(world);
    }
    
    @Override
    public boolean isCustomizable() {
    	return false;
    }
    
    

    
}