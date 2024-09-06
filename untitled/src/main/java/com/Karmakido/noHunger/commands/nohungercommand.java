package com.Karmakido.noHunger.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class nohungercommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        sender.sendMessage("§a Made with <3 by Karmakido for Marjo and Sleepy");



        return true;
    }
}