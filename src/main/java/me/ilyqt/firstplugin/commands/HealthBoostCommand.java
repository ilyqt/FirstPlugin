package me.ilyqt.firstplugin.commands;


import me.ilyqt.firstplugin.utils.Utils;
import org.bukkit.entity.Player;
import org.bukkit.potion.Potion;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

public class HealthBoostCommand extends PlayerCommand {

    public HealthBoostCommand() {
        super("healthboost");

        setAliases(Arrays.asList("hb", "boost"));
    }

    @Override
    protected void run(Player player, String[] args) {
        if (!player.hasPermission("ilyqt.healthboost")) {
            Utils.tell(player, "&cYou don't have permission.");

            return;
        }

        PotionEffect effect = new PotionEffect(PotionEffectType.REGENERATION, 200, 10);

        player.setMaxHealth(100);
        player.addPotionEffect(effect);
        player.sendMessage(Utils.colorize("&6You have been given health boost."));
    }
}
