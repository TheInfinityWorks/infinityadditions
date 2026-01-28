package iw.infinityadditions.item;

import iw.infinityadditions.InfinityAdditions;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import static iw.infinityadditions.block.ModBlocks.*;
import static iw.infinityadditions.item.ModItems.CACTUS_FIBER;
import static iw.infinityadditions.item.ModItems.RUBY;

public class ModItemGroups {
    public static final ItemGroup INFINITY_ADDITIONS_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(InfinityAdditions.MOD_ID, "infinity_additions_group"), FabricItemGroup.builder().icon(() -> new ItemStack(RUBY))
                    .displayName(Text.translatable("itemgroup.infinityadditions.infinity_additions"))
                    .entries((displayContext, entries) -> {
                        entries.add(RUBY);
                        entries.add(RUBY_BLOCK);
                        entries.add(NETHER_RUBY_ORE);
                        entries.add(CACTUS_FIBER);
//                        entries.add(ORIGINAL_RUBY_BLOCK);
//                        entries.add(REPLICA_RUBY_BLOCK);
                    })
            .build());
    public static void registerItemGroups(){
        InfinityAdditions.LOGGER.info("Registering the Item Group for Infinity Additions!");
    }
}
