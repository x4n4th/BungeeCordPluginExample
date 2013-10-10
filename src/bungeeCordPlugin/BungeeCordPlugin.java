package bungeeCordPlugin;

import net.md_5.bungee.api.ProxyServer;
import net.md_5.bungee.api.plugin.Plugin;

public class BungeeCordPlugin extends Plugin {

  /**
   * Called when the plugin has just been loaded. Most of the proxy will not be
   * initialized, so only use it for registering
   */
  @Override
  public void onLoad() {
    
  }

  /**
   * Called when this plugin is enabled.
   */
  @Override
  public void onEnable() {
    
    /*
     * Register Listener with BungeeCord plugin
     */
    ProxyServer.getInstance().getPluginManager().registerListener(this, new BungeeCordPluginListener(this));
  }

  /**
   * Called when this plugin is disabled.
   */
  @Override
  public void onDisable() {
    
  }
}
