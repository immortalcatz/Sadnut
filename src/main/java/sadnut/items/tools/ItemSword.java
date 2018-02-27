package sadnut.items.tools;

import sadnut.util.DamageType;

public class ItemSword extends ItemWeapon{

    public ItemSword(ToolMaterial material, String name) {
        super(material, name);
        setDamageType(DamageType.SLASHING);
    }
}
