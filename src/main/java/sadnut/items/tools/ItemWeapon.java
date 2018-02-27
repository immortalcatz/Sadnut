package sadnut.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import sadnut.Main;
import sadnut.init.ModItems;
import sadnut.init.ModPotions;
import sadnut.util.DamageType;
import sadnut.util.IHasDamageType;
import sadnut.util.IHasModel;

public class ItemWeapon extends net.minecraft.item.ItemSword implements IHasModel, IHasDamageType {

    private String name;
    private DamageType damageType;

    public ItemWeapon(ToolMaterial material, String name) {
        super(material);
        setRegistryName(name);
        setUnlocalizedName(name);
        this.name = name;

        ModItems.ITEMS.add(this);
    }

    @Override
    public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
        target.addPotionEffect(getHitEffect());
        return super.hitEntity(stack, target, attacker);
    }

    private PotionEffect getHitEffect() {
        switch (damageType) {
            case SLASHING:
                return new PotionEffect(ModPotions.potionBleed, 4, 0, false, false);
            default:
                return null;
        }
    }

    @Override
    public void setDamageType(DamageType damageType) {
        this.damageType = damageType;
    }

    @Override
    public Item setCreativeTab(CreativeTabs tab) {
        return super.setCreativeTab(Main.toolsTab);
    }

    @Override
    public void registerModels() {
        Main.proxy.registerItemRenderer(this, 0, name);
    }
}
