package kr.antos112.ict;

import org.bukkit.plugin.java.JavaPlugin;

public final class ItemCoolTime extends JavaPlugin {
    private static JavaPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getServer().getConsoleSender().sendMessage("§e[ItemCoolTime] 'ItemCoolTime' 플러그인이 활성화되었습니다");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getServer().getConsoleSender().sendMessage("§e[ItemCoolTime] 'ItemCoolTime' 플러그인이 활성화되었습니다");
    }

    public static JavaPlugin getInstance() {
        return plugin;
    }
}
