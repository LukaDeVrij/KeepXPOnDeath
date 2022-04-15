package me.lifelessnerd.keepxpondeath;

import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import java.util.Objects;

public class DeathListener implements Listener {

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {

        Player player = event.getEntity();

        try {

            if (Objects.requireNonNull(event.getEntity().getKiller()).getType() == EntityType.PLAYER) { //If killer is another player

                System.out.println("debug1");
                event.setDroppedExp(0);
                event.setKeepLevel(true);
                player.sendMessage("Omdat je bent gedood door een andere speler behoud je je XP.");

            }
        } catch (Exception e) {

        }
    }

}
