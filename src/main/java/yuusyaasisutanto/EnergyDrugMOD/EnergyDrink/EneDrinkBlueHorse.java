package yuusyaasisutanto.EnergyDrugMOD.EnergyDrink;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import yuusyaasisutanto.EnergyDrugMOD.Logger;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;

public class EneDrinkBlueHorse extends EneDrink{
	
	@Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister p_94581_1_)
    {
        this.itemIcon = p_94581_1_.registerIcon("YuuasiEnergyDrugMOD:EneDrinkBlueHorse");
    }
	
	@Override
	public void goodEfe(){
		Logger.log("good Efect!");
	}
	
	@Override
	public void badEfe(){
		Logger.log("bad Efect...");
	}
}
