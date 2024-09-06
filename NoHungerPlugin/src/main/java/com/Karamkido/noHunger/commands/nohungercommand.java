package com.Karamkido.noHunger.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class nohungercommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if (command.getName().equalsIgnoreCase("nohunger")) {
            if (args.length > 0 && args[0].equalsIgnoreCase("info")) {
                sender.sendMessage("§a Made with <3 by Karmakido");
                sender.sendMessage("§b Plugin-Version: 1.0");
                sender.sendMessage("§b commands: /nohunger info");
                return true;
            } else if (args.length == 0) {
                // Handle the case where no arguments are provided
                sender.sendMessage("§cError: No arguments provided. Valid usage: /nohunger info");
                return true;
            } else {
                // Handle unknown arguments
                sender.sendMessage("§cError: Unknown argument.");
                return true;
            }
        }
        return false;
    }
}
