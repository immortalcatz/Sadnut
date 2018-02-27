package sadnut.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class StoneBase extends BlockBase{
	public StoneBase(String name, Material material) {

	    super(name, material);

		setSoundType(SoundType.STONE);
	}
}
