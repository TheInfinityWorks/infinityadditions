package iw.infinityadditions;

import iw.infinityadditions.item.ModItems;
import net.fabricmc.api.ClientModInitializer;

public class InfinityAdditionsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModItems.registerModItems();
    }
}
