package com.Karamkido.noHunger;

import com.Karamkido.noHunger.commands.nohungercommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

public final class NoHunger extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("nohunger").setExecutor(new nohungercommand());
        getLogger().info("NoHunger plugin enabled!");
        getLogger().info("--Made by Karmakido with <3--");

        new BukkitRunnable() {
            @Override
            public void run() {

                Location loc1 = new Location(Bukkit.getWorld("world"), -19, 112, 0);
                Location loc2 = new Location(Bukkit.getWorld("world"), 143, 206, 118);
                setHungerInArea(loc1, loc2);
            }
        }.runTaskTimer(this, 0L, 20L); // Runs every 20 ticks (1 second)
    }

    @Override
    public void onDisable() {
        getLogger().info("NoHunger plugin disabled!");
    }

    public boolean isPlayerInArea(Player player, Location loc1, Location loc2) {
        Location playerLoc = player.getLocation();

        double minX = Math.min(loc1.getX(), loc2.getX());
        double maxX = Math.max(loc1.getX(), loc2.getX());

        double minY = Math.min(loc1.getY(), loc2.getY());
        double maxY = Math.max(loc1.getY(), loc2.getY());

        double minZ = Math.min(loc1.getZ(), loc2.getZ());
        double maxZ = Math.max(loc1.getZ(), loc2.getZ());


        return (playerLoc.getX() >= minX && playerLoc.getX() <= maxX) &&
                (playerLoc.getY() >= minY && playerLoc.getY() <= maxY) &&
                (playerLoc.getZ() >= minZ && playerLoc.getZ() <= maxZ);
    }

    public void setHungerInArea(Location loc1, Location loc2) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (isPlayerInArea(player, loc1, loc2)) {
                //20er Nuggets(Hunger)
                player.setFoodLevel(20);
            }
        }
    }

}
