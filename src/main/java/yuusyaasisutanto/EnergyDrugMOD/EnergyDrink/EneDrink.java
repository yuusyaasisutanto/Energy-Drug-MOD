package yuusyaasisutanto.EnergyDrugMOD.EnergyDrink;

import java.util.Random;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import yuusyaasisutanto.EnergyDrugMOD.YuuasiEnergyDrugMOD;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerUseItemEvent;



public class EneDrink extends ItemFood{
	
	public EneDrink(){
		super(0, false);
		maxStackSize = 1;
		setCreativeTab(YuuasiEnergyDrugMOD.EDModDrinkTab);
		this.setAlwaysEdible();
	}
	
	@Override
    public EnumAction getItemUseAction(ItemStack p_77661_1_)
    {
        return EnumAction.drink;
    }
	
	@SubscribeEvent
	public void FinishToDrink(PlayerUseItemEvent.Finish event){		
		Random rnd = new Random();
		int ran = rnd.nextInt(100);
		int Per = (int) Math.pow(YuuasiEnergyDrugMOD.EneDrink, 2);
		
		if (Per <= ran){
			this.goodEfe();
		} else {
			this.badEfe();
		}
		
	}
	
	
	// いい時のエフェクト
	public void goodEfe(){
		
	}

	// 悪い時のエフェクト
	public void badEfe(){
		
	}
}
