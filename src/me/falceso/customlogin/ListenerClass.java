package me.falceso.customlogin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ListenerClass implements Listener {
	
	public ListenerClass(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);	
	}
	
	@EventHandler
	public void onEvent(PlayerJoinEvent e) {
		
		Player player = e.getPlayer();
		if (player.getName().equalsIgnoreCase("falceso"))
        {
            player.setPlayerListName(ChatColor.GREEN + "falceso");
            player.setDisplayName("falceso");
            Bukkit.broadcastMessage(ChatColor.DARK_PURPLE + "Hey Guys! Falceso's here!");
            Bukkit.broadcastMessage(ChatColor.GREEN + "Developer of the CustomLoginMessage!");
        }
		//If Old Player
		if (player.hasPlayedBefore() == true){
		e.setJoinMessage(ChatColor.GOLD + "Welcome Back " + player.getName() +" to the Server!");
		}
		//If New Player
		if (player.hasPlayedBefore() == false){
		e.setJoinMessage(ChatColor.GOLD + "Welcome, " + player.getName() +", to the Server!");
		player.sendMessage("Hi I'm new to this server!");
}
	}
}
