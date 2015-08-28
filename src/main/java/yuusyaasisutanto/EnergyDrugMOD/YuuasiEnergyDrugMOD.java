package yuusyaasisutanto.EnergyDrugMOD;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(
		modid = "YuuasiEnergyDrugMOD",
		name = "EnergyDrugMOD",
		version = "beta 1.7.10",
		dependencies = "required-after:Forge@[10.13.4.1447-1.7.10,)")

public class YuuasiEnergyDrugMOD {

	// Drink var
	public static int EneDrink = 0;
	
	// Item
	
	// En
	public static Item ItemEn;
	public static Item ItemTenEn;
	public static Item ItemHundredEn;
	
	// Energy Drink
	public static Item ItemBlueHorse;
	
	//Block
	public static Block BlockEnChanger;
	
	// Tab
	public static final CreativeTabs EDModCreativeTab = new EDModCreativeTab("EDModCreativeTab");
	public static final CreativeTabs EDModDrinkTab = new EDModCreativeTabDrink("EDModDrinkTab");
	
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		MinecraftForge.EVENT_BUS.register(new yuusyaasisutanto.EnergyDrugMOD.EnergyDrink.EneDrink());
		Logger.regestry(event);
		ItemRegister.instance.add();
	}
}
