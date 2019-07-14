package me.ilyqt.firstplugin.events;

import me.ilyqt.firstplugin.utils.Utils;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class JoinEvent implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e) {
        Player pl = e.getPlayer();

        pl.sendMessage(Utils.colorize("&aWelcome to the server!"));
        pl.sendMessage(Utils.colorize("&d&lThis message is brought to you by FirstPlugin by ilyqt."));

        ItemStack it = new ItemStack(Material.DIAMOND, 64);
        ItemMeta m = it.getItemMeta();

        m.setDisplayName(Utils.colorize("&6&lWelcome to the server!"));
        m.setLore(Arrays.asList(
                " ",
                Utils.colorize("&cilyqt gave you this item."),
                Utils.colorize("&eGuard it with your life!"),
                " "));

        it.setItemMeta(m);
        pl.getInventory().addItem(it);
    }
}
