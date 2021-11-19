package me.moontimer.cbsystem.commands;

import me.moontimer.cbsystem.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("cb.heal")) {
            if (args.length == 0) {
                player.setFoodLevel(20);
                player.setHealth(20.0);
                player.sendMessage(Data.prefix + "§5Du wurdest erfolgreich geheilt.");
            } else if (args.length == 1) {
                Player player2 = Bukkit.getPlayer(args[2]);
                player2.setHealth(20.0);
                player.setFoodLevel(20);
                player.sendMessage(Data.prefix + "§3" + player2.getName() + " §5wurde erfolgreich geheilt.");
            } else {
                player.sendMessage(Data.prefix + "§5Falscher Syntax /heal (name)");
            }
        }
        return false;
    }
}
