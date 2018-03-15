package me.noodles.websitelink;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    public void onEnable() {
        this.getCommand("apply").setExecutor((CommandExecutor) new Apply());

    }

}
