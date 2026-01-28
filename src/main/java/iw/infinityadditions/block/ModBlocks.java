package iw.infinityadditions.block;

import iw.infinityadditions.InfinityAdditions;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

//    private static Block registerBlock(String name, Block block){
//        registerBlockItem(name, block);
//        return Registry.register(Registries.BLOCK, Identifier.of(InfinityAdditions.MOD_ID, name), block);
//    }
//
//    private static void registerBlockItem(String name, Block block){
//        // return Registry.register(Registries.ITEM, Identifier.of(InfinityAdditions.MOD_ID, name), item);
//        Registry.register(Registries.ITEM, Identifier.of(InfinityAdditions.MOD_ID, name),
//                new BlockItem(block, new Item.Settings()));
//    }

    private static Block registerBlock(String name, AbstractBlock.Settings blockSettings) {
        RegistryKey<Block> key = RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(InfinityAdditions.MOD_ID, name));
        Block block = new Block(blockSettings.registryKey(key));
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, key, block);
    }

    private static void registerBlockItem(String name, Block block) {
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(InfinityAdditions.MOD_ID, name));
        BlockItem item = new BlockItem(block, new Item.Settings().registryKey(key));
        Registry.register(Registries.ITEM, key, item);
    }


    public static final Block RUBY_BLOCK = registerBlock("ruby_block", AbstractBlock.Settings.create().strength(4f, 4f).requiresTool().sounds(BlockSoundGroup.METAL));

    public static final Block NETHER_RUBY_ORE = registerBlock("nether_ruby_ore", AbstractBlock.Settings.create().strength(3.5f, 3f).requiresTool().sounds(BlockSoundGroup.NETHER_ORE));

    public static void registerModBlocks(){
        InfinityAdditions.LOGGER.info("Registering Infinity Additions Mod Blocks!");
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RUBY_BLOCK);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(fabricItemGroupEntries -> { fabricItemGroupEntries.add(NETHER_RUBY_ORE);
        });
    }
}
