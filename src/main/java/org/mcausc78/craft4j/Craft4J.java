package org.mcausc78.craft4j;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Level;

/**
 *
 * Represents a plugin.
 *
 * @since 1.0.0
 * @author mcausc78
 * @version 1.0.0
 *
 */
public final class Craft4J extends JavaPlugin {
    private static Craft4J instance;
    /**
     *
     * Enable actions.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public void onEnable() {
        instance = this;
        System.out.printf("[%s] Enabled.\n", getDescription().getName());

    }

    /**
     * Disable actions.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public void onDisable() {
        // Plugin shutdown logic
    }

    /**
     *
     * Get a plugin instance.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public static Craft4J getInstance() {
        return instance;
    }
    /**
     * Log a message.
     *
     * @since 1.0.0
     * @author mcausc78
     * @version 1.0.0
     *
     */
    public static void log(Level level, String string) {
        getInstance().getLogger().log(level, string);
    }
    public static void log(String string) {
        getInstance().getLogger().log(Level.INFO, string);
    }
}
