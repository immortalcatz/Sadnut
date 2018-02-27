package sadnut.util;

import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;

public class CoreUtils {

	
	
	public static String translate(String s)
	{
		return I18n.format(s);
	}
	
	public static void bindTexture(ResourceLocation texture)
	{
		net.minecraft.client.Minecraft.getMinecraft().getTextureManager().bindTexture(texture);
	}
}
