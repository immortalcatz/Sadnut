package sadnut.init;

import net.minecraftforge.fml.common.registry.GameRegistry;
import sadnut.potion.PotionBleed;

public class ModPotions {
    @GameRegistry.ObjectHolder("mobultion:blessed_potion")
    public static PotionBleed potionBleed;

    public static void init(){
        potionBleed = new PotionBleed();
    }
}
