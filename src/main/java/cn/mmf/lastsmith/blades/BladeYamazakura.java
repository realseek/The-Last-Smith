package cn.mmf.lastsmith.blades;

import cn.mmf.lastsmith.TLSMain;
import cn.mmf.lastsmith.event.DropEvent;
import cn.mmf.lastsmith.event.RegisterSlashBladeEvent;
import cn.mmf.lastsmith.event.RegisterSlashBladeRecipeEvent;
import cn.mmf.lastsmith.item.ItemSlashBladeNamedTLS;
import cn.mmf.lastsmith.util.BladeUtil;
import mods.flammpfeil.slashblade.ItemSlashBladeNamed;
import mods.flammpfeil.slashblade.item.ItemSlashBlade;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class BladeYamazakura {
	@SubscribeEvent
	public static void BladeRegister(RegisterSlashBladeEvent event) {
		ItemStack customblade = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag = new NBTTagCompound();
		customblade.setTagCompound(tag);
		ItemSlashBladeNamed.CurrentItemName.set(tag, "flammpfeil.slashblade.named.yamazakura.aoi_fake");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag, 31);
		BladeUtil.IsFakeBlade.set(tag, true);
		ItemSlashBlade.setBaseAttackModifier(tag, 5.0F);
		ItemSlashBlade.TextureName.set(tag, "named/yamazakura/yamazakura_aoi");
		ItemSlashBlade.ModelName.set(tag, "named/yamazakura/model_fake");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.aoi_fake", customblade);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.aoi_fake");
		
		ItemStack customblade1 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag1 = new NBTTagCompound();
		customblade1.setTagCompound(tag1);
		ItemSlashBladeNamed.CurrentItemName.set(tag1, "flammpfeil.slashblade.named.yamazakura.kadomatsu");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag1, 31);
		BladeUtil.IsFakeBlade.set(tag1, true);
		ItemSlashBlade.setBaseAttackModifier(tag1, 5.0F);
		ItemSlashBlade.TextureName.set(tag1, "named/yamazakura/yamazakura_mutsuki_kadomatsu");
		ItemSlashBlade.ModelName.set(tag1, "named/yamazakura/model_fake");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.kadomatsu", customblade1);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.kadomatsu");
		
		ItemStack customblade11 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag11 = new NBTTagCompound();
		customblade11.setTagCompound(tag11);
		ItemSlashBladeNamed.CurrentItemName.set(tag11, "flammpfeil.slashblade.named.yamazakura.ume");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag11, 31);
		BladeUtil.IsFakeBlade.set(tag11, true);
		ItemSlashBlade.setBaseAttackModifier(tag11, 5.0F);
		ItemSlashBlade.TextureName.set(tag11, "named/yamazakura/yamazakura_kisaragi_ume");
		ItemSlashBlade.ModelName.set(tag11, "named/yamazakura/model_fake");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.ume", customblade11);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.ume");
		
		ItemStack customblade2 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag2 = new NBTTagCompound();
		customblade2.setTagCompound(tag2);
		ItemSlashBladeNamed.CurrentItemName.set(tag2, "flammpfeil.slashblade.named.yamazakura.sakura");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag2, 31);
		BladeUtil.IsFakeBlade.set(tag2, true);
		ItemSlashBlade.setBaseAttackModifier(tag2, 5.0F);
		ItemSlashBlade.TextureName.set(tag2, "named/yamazakura/yamazakura_yayoi_sakura");
		ItemSlashBlade.ModelName.set(tag2, "named/yamazakura/model_fake");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.sakura", customblade2);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.sakura");
		
		ItemStack customblade21 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag21 = new NBTTagCompound();
		customblade21.setTagCompound(tag21);
		ItemSlashBladeNamed.CurrentItemName.set(tag21, "flammpfeil.slashblade.named.yamazakura.uzuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag21, 31);
		BladeUtil.IsFakeBlade.set(tag21, true);
		ItemSlashBlade.setBaseAttackModifier(tag21, 6.0F);
		ItemSlashBlade.TextureName.set(tag21, "named/yamazakura/yamazakura_uzuki");
		ItemSlashBlade.ModelName.set(tag21, "named/yamazakura/uzuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.uzuki", customblade21);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.uzuki");
		
		ItemStack customblade22 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag22 = new NBTTagCompound();
		customblade22.setTagCompound(tag22);
		ItemSlashBladeNamed.CurrentItemName.set(tag22, "flammpfeil.slashblade.named.yamazakura.satsuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag22, 31);
		BladeUtil.IsFakeBlade.set(tag22, true);
		ItemSlashBlade.setBaseAttackModifier(tag22, 6.0F);
		ItemSlashBlade.TextureName.set(tag22, "named/yamazakura/yamazakura_satsuki");
		ItemSlashBlade.ModelName.set(tag22, "named/yamazakura/satsuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.satsuki", customblade22);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.satsuki");
		
		ItemStack customblade221 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag221 = new NBTTagCompound();
		customblade221.setTagCompound(tag221);
		ItemSlashBladeNamed.CurrentItemName.set(tag221, "flammpfeil.slashblade.named.yamazakura.hazuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag221, 31);
		BladeUtil.IsFakeBlade.set(tag221, true);
		ItemSlashBlade.setBaseAttackModifier(tag221, 6.0F);
		ItemSlashBlade.TextureName.set(tag221, "named/yamazakura/yamazakura_hazuki");
		ItemSlashBlade.ModelName.set(tag221, "named/yamazakura/fumizuki_fake");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.hazuki", customblade221);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.hazuki");
		
		ItemStack customblade222 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag222 = new NBTTagCompound();
		customblade222.setTagCompound(tag222);
		ItemSlashBladeNamed.CurrentItemName.set(tag222, "flammpfeil.slashblade.named.yamazakura.kiku");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag222, 31);
		BladeUtil.IsFakeBlade.set(tag222, true);
		ItemSlashBlade.setBaseAttackModifier(tag222, 6.0F);
		ItemSlashBlade.TextureName.set(tag222, "named/yamazakura/yamazakura_nagatsuki_kiku");
		ItemSlashBlade.ModelName.set(tag222, "named/yamazakura/fumizuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.kiku", customblade222);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.kiku");
		
		ItemStack customblade3 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag3 = new NBTTagCompound();
		customblade3.setTagCompound(tag3);
		ItemSlashBladeNamed.CurrentItemName.set(tag3, "flammpfeil.slashblade.named.yamazakura.shiwasu");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag3, 31);
		BladeUtil.IsFakeBlade.set(tag3, true);
		ItemSlashBlade.setBaseAttackModifier(tag3, 7.0F);
		ItemSlashBlade.TextureName.set(tag3, "named/yamazakura/yamazakura_shiwasu");
		ItemSlashBlade.ModelName.set(tag3, "named/yamazakura/shimotsuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.shiwasu", customblade3);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.shiwasu");
		
		ItemStack customblade31 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag31 = new NBTTagCompound();
		customblade31.setTagCompound(tag31);
		ItemSlashBladeNamed.CurrentItemName.set(tag31, "flammpfeil.slashblade.named.yamazakura.shimotsuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag31, 31);
		BladeUtil.IsFakeBlade.set(tag31, true);
		ItemSlashBlade.setBaseAttackModifier(tag31, 7.0F);
		ItemSlashBlade.TextureName.set(tag31, "named/yamazakura/yamazakura_shimotsuki");
		ItemSlashBlade.ModelName.set(tag31, "named/yamazakura/shimotsuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.shimotsuki", customblade31);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.shimotsuki");

		ItemStack customblade4 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag4 = new NBTTagCompound();
		customblade4.setTagCompound(tag4);
		customblade4.addEnchantment(Enchantments.UNBREAKING, 1);
		ItemSlashBladeNamed.CurrentItemName.set(tag4, "flammpfeil.slashblade.named.yamazakura.minazuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag4, 41);
		BladeUtil.IsFakeBlade.set(tag4, true);
		ItemSlashBlade.setBaseAttackModifier(tag4, 6.0F);
		ItemSlashBlade.TextureName.set(tag4, "named/yamazakura/yamazakura_minazuki");
		ItemSlashBlade.ModelName.set(tag4, "named/yamazakura/model_fake");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.minazuki", customblade4);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.minazuki");
		
		ItemStack customblade41 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag41 = new NBTTagCompound();
		customblade41.setTagCompound(tag41);
		customblade41.addEnchantment(Enchantments.UNBREAKING, 2);
		ItemSlashBladeNamed.CurrentItemName.set(tag41, "flammpfeil.slashblade.named.yamazakura.fumizuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag41, 41);
		ItemSlashBlade.setBaseAttackModifier(tag41, 7.0F);
		ItemSlashBlade.TextureName.set(tag41, "named/yamazakura/yamazakura_fumizuki");
		ItemSlashBlade.ModelName.set(tag41, "named/yamazakura/fumizuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.fumizuki", customblade41);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.fumizuki");
		
		ItemStack customblade42 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag42 = new NBTTagCompound();
		customblade42.setTagCompound(tag42);
		customblade42.addEnchantment(Enchantments.UNBREAKING, 2);
		customblade42.addEnchantment(Enchantments.KNOCKBACK, 1);
		ItemSlashBladeNamed.CurrentItemName.set(tag42, "flammpfeil.slashblade.named.yamazakura.kannazuki");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag42, 41);
		ItemSlashBlade.setBaseAttackModifier(tag42, 7.0F);
		ItemSlashBlade.TextureName.set(tag42, "named/yamazakura/yamazakura_kannazuki_katura");
		ItemSlashBlade.ModelName.set(tag42, "named/yamazakura/kannazuki");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.kannazuki", customblade42);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.kannazuki");
		
		ItemStack customblade421 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag421 = new NBTTagCompound();
		customblade421.setTagCompound(tag421);
		customblade421.addEnchantment(Enchantments.POWER, 1);
		customblade421.addEnchantment(Enchantments.UNBREAKING, 3);
		customblade421.addEnchantment(Enchantments.SHARPNESS, 2);
		customblade421.addEnchantment(Enchantments.KNOCKBACK, 2);
		ItemSlashBladeNamed.CurrentItemName.set(tag421, "flammpfeil.slashblade.named.yamazakura.kamuy");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag421, 41);
		ItemSlashBlade.setBaseAttackModifier(tag421, 9.0F);
		ItemSlashBladeNamed.IsDefaultBewitched.set(tag, true);
		BladeUtil.IsBewitchedActived.set(tag, true);
		ItemSlashBlade.TextureName.set(tag421, "named/yamazakura/yamazakura_kamuy_tuki");
		ItemSlashBlade.ModelName.set(tag421, "named/yamazakura/model");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.kamuy", customblade421);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.kamuy");
		
		ItemStack customblade5 = new ItemStack(BladeLoader.bladeNamed, 1, 0);
		NBTTagCompound tag5 = new NBTTagCompound();
		customblade5.setTagCompound(tag5);
		customblade5.addEnchantment(Enchantments.UNBREAKING, 1);
		customblade5.addEnchantment(Enchantments.SHARPNESS, 2);
		ItemSlashBladeNamed.CurrentItemName.set(tag5, "flammpfeil.slashblade.named.yamazakura.aoi");
		ItemSlashBladeNamed.CustomMaxDamage.set(tag5, 41);
		ItemSlashBlade.setBaseAttackModifier(tag5, 9.0F);
		ItemSlashBladeNamed.IsDefaultBewitched.set(tag, true);
		BladeUtil.IsBewitchedActived.set(tag, true);
		ItemSlashBlade.TextureName.set(tag5, "named/yamazakura/yamazakura_aoi");
		ItemSlashBlade.ModelName.set(tag5, "named/yamazakura/model");
		BladeLoader.registerCustomItemStack("flammpfeil.slashblade.named.yamazakura.aoi", customblade5);
		ItemSlashBladeNamedTLS.NamedBlades.add("flammpfeil.slashblade.named.yamazakura.aoi");
	}

	@SubscribeEvent
	public static void onRecipeRegister(RegisterSlashBladeRecipeEvent event) {
		DropEvent.registerEntityDrop(new ResourceLocation("minecraft", "evocation_illager"),
				new ResourceLocation(TLSMain.MODID, "slashblade_white"), 0.15f,
				BladeLoader.getCustomBlade("flammpfeil.slashblade.named.yamazakura.aoi_fake"), true);
		DropEvent.registerEntityDrop(new ResourceLocation("minecraft", "vex"),
				new ResourceLocation(TLSMain.MODID, "slashblade_white"), 0.15f,
				BladeLoader.getCustomBlade("flammpfeil.slashblade.named.yamazakura.kadomatsu"), true);
		DropEvent.registerEntityDrop(new ResourceLocation("minecraft", "stray"),
				new ResourceLocation(TLSMain.MODID, "slashblade_white"), 0.15f,
				BladeLoader.getCustomBlade("flammpfeil.slashblade.named.yamazakura.ume"), true);
		DropEvent.registerEntityDrop(new ResourceLocation("minecraft", "shulker"),
				new ResourceLocation(TLSMain.MODID, "slashblade_white"), 0.15f,
				BladeLoader.getCustomBlade("flammpfeil.slashblade.named.yamazakura.sakura"), true);
	}

}
