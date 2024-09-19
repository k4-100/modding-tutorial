package net.kaseta.tutorialmod.datagen;

import net.kaseta.tutorialmod.TutorialMod;
import net.kaseta.tutorialmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateGenerator extends BlockStateProvider {

  public ModBlockStateGenerator(PackOutput output, ExistingFileHelper exFileHelper) {
    super(output, TutorialMod.MODID, exFileHelper);

  }

  @Override
  protected void registerStatesAndModels() {
    blockWithItem(ModBlocks.GRADIENT_BLOCK);
    // blockW(ModBlocks.GRADIENT_BLOCK);
  }

  private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
    simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));

  }

}
