package me.moontimer.cbsystem.commands;

import me.moontimer.cbsystem.Data;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class GodCommand implements CommandExecutor {

    public static ArrayList<String> god = new ArrayList<String>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if(player.hasPermission("cb.god")) {
            if(args.length == 0) {
                if(!(god.contains(player.getName()))) {
                    god.add(player.getName());
                    player.sendMessage(Data.prefix + "§5Du bist nun im GodMode");
                }else {
                    god.remove(player.getName());
                    player.sendMessage(Data.prefix + "§5Du bist nun nicht mehr im GodMode");
                }
            } else if (args.length == 1) {
                Player player1 = Bukkit.getPlayer(args[1]);
                if(!(god.contains(player1.getName()))) {
                    god.add(player1.getName());
                    player.sendMessage(Data.prefix + "§a" + player1.getName() + " §5ist nun im GodMode");
                }else {
                    god.remove(player1.getName());
                    player.sendMessage(Data.prefix + "§a" + player1.getName() + " §5ist nun nicht mehr im GodMode");
                }
            } else {
                player.sendMessage(Data.prefix + "§cFalsscher Syntax. /god (name)");
            }
        }
        return false;
    }
}
