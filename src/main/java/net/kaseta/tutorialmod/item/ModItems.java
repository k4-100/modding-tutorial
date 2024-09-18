package net.kaseta.tutorialmod.item;

import net.kaseta.tutorialmod.TutorialMod;
import net.minecraft.world.item.BowItem;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MODID);
  public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties()));
  public static final RegistryObject<Item> ASTO = ITEMS.register("asto", () -> new Item(new Item.Properties()));
  // public static final RegistryObject<Item> ASTO = ITEMS.register("asto", () -> new Item(new Item.Properties()));
  public static final RegistryObject<Item> PIFPAF = ITEMS.register("pifpaf",
      () -> new Item(new Item.Properties()));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
