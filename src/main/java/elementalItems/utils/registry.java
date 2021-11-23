package elementalItems.utils;

import elementalItems.items.newItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class registry {
    public static final Item NEW_ITEM = new newItem(new FabricItemSettings().group(ItemGroup.MISC));

    public static void initalize() {
        Registry.register(Registry.ITEM, new Identifier("elementalitems", "new_item"), NEW_ITEM);


    }
}
