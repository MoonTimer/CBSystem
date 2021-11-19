package me.moontimer.cbsystem.commands;

import me.moontimer.cbsystem.Data;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class FlyCommand implements CommandExecutor {

    public static ArrayList<String> fly = new ArrayList<String>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("cb.fly")) {
            if (args.length == 0) {
                if (!(fly.contains(player.getName()))) {
                    fly.add(player.getName());
                    player.setFlying(true);
                    player.sendMessage(Data.prefix + "§5Du kannst nun fliegen");
                } else {
                    fly.remove(player.getName());
                    player.setFlying(false);
                    player.sendMessage(Data.prefix + "§5Du kannst nun nicht mehr fliegen");
                }
            }
        }
        return false;
    }
}
