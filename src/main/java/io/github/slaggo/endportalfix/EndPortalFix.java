package io.github.slaggo.endportalfix;

import io.github.slaggo.endportalfix.listeners.PlayerListener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class EndPortalFix extends JavaPlugin {
    
    private static Plugin instance = null;
    
    @Override
    public void onEnable() {
        instance = this;
        
        PluginManager pm = getServer().getPluginManager();
        
        pm.registerEvents(new PlayerListener(this), this);
        
        getLogger().info("EndPortalFix by slaggo enabled!");
    }
    
    @Override
    public void onDisable() {}
    
}
