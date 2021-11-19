package me.moontimer.cbsystem.listener;

import me.moontimer.cbsystem.commands.GodCommand;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

public class DamageListener implements Listener {

    @EventHandler
    public void onDamage(EntityDamageEvent event) {
        Player player = (Player) event.getEntity();
        if (event instanceof Player) {
            if (GodCommand.god.contains(player.getName())) {
                event.setCancelled(true);
            }
        }
    }
}
