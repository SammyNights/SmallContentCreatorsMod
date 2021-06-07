
package net.mcreator.scccmod.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.scccmod.itemgroup.FeckBorgraveItemGroup;
import net.mcreator.scccmod.ScccModModElements;

@ScccModModElements.ModElement.Tag
public class FeckBorgraveModItem extends ScccModModElements.ModElement {
	@ObjectHolder("sccc_mod:feck_borgrave_mod")
	public static final Item block = null;
	public FeckBorgraveModItem(ScccModModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, ScccModModElements.sounds.get(new ResourceLocation("sccc_mod:feck_borgrave_mod")),
					new Item.Properties().group(FeckBorgraveItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("feck_borgrave_mod");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}
	}
}
