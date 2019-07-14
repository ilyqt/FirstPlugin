package me.ilyqt.firstplugin;

import me.ilyqt.firstplugin.commands.FirstCommand;
import me.ilyqt.firstplugin.events.JoinEvent;
import me.ilyqt.firstplugin.events.DamageEvent;
import me.ilyqt.firstplugin.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.event.Listener;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin {

    public static FirstPlugin instance;

    public void onEnable() {
        instance = this;

        getLogger().info(Utils.colorize("&aSuccess! &bFirstPlugin has been enabled."));

        registerCommands(
                new FirstCommand());

        registerEvents(
                new JoinEvent(),
                new DamageEvent());
    }

    private void registerCommands(Command... cmds) {
        for (final Command cmd : cmds)
            Utils.registerCommand(cmd);
    }

    private void registerEvents(Listener... listeners) {
        final PluginManager pm = getServer().getPluginManager();

        for (final Listener l : listeners)
            pm.registerEvents(l, this);
    }

    public void onDisable() {
        instance = null;
    }
}
