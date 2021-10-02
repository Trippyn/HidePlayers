package me.Sunney;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("Enabling Plugin");
	    Bukkit.getPluginManager().registerEvents(this, (Plugin)this);
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("Disabling Plugin");
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler(priority = EventPriority.HIGHEST)
	public void onJoin(PlayerJoinEvent e) {
		Player l = e.getPlayer();
		for (Player p : Bukkit.getOnlinePlayers())
			p.hidePlayer(l);
		for (Player p : Bukkit.getOnlinePlayers())
			l.hidePlayer(p);
	}

}
