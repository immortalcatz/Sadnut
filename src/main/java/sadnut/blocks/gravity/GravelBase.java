package sadnut.blocks.gravity;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class GravelBase extends GravityBlockBase{

	public GravelBase(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.GROUND);
	}

}
