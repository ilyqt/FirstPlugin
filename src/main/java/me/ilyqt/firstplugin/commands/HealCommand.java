package me.ilyqt.firstplugin.commands;

import me.ilyqt.firstplugin.utils.Utils;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class HealCommand extends PlayerCommand {

    public HealCommand() {
        super("heal");

        setAliases(Arrays.asList("hearts", "healcommand"));
    }

    @Override
    protected void run(Player player, String[] args) {
        if (!player.hasPermission("ilyqt.heal")) {
            Utils.tell(player, "&cYou don't have permission.");

            return;
        }

        player.setHealth(20);
        player.sendMessage(Utils.colorize("&bYour hearts have been filled but you cant rely on this to not quickdrop"));
    }
}
