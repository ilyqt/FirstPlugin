package me.ilyqt.firstplugin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ilyqt.firstplugin.utils.Utils;


public abstract class PlayerCommand extends Command {

    protected PlayerCommand(String name) {
        super(name);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {

        if (!(sender instanceof Player)) {
            Utils.tell(sender, "&4You must be a player!!");

            return false;
        }

        run((Player) sender, args);
        return true;
    }

    protected abstract void run(Player player, String[] args);
}

