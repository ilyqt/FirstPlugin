package me.ilyqt.firstplugin.commands;

import me.ilyqt.firstplugin.utils.Utils;
import org.bukkit.entity.Player;

import java.util.Arrays;

public class FeedCommand extends PlayerCommand {

    public FeedCommand() {
        super("feed");

        setAliases(Arrays.asList("eat", "feedcommand"));
    }

    @Override
    protected void run(Player player, String[] args) {
        if (!player.hasPermission("ilyqt.feed")) {
            Utils.tell(player, "&cYou don't have permission.");

            return;
        }

        player.setFoodLevel(20);
        player.sendMessage(Utils.colorize("&aHooray! Your hunger has been refilled."));
    }

}


