package me.falceso.customlogin;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		new ListenerClass(this);
	}
	
	@Override
	public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		if (cmd.getName().equalsIgnoreCase("customloginmessage")){
			 
			player.sendMessage(ChatColor.BLUE + "CustomLoginMessage");
			player.sendMessage(ChatColor.BLUE + "By falceso");
			player.sendMessage(ChatColor.BLUE + "Short Desc: This is a plugin to do Custom Message when the player joins the server.");

		}
		return false;	
		
	}
	
}