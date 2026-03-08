package info.preva1l.fadah;

import info.preva1l.trashcan.extension.BasePlugin;
import info.preva1l.trashcan.extension.annotations.PluginDisable;
import info.preva1l.trashcan.extension.annotations.PluginEnable;
import info.preva1l.trashcan.extension.annotations.PluginLoad;

/**
 * Created on 25/04/2025
 *
 * @author Preva1l
 */
public final class TestPlugin extends BasePlugin {
    public static TestPlugin instance;

    private boolean loaded = false;
    private boolean enabled = false;
    private boolean disabled = false;

    public TestPlugin() {
        instance = this;
    }

    @PluginLoad
    public void load() {
        loaded = true;
    }

    @PluginEnable
    public void enable() {
        enabled = true;
    }

    @PluginDisable
    public void disable() {
        disabled = true;
        enabled = false;
    }
}
