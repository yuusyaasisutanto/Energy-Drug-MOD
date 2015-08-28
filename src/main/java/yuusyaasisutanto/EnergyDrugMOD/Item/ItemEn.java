package yuusyaasisutanto.EnergyDrugMOD.Item;

import yuusyaasisutanto.EnergyDrugMOD.YuuasiEnergyDrugMOD;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;



public class ItemEn extends Item{

	public ItemEn(){
		super();
		maxStackSize = 64;
		setCreativeTab(YuuasiEnergyDrugMOD.EDModCreativeTab);
	}
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        this.itemIcon = p_94581_1_.registerIcon("YuuasiEnergyDrugMOD:oneEn");
    }

}
