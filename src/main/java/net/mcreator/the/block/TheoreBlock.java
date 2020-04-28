
package net.mcreator.the.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.storage.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.the.itemgroup.ThetabItemGroup;
import net.mcreator.the.item.ThethingItem;
import net.mcreator.the.TheElements;

import java.util.List;
import java.util.Collections;

@TheElements.ModElement.Tag
public class TheoreBlock extends TheElements.ModElement {
	@ObjectHolder("the:theore")
	public static final Block block = null;
	public TheoreBlock(TheElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(ThetabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.7f, 10f).lightValue(0).harvestLevel(4)
					.harvestTool(ToolType.PICKAXE));
			setRegistryName("theore");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(ThethingItem.block, (int) (1)));
		}
	}
}
