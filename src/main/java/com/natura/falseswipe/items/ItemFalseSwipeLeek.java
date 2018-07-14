package com.natura.falseswipe.items;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityCaveSpider;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityStray;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.SoundCategory;
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
			
			if(entity instanceof EntityWolf) {
				
				if(((EntityWolf) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityWolf) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntityWolf) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}

			if(entity instanceof EntityStray) {
				
				if(((EntityStray) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityStray) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntityStray) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}

			if(entity instanceof EntityGuardian) {
				
				if(((EntityGuardian) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityGuardian) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntityGuardian) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}

			if(entity instanceof EntityEndermite) {
				
				if(((EntityEndermite) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityEndermite) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntityEndermite) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}
			
			if(entity instanceof EntityCaveSpider) {
				
				if(((EntityCaveSpider) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityCaveSpider) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntityCaveSpider) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}

			if(entity instanceof EntitySpider) {
				
				if(((EntitySpider) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntitySpider) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntitySpider) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}
			
			if(entity instanceof EntitySkeleton) {
				
				if(((EntitySkeleton) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntitySkeleton) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntitySkeleton) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}

			if(entity instanceof EntityCreeper) {
				
				if(((EntityCreeper) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityCreeper) entity).getHealth() - (4 + this.getAttackDamage()) <= 0) {
					((EntityCreeper) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}
			
			if(entity instanceof EntityMob) {
				if(((EntityMob) entity).getHealth() == 1) {
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
				    return true;
				}
				
				if(((EntityMob) entity).getHealth() - (3 + this.getAttackDamage()) <= 0) {
					((EntityMob) entity).setHealth(1.0F);
					
					player.world.playSound((EntityPlayer)null, player.posX, player.posY, player.posZ, SoundEvents.ENTITY_PLAYER_ATTACK_SWEEP, SoundCategory.NEUTRAL, 0.6F, 0.4F + (itemRand.nextFloat() + 0.2F));
					
					return true;
				}
			}
			
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
