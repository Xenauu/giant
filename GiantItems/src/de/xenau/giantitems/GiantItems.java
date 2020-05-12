package de.xenau.giantitems;

import de.xenau.giantitems.commands.SpawnCommand;
import de.xenau.giantitems.listener.DamageListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class GiantItems extends JavaPlugin {

    public static String prefix = "§3٠§b•§9● §bBungee §8× §7";

    @Override
    public void onEnable() {

        getCommand("items").setExecutor(new SpawnCommand());

        Bukkit.getPluginManager().registerEvents(new DamageListener(), this);

    }
}
