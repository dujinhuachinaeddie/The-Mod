
package net.mcreator.the.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.the.itemgroup.ThetabItemGroup;
import net.mcreator.the.TheElements;

@TheElements.ModElement.Tag
public class ThestrangefoodItem extends TheElements.ModElement {
	@ObjectHolder("the:thestrangefood")
	public static final Item block = null;
	public ThestrangefoodItem(TheElements instance) {
		super(instance, 7);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(ThetabItemGroup.tab).maxStackSize(64)
					.food((new Food.Builder()).hunger(14).saturation(0.3f).setAlwaysEdible().build()));
			setRegistryName("thestrangefood");
		}

		@Override
		public UseAction getUseAction(ItemStack par1ItemStack) {
			return UseAction.EAT;
		}
	}
}
