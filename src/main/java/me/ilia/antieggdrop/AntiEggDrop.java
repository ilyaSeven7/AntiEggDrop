package me.ilia.antieggdrop;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEggDrop extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage("Plugin Has Been Enable!!");
        getServer().getPluginManager().registerEvents(this, this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("Plugin Has Been Disable!!");
    }
    @EventHandler
    public void OnEggDrop(ItemSpawnEvent event){
        if (event.getEntity().getItemStack().getType().equals(Material.EGG)){
            getServer().getConsoleSender().sendMessage("Doesn't Work");
            event.setCancelled(true);
        }
    }


}
