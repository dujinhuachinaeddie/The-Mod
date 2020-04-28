
package net.mcreator.the.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.the.itemgroup.ThetabItemGroup;
import net.mcreator.the.TheElements;

@TheElements.ModElement.Tag
public class TheshovelItem extends TheElements.ModElement {
	@ObjectHolder("the:theshovel")
	public static final Item block = null;
	public TheshovelItem(TheElements instance) {
		super(instance, 29);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 32f;
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
		}, 1, -3f, new Item.Properties().group(ThetabItemGroup.tab)) {
		}.setRegistryName("theshovel"));
	}
}
