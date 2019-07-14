package me.ilyqt.firstplugin.commands;

import me.ilyqt.firstplugin.FirstPlugin;
import me.ilyqt.firstplugin.utils.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class FirstCommand extends PlayerCommand {

    public FirstCommand() {
        super("firstcommand");

        setAliases(Arrays.asList("fc", "first"));
    }

    @Override
    protected void run(Player player, String[] args) {
        if (!player.hasPermission("ilyqt.firstcommand")) {
            Utils.tell(player, "&cYou don't have permission.");

            return;
        }

        Utils.tell(player, "&d&lHey there &b" + player.getName());
    }

}


