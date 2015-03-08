package de.ItsAMysterious.mods.reallifemod;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.common.FMLCommonHandler;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class RealLifeModConfigGui extends GuiConfig {
	public RealLifeModConfigGui(GuiScreen parent) {
		super(parent, new ConfigElement(
				RealLifeMod.config.getCategory(Configuration.CATEGORY_GENERAL))
				.getChildElements(), RealLifeMod.NAME, false, false, GuiConfig
				.getAbridgedConfigPath(RealLifeMod.config.toString()));
	}
}