package yuusyaasisutanto.EnergyDrugMOD;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EDModCreativeTab extends CreativeTabs {

	public EDModCreativeTab(String lable) {
		super(lable);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	@SideOnly(Side.CLIENT)
	public String getTranslatedTabLabel() {
		return "EnergyDrugMOD:basic";
	}

	@Override
	public Item getTabIconItem(){
		return YuuasiEnergyDrugMOD.ItemEn;
	}
	
}
