package fr.Roby360.spawncommand.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import fr.Roby360.spawncommand.Main;

public class Reload implements CommandExecutor, TabExecutor {
	
	Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin("SpawnCommand");
	
	private Main main;

	public Reload(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg2, String[] arg3) {
		plugin.reloadConfig();
		main.getLogger().warning("Config Reloaded !");	
		if(sender instanceof Player) {
			Player player = (Player)sender;
			player.sendMessage("[SpawnCommand]: §6Config §b§lReloaded §6!");
		}
		return false;
	}
	
	public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return new ArrayList<>();
	}

}