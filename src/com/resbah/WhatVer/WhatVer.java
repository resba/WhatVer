package com.resbah.WhatVer;

import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class WhatVer extends JavaPlugin {
	Logger log = Logger.getLogger("Minecraft");
	
	public void onEnable(){
		log.info("WhatVer is enabled.");
	}
	
	public void onDisable(){
		log.info("WhatVer has been unloaded.");		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equalsIgnoreCase("whatver")){
			String vers = "This server is running " + this.getServer().getName() + " version " + this.getServer().getVersion() + " (Implementing API version " + this.getServer().getBukkitVersion() + ")";
			
			sender.sendMessage(vers);
			if(this.getServer().getName().contains("++")){
				sender.sendMessage("Server Software: "+this.getServer().getName()+" (WARNING: This is a MODIFIED/"+ChatColor.RED+"UNOFFICIAL"+ChatColor.WHITE+" version of Craftbukkit. The Bukkit Project cannot assist you in problems caused by a modified/unofficial versions of Craftbukkit. Please be aware of this when you are requesting help.)");
			}else{
				sender.sendMessage("Server Software: "+this.getServer().getName());
			}
			sender.sendMessage("Software Version: "+this.getServer().getVersion());
			sender.sendMessage("Bukkit API Version: "+this.getServer().getBukkitVersion());
			return true;
			}
		return false;
			
		}
		
		
		
		
		
	}
	
	

