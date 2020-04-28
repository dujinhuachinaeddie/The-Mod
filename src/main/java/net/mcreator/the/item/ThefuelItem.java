
package net.mcreator.the.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.the.itemgroup.ThetabItemGroup;
import net.mcreator.the.TheElements;

@TheElements.ModElement.Tag
public class ThefuelItem extends TheElements.ModElement {
	@ObjectHolder("the:thefuel")
	public static final Item block = null;
	public ThefuelItem(TheElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ThetabItemGroup.tab).maxStackSize(64));
			setRegistryName("thefuel");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
