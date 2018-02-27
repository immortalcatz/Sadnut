package sadnut.potion;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import sadnut.util.Reference;

public class PotionBleed extends Potion{

    public PotionBleed() {
        super(false, 0xF74BF6);
        this.setPotionName("bleed");
        this.setRegistryName(new ResourceLocation(Reference.MOD_ID, "bleed_potion"));

    }


    @Override
    public void performEffect(EntityLivingBase e, int amplifier) {
        e.attackEntityFrom(DamageSource.GENERIC, 1);
        //EntityPlayerSP player = Minecraft.getMinecraft().player;
        //player.sendChatMessage("Bleed effect applied");
    }

    @Override
    public boolean isReady(int duration, int amplifier) {
        return duration % 20 == 0;
    }

}
