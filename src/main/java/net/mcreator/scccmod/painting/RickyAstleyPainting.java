
package net.mcreator.scccmod.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.scccmod.ScccModModElements;

@ScccModModElements.ModElement.Tag
public class RickyAstleyPainting extends ScccModModElements.ModElement {
	public RickyAstleyPainting(ScccModModElements instance) {
		super(instance, 2);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(64, 64).setRegistryName("ricky_astley"));
	}
}
