
## 🐛 **What do this plugin**
The Minecraft plugin I've created is designed to manage spawn points for multiple worlds within a server. Each world can have its own designated spawn location, complete with specific coordinates and custom messages displayed to players upon teleportation. The configuration is handled through a ```config.yml``` file, which allows server administrators to easily set up and modify the spawn points and messages for each world. For example, the plugin can teleport players to different worlds like Minage, Nether, and Faction, each with unique messages and coordinates. Additionally, it supports teleportation to a central hub world, providing a cohesive and customizable experience for players.

The configuration in the config.yml file includes a section for each world under #Spawns. Here is an example setup:
```yml
#Spawns
#-----------------[Exemple]-------------------
# WorldName: 
#  message: "&6Message when the player tp on world with command"
#    x: 0 Co on x
#    y: 0 Co on y
#    z: 0 Co on z
#    a: 0 Co on y of player view
#    b: 0 Co on x of player view
#----------------------------------------------------
spawns:
  Minage:
    message: "&teleportation on &b&lMinage"
    x: 0
    y: 0
    z: 0
    a: 0
    b: 0
  Nether:
    message: "teleportation on &d&lNether"
    x: 0
    y: 0
    z: 0
    a: 0
    b: 0
  Faction:
    message: "teleportation on &c&lFaction"
    x: 0
    y: 0
    z: 0
    a: 0
    b: 0

servername: "&f[&a&lEarth&b&lCraft&f]"

hub:
  worldName: "hub"
  message: "teleportation on &b&lHub"
  x: 0
  y: 69
  z: 0
  a: 0
  b: 0

#Settings
AllowSpawnCmd: true
AllowHubCmd: true

# Messages
MessageSpawnNotFound: "Sorry but I didn't find any spawn on your world!"
MessagePlayerAlreadyHub: "Sorry but you are already at the hub!"
MessageCmdHubDisable: "Sorry but the hub command is disabled, please configure this file"
MessageCmdSpawnDisable: "Sorry but the spawn command is disabled, please configure this file"
```

## 🤖 **Commands**

The SpawnCommand plugin includes several commands to enhance your server management and player experience. Here are the available commands and their functionalities:

*  `/hub`

- **Description:** Teleports the player to the designated hub world.
- **Requirements:** The hub world name must be configured in the `config.yml` file.
- **Permission:** spawncommand.use.hub

*  `/spawn`

- **Description:** Teleports the player to a specified spawn point within the current world.
- **Requirements:** The spawn point must be configured in the `config.yml` file for the current world.
- **Permission:** spawncommand.use.spawn

*  `/rspawnconfig`

 ** **Description:** Reloads the plugin's configuration file without needing to restart the server.
  * **Requirements:** The command is typically used by server administrators to apply changes made to the `config.yml`
 * **Permission:** spawncommand.admin.reload
  
## 📥 **Installation Guide**

To install the SpawnCommand plugin, follow these simple steps:

 * Step 1: Download the Plugin

First, download the latest version of the SpawnCommand plugin from the official GitHub repository or the plugin's release page.

 *  Step 2: Add the Plugin to Your Server

1. Locate your Minecraft server directory.
2. Open the `plugins` folder within the server directory.
3. Drag and drop the downloaded SpawnCommand plugin `.jar` file into the `plugins` folder.

 *  Step 3: Start Your Server

1. Start your Minecraft server. You can do this by running the server’s start script or executable file.
2. Once the server has started, the plugin will automatically load and be ready for use.

 *  Step 4: Verify Installation

1. To ensure the plugin is installed correctly, type the following command in the server console or in-game:
   ```
   /plugins
   ```
2. Check that `SpawnCommand` appears in the list of active plugins. If it does, the installation is complete!

 *  Step 5: Configuration (Optional)

For further customization, you can configure the plugin by editing the `config.yml` file located in the `plugins/SpawnCommand` directory. Refer to the plugin’s documentation for details on how to set up spawn points and messages.

That's it! Your SpawnCommand plugin is now installed and ready to enhance your Minecraft server. If you have any issues or questions, feel free to reach out for support.

## ⚠️ **Requirement**

To use the SpawnCommand plugin, ensure that your Minecraft server meets the following requirement:

- **Minecraft Version:** 1.16.5 or higher

By meeting this requirement, you'll be able to take advantage of all the features and functionalities offered by the SpawnCommand plugin without compatibility issues.

## ❓ **How to Report Issues or suggest an idea or questions**

If you encounter any issues, have suggestions, or have questions about the plugin, there are several ways you can reach out for support or provide feedback:

 * GitHub

The best way to report issues or suggest features is through the plugin's GitHub repository. You can submit detailed reports, share your ideas, or ask questions by creating an issue. This helps keep everything organized and allows other users to see and contribute to the discussion.

__[GitHub | SpawnCommand Plugin](https://github.com/Roby360/SpawnCommand/issues)__

 * Discord

For a more direct approach, you can send me a direct message on Discord. This is a great option for quick questions or if you prefer real-time communication. Feel free to reach out, and I'll do my best to assist you promptly.

__[My Discord Profile](https://discord.com/users/789802191149989908)__

By using these channels, you help improve the plugin and contribute to a better experience for all users. Thank you for your support!
