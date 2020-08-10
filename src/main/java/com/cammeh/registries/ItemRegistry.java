package com.cammeh.registries;

import com.cammeh.util.References;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemRegistry {

    public static final Item TEST_ITEM = new Item(new Item.Settings()
        .group(ItemGroup.MISC)
    );

    public static void register() {
        Registry.register(Registry.ITEM, new Identifier(References.MOD_ID, "test_item"), TEST_ITEM);
    }

}
