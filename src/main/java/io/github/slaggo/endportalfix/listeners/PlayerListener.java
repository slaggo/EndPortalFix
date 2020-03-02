package io.github.slaggo.endportalfix.listeners;

import io.github.slaggo.endportalfix.EndPortalFix;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class PlayerListener implements Listener {
    EndPortalFix plugin;
    
    public PlayerListener(EndPortalFix instance) {
        plugin = instance;
    }
    
    @EventHandler
    public void onPlayerBucketEmpty(PlayerBucketEmptyEvent e) {
        
        Block b = e.getBlockClicked();
        BlockFace bf = e.getBlockFace();
        
        if(b.getRelative(bf).getType() == Material.ENDER_PORTAL || b.getRelative(bf).getType() == Material.END_GATEWAY)
            e.setCancelled(true);
    }
}
