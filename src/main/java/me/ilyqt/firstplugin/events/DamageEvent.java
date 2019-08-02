package me.ilyqt.firstplugin.events;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.ArrayList;

import static org.bukkit.event.EventPriority.HIGHEST;

public class DamageEvent implements Listener {

    @EventHandler(priority = HIGHEST)
    public void onDamage(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            event.setCancelled(true);  /* You could use event.setDamage(0); but it is ass. */
        }
    }
}
