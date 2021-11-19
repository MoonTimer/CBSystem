package me.moontimer.cbsystem.commands.tp;

import me.moontimer.cbsystem.Data;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPAllCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("cb.tpall")) {
            for (Player player1 : Bukkit.getOnlinePlayers()) {
                Location location = player.getLocation();
                player1.teleport(location);
            }

            player.sendMessage(Data.prefix + "§5Du hast alle Spieler zu dir teleportiert.");
        }
        return false;
    }
}
