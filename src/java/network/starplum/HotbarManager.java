package network.starplum;

import org.bukkit.plugin.java.JavaPlugin;

public class HotbarManager extends JavaPlugin {
	
	private static HotbarManager manager;
	public static HotbarManager getManager() { return manager; }
	
	@Override
	public void onEnable() {
		manager = this;
	}
	
	@Override public String toString() { return "Wha- ?"; }
	
}
