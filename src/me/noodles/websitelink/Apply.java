package me.noodles.websitelink;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class Apply implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (cmd.getName().equalsIgnoreCase("apply")) {
            sender.sendMessage(ChatColor.BLUE + "Apply for staff at: LINKHERE");

        }
        return true;
    }
}

