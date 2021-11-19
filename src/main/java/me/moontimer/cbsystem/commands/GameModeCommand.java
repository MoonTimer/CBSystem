package me.moontimer.cbsystem.commands;

import me.moontimer.cbsystem.Data;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameModeCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("cb.gamemode")) {
            if (args.length == 0) {
                player.sendMessage(Data.prefix + "§cFalscher Syntax. /gamemode (0,1,2,3)");
            }
            if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "0":
                        player.setGameMode(GameMode.SURVIVAL);
                        player.sendMessage(Data.prefix + "§5Dein Spielomodus wurde auf Überleben gesetzt");
                        break;
                    case "1":
                        player.setGameMode(GameMode.CREATIVE);
                        player.sendMessage(Data.prefix + "§5Dein Spielomodus wurde auf Kreativ gesetzt");
                        break;
                    case "2":
                        player.setGameMode(GameMode.ADVENTURE);
                        player.sendMessage(Data.prefix + "§5Dein Spielomodus wurde auf Adventure gesetzt");
                        break;
                    case "3":
                        player.setGameMode(GameMode.SPECTATOR);
                        player.sendMessage(Data.prefix + "§5Dein Spielomodus wurde auf Zuschauer gesetzt");
                        break;
                    default:
                        player.sendMessage(Data.prefix + "§5Falscher Syntax /gamemode (0,1,2,3)");
                }
            }
        }
        return false;
    }
}
