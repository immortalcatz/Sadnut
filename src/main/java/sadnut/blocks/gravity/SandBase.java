package sadnut.blocks.gravity;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class SandBase extends GravityBlockBase{

	public SandBase(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.SAND);
		
	}

}
