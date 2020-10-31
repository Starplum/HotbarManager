package network.starplum.hotbar;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public abstract class Hotbar {

	protected static void clearHotbar(Player player) {
		final ItemStack AIR = new ItemStack(Material.AIR);
		for(int a = 0; a < 8; a++) { player.getInventory().setItem(a, AIR); }
	}
	
	protected abstract void constructor();
	protected abstract void init();
	protected abstract void remove(Player player);
	
	@EventHandler public abstract void load();
	@EventHandler public abstract void interact(PlayerInteractEvent interactEvent);
	
}
