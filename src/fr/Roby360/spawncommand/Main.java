package fr.Roby360.spawncommand;

import org.bukkit.plugin.java.JavaPlugin;

import fr.Roby360.spawncommand.commands.CommandTP;
import fr.Roby360.spawncommand.commands.HubTP;
import fr.Roby360.spawncommand.commands.Reload;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		System.out.println("[SpawnCommand] Plugin has been started");
		saveDefaultConfig();
		getCommand("spawn").setExecutor(new CommandTP(this));
		getCommand("hub").setExecutor(new HubTP(this));
		getCommand("rspawnconfig").setExecutor(new Reload(this));
	}

	public void onDisable() {
		System.out.println("[SpawnCommand] Plugin has been stoped");
	}
}
