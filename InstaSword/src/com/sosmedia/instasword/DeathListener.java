package com.sosmedia.instasword;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class DeathListener implements Listener {
	@EventHandler
	public void damageEvent(EntityDamageByEntityEvent event) {
		if(event.getEntity() instanceof Player) {
			Player player = (Player) event.getEntity();
			PlayerInventory inv = player.getInventory();
			if(inv.contains(276)) {
				int slot = inv.first(276); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(283)) {
				int slot = inv.first(283); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(267)) {
				int slot = inv.first(267); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(272)) {
				int slot = inv.first(272); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);
			} else if(inv.contains(268)) {
				int slot = inv.first(268); 					
				int currentSlot = inv.getHeldItemSlot(); 				
				ItemStack currentSlotItem = inv.getItem(currentSlot); 	
				ItemStack slotItem = inv.getItem(slot); 				
				inv.setItem(slot, currentSlotItem); 					
				inv.setItem(currentSlot, slotItem);

			}
		}
	}
}
