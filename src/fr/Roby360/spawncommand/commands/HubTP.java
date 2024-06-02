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

public class HubTP implements CommandExecutor, TabExecutor {
	
	private Main main;
	
	public HubTP(Main main) {
		this.main = main;
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] arg3) {
		FileConfiguration config = main.getConfig();
		if(!(sender instanceof Player)) { System.out.println("Non joueur"); return false;}
		Player player = (Player) sender;
		String worldName = player.getWorld().getName();
		String WorldConfig = config.getString("hub.worldName");
		
		if(WorldConfig == null) {main.getLogger().warning("Sorry but worldName is blank on your yml config file"); return false;}
		
		if(!(config.getBoolean("AllowHubCmd"))) { player.sendMessage(config.getString("servername").replace("&", "§") + ": " + config.getString("MessageCmdHubDisable").replace("&", "§")); return false;}
		
		if(worldName.equalsIgnoreCase(WorldConfig)) {  player.sendMessage(config.getString("servername").replace("&", "§")+ ": " + config.getString("MessgaePlayerAlreadyHub").replace("&", "§")); return false;}
		
		if(Bukkit.getWorld(WorldConfig) == null) {main.getLogger().warning("Sorry but I don't find hub world, that name is correct ?"); return false;}
		try {
		int x_pos = config.getInt("hub.x");
        int y_pos = config.getInt("hub.y");
        int z_pos = config.getInt("hub.z");

        int a_pos = config.getInt("hub.a");
        int b_pos = config.getInt("hub.b");

		
		player.teleport(new Location(Bukkit.getWorld(WorldConfig), x_pos, y_pos, z_pos, a_pos, b_pos));
        player.sendMessage(config.getString("servername").replace("&", "§") + ": " + config.getString("hub.message").replace("&", "§"));
		} catch(Exception e) {
			main.getLogger().severe(e.toString());
		}
		return false;
	}
	
	public List<String> onTabComplete(CommandSender arg0, Command arg1, String arg2, String[] arg3) {
		return new ArrayList<>();
	}

}
