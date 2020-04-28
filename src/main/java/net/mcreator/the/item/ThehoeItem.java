
package net.mcreator.the.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.the.itemgroup.ThetabItemGroup;
import net.mcreator.the.TheElements;

@TheElements.ModElement.Tag
public class ThehoeItem extends TheElements.ModElement {
	@ObjectHolder("the:thehoe")
	public static final Item block = null;
	public ThehoeItem(TheElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 3f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(ThethingItem.block, (int) (1)), new ItemStack(ThenuggetItem.block, (int) (1)));
			}
		}, -3f, new Item.Properties().group(ThetabItemGroup.tab)) {
		}.setRegistryName("thehoe"));
	}
}
