package net.kaseta.tutorialmod.datagen;

import net.kaseta.tutorialmod.TutorialMod;
import net.kaseta.tutorialmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelGenerator extends ItemModelProvider {

  public ModItemModelGenerator(PackOutput output, ExistingFileHelper existingFileHelper) {
    super(output, TutorialMod.MODID, existingFileHelper);

  }

  @Override
  protected void registerModels() {
    simpleItem(ModItems.SAPPHIRE);
    simpleItem(ModItems.ASTO);
  }

  private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
    return withExistingParent(
        // path
        item.getId().getPath(),
        // item/generated in model/*/*.json
        new ResourceLocation("item/generated"))
        // texture settings for a simple item
        .texture("layer0",
            // mod name + 'item/' + item name
            new ResourceLocation(TutorialMod.MODID, "item/" + item.getId().getPath())

        );
  }

}
