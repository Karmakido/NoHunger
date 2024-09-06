package com.Karamkido.noHunger;

import com.Karamkido.noHunger.commands.nohungercommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoHunger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("nohunger").setExecutor(new nohungercommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
