package me.ilia.antieggdrop;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEggDrop extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getConsoleSender().sendMessage(MiniMessage.miniMessage().deserialize("<aqua>ilyaSeven7</aqua> <dark_gray>>>></dark_gray> <white>AntiEggDrop</white> <green>Has Been Enable!</green>"));
        getServer().getPluginManager().registerEvents(this, this);
    }


    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("<aqua>ilyaSeven7</aqua> <dark_gray>>>></dark_gray> <white>AntiEggDrop</white> <dark_red>Has Been Disable!</dark_red>");
    }
    @EventHandler
    public void OnEggDrop(ItemSpawnEvent event){
        if (event.getEntity().getItemStack().getType().equals(Material.EGG)){
            event.setCancelled(true);
        }
    }


}
