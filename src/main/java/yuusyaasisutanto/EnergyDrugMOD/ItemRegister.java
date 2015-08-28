package yuusyaasisutanto.EnergyDrugMOD;

import yuusyaasisutanto.EnergyDrugMOD.Block.BlockEnChanger;
import yuusyaasisutanto.EnergyDrugMOD.EnergyDrink.EneDrinkBlueHorse;
import yuusyaasisutanto.EnergyDrugMOD.Item.ItemEn;
import yuusyaasisutanto.EnergyDrugMOD.Item.ItemHundredEn;
import yuusyaasisutanto.EnergyDrugMOD.Item.ItemTenEn;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegister {
	
	public static ItemRegister instance = new ItemRegister();
			
		private ItemRegister(){
		
	}
		public void add(){
			this.ItemAdd();
			this.BlockAdd();
			
			// item
			
			// En
			GameRegistry.registerItem(YuuasiEnergyDrugMOD.ItemEn, "yuusyaasisutanto.oneEn");
			GameRegistry.registerItem(YuuasiEnergyDrugMOD.ItemTenEn, "yuusyaasisutanto.tenEn");
			GameRegistry.registerItem(YuuasiEnergyDrugMOD.ItemHundredEn, "yuusyaasisutanto.hundredEn");
			
			// Energy Drink
			GameRegistry.registerItem(YuuasiEnergyDrugMOD.ItemBlueHorse, "yuusyaasisutanto.DrinkBlueHorse");
			
			
			// block
			GameRegistry.registerBlock(YuuasiEnergyDrugMOD.BlockEnChanger, "yuusyaasisutanto.EnChanger");
		}
	
		static void ItemAdd(){
			
			YuuasiEnergyDrugMOD.ItemEn = new ItemEn().setUnlocalizedName("yuusyaasisutanto.oneEn");
			YuuasiEnergyDrugMOD.ItemTenEn = new ItemTenEn().setUnlocalizedName("yuusyaasisutanto.tenEn");
			YuuasiEnergyDrugMOD.ItemHundredEn = new ItemHundredEn().setUnlocalizedName("yuusyaasisutanto.hundredEn");
			
			YuuasiEnergyDrugMOD.ItemBlueHorse = new EneDrinkBlueHorse().setUnlocalizedName("yuusyaasisutanto.DrinkBlueHorse");
		}
		
		static void BlockAdd(){
			
			YuuasiEnergyDrugMOD.BlockEnChanger = new BlockEnChanger().setBlockName("yuusyaasisutanto.EnChanger");
		}

}
