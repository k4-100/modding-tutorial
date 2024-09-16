package net.kaseta.tutorialmod.event;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.kaseta.tutorialmod.TutorialMod;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TutorialMod.MODID)
public class ModEvents {

  @SubscribeEvent
  public static void addCustomTrades(VillagerTradesEvent event) {
    if (event.getType() == VillagerProfession.FARMER) {
      Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

      // trades.get(0).add((pTrader, pRandom) -> new MerchantOffer(
      // new ItemStack(Items.EMERALD, 2), new ItemStack(Items.ANVIL, 40), 2, 12,
      // 0.75f));
      trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
          new ItemStack(Items.EMERALD, 2), new ItemStack(Items.ANVIL, 40), 2, 12, 0.75f));
    }

  }

}
