package yuusyaasisutanto.EnergyDrugMOD.Block;

import yuusyaasisutanto.EnergyDrugMOD.YuuasiEnergyDrugMOD;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockEnChanger extends Block{
	
	// 両替機
	public BlockEnChanger(){
		super(Material.iron);
		setCreativeTab(YuuasiEnergyDrugMOD.EDModCreativeTab);
		setBlockName("BlockEnChanger");
		setBlockTextureName("YuuasiEnergyDrugMOD:EnChanger");
		setHardness(3.0F);
		setResistance(20.0F);
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float posX, float posY, float posZ){
		return false;
	}
	
	@Override
	public void onBlockClicked(World world, int x, int y, int z, EntityPlayer player){
		
	}
}