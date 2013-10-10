package bungeeCordPlugin;

import net.md_5.bungee.api.event.ChatEvent;
import net.md_5.bungee.api.event.LoginEvent;
import net.md_5.bungee.api.event.PermissionCheckEvent;
import net.md_5.bungee.api.event.PlayerDisconnectEvent;
import net.md_5.bungee.api.event.PlayerHandshakeEvent;
import net.md_5.bungee.api.event.PluginMessageEvent;
import net.md_5.bungee.api.event.PostLoginEvent;
import net.md_5.bungee.api.event.ProxyPingEvent;
import net.md_5.bungee.api.event.ServerConnectEvent;
import net.md_5.bungee.api.event.ServerConnectedEvent;
import net.md_5.bungee.api.event.ServerKickEvent;
import net.md_5.bungee.api.event.ServerSwitchEvent;
import net.md_5.bungee.api.event.TargetedEvent;
import net.md_5.bungee.api.plugin.Listener;
import net.md_5.bungee.event.EventHandler;

public class BungeeCordPluginListener implements Listener {
  BungeeCordPlugin plugin;

  public BungeeCordPluginListener(BungeeCordPlugin plugin) {
    this.plugin = plugin;
  }

  @EventHandler
  public void onChatEvent(ChatEvent event) {
    /**
     * Event called when a player sends a message to a server, or a server sends a
     * message to a player.
     */
  }
  
  @EventHandler
  public void onLoginEvent(LoginEvent event) {
    /**
     * Event called to represent a player logging in.
     */
  }
  
  @EventHandler
  public void onPermissionCheckEvent(PermissionCheckEvent event) {
    /**
     * Called when the permission of a CommandSender is checked.
     */
  }
  
  @EventHandler
  public void onPlayerDisconnectEvent(PlayerDisconnectEvent event) {
    /**
     * Called when a player has left the proxy, it is not safe to call any methods
     * that perform an action on the passed player instance.
     */
  }
  
  @EventHandler
  public void onPlayerHandshakeEvent(PlayerHandshakeEvent event) {
    /**
     * Event called to represent a player first making their presence and username
     * known.
     */
  }
  
  @EventHandler
  public void onPluginMessageEvent(PluginMessageEvent event) {
    /**
     * Event called when a plugin message is sent to the client or server.
     */
  }
  
  @EventHandler
  public void onPostLoginEventEvent(PostLoginEvent event) {
    /**
     * Event called as soon as a connection has an {@link ProxiedPlayer} and is
     * ready to be connected to a server.
     */
  }
  
  @EventHandler
  public void onProxyPingEvent(ProxyPingEvent event) {
    /**
     * Called when the proxy is pinged with packet 0xFE from the server list.
     */
  }
  
  @EventHandler
  public void onServerConnectEvent(ServerConnectEvent event) {
    /**
     * Player connecting to a new server.
     */
  }
  
  @EventHandler
  public void onServerConnectedEvent(ServerConnectedEvent event) {
    /**
     * Not to be confused with {@link ServerConnectEvent}, this event is called once
     * a connection to a server is fully operational, and is about to hand over
     * control of the session to the player. It is useful if you wish to send
     * information to the server before the player logs in.
     */
  }
  
  @EventHandler
  public void onServerKickEvent(ServerKickEvent event) {
    /**
     * Represents a player getting kicked from a server.
     */
  }
  
  @EventHandler
  public void onServerSwitchEvent(ServerSwitchEvent event) {
    /**
     * Called when a player has changed servers.
     */
  }
  
  @EventHandler
  public void onTargetEvent(TargetedEvent event) {
    /**
     * An event which occurs in the communication between two nodes.
     */
  }
}
