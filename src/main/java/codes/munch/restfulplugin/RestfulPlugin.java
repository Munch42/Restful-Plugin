package codes.munch.restfulplugin;

import codes.munch.restfulplugin.utils.ChatUtils;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class RestfulPlugin extends JavaPlugin {

    private static final Logger log = Logger.getLogger("Minecraft");

    private RestfulPlugin plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        System.out.println(ChatUtils.parseColourCodes("Restful Plugin - Enabled"));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println(ChatUtils.parseColourCodes("Restful Plugin - Disabled"));
    }
}
