package fr.Roby360.spawncommand.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;

import fr.Roby360.spawncommand.Main;

public class CommandTP implements CommandExecutor, TabExecutor {
	
	 private Main main;
	 
	public CommandTP(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		FileConfiguration config = main.getConfig();
		if(!(sender instanceof Player)) { System.out.println("Non joueur"); return true;}
		
		Player player = (Player)sender;
		String worldName = player.getWorld().getName();
	
        if (config.getString("spawns." + worldName) == null) {  player.sendMessage(config.getString("servername").replace("&", "§") + ": " + config.getString("MessageSpawnNotFound").replace("&", "§")); return false;}

            int x_pos = config.getInt("spawns." + worldName + ".x");
            int y_pos = config.getInt("spawns." + worldName + ".y");
            int z_pos = config.getInt("spawns." + worldName + ".z");

            int a_pos = config.getInt("spawns." + worldName + ".a");
            int b_pos = config.getInt("spawns." + worldName + ".b");

            player.teleport(new Location(Bukkit.getWorld(worldName), x_pos, y_pos, z_pos, a_pos, b_pos));
            player.sendMessage(config.getString("servername").replace("&", "§") + ": " + config.getString("spawns." + worldName + ".message").replace("&", "§"));
		return false;
	}
	
	
	@Override
	public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return new ArrayList<>();
	}
}