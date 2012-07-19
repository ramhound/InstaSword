package com.sosmedia.instasword;

import org.bukkit.plugin.java.JavaPlugin;

public class InstaSwordMain extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new DeathListener(), this);
	}
	@Override
	public void onDisable() {
		
	}
}
