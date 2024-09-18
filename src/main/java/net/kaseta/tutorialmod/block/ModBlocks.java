package net.kaseta.tutorialmod.block;

import java.rmi.registry.Registry;
import java.util.function.Supplier;

import net.kaseta.tutorialmod.TutorialMod;
import net.kaseta.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
  public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
      TutorialMod.MODID);

  // public static final RegistryObject<Block> BRAZIER = registerBlock(
  //     "brazier",
  //     () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
  //         .sound(SoundType.ANVIL)));
  //
  public static final RegistryObject<Block> GRADIENT_BLOCK = registerBlock(
      "gradient_block",
      () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)
          .sound(SoundType.ANVIL)));


  private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
