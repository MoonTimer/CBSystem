package me.moontimer.cbsystem;

import me.moontimer.cbsystem.commands.FlyCommand;
import me.moontimer.cbsystem.commands.GameModeCommand;
import me.moontimer.cbsystem.commands.GodCommand;
import me.moontimer.cbsystem.commands.HealCommand;
import me.moontimer.cbsystem.commands.tp.TPAllCommand;
import me.moontimer.cbsystem.commands.tp.TPCommand;
import me.moontimer.cbsystem.commands.tp.TPHereCommand;
import me.moontimer.cbsystem.listener.DamageListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.management.BufferPoolMXBean;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getCommand("fly").setExecutor(new FlyCommand());
        getCommand("gamemode").setExecutor(new GameModeCommand());
        getCommand("god").setExecutor(new GodCommand());
        getCommand("heal").setExecutor(new HealCommand());
        getCommand("tpall").setExecutor(new TPAllCommand());
        getCommand("tp").setExecutor(new TPCommand());
        getCommand("tphere").setExecutor(new TPHereCommand());

        Bukkit.getPluginManager().registerEvents(new DamageListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
