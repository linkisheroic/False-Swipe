package com.natura.falseswipe.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemFalseSwipeLeek extends ItemSword {

	public ItemFalseSwipeLeek(String unlocalizedName, String registryName) {
		super(ToolMaterial.WOOD);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(registryName);
		this.setMaxDamage(200);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		if(entity instanceof EntityLivingBase || entity instanceof EntityLiving) {
			if(((EntityLivingBase) entity).getHealth() == 1) {
				
				player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
				
			    return true;
			}
			
			if(((EntityLivingBase) entity).getHealth() - (3 + this.getAttackDamage()) <= 0) {
				((EntityLivingBase) entity).setHealth(1.0F);
				
				player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
				
				return true;
			}
		}
		return super.onLeftClickEntity(stack, player, entity);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(1, "A weapon that leaves your enemy with 1 HP.");
	}
}
