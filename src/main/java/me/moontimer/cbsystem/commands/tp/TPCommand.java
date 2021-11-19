package me.moontimer.cbsystem.commands.tp;

import me.moontimer.cbsystem.Data;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("cb.tp")) {
            if (args.length == 1) {
                Player target = Bukkit.getPlayer(args[1]);
                Location location = target.getLocation();
                player.teleport(location);
                player.sendMessage(Data.prefix + "§5Du wurdest zu §a" + target.getName() + " §5teleportiert.");
            }
        }
        return false;
    }
}
