
package net.mcreator.the.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.the.item.ThefuelItem;
import net.mcreator.the.TheElements;

@TheElements.ModElement.Tag
public class ThefueltumeFuel extends TheElements.ModElement {
	public ThefueltumeFuel(TheElements instance) {
		super(instance, 27);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(ThefuelItem.block, (int) (1)).getItem())
			event.setBurnTime(1600);
	}
}
