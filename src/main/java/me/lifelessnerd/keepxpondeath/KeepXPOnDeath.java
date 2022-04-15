package me.lifelessnerd.keepxpondeath;

import org.bukkit.plugin.java.JavaPlugin;

public final class KeepXPOnDeath extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("KeepXPOnDeath started: \nPlugin that makes it so when you get killed by a player, your XP stays.");
        getServer().getPluginManager().registerEvents(new DeathListener(), this);

    }
}