    package elementalItems.items;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class newItem extends Item {
    public newItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity playerEntity, Hand hand) {
        playerEntity.setVelocity(playerEntity.getVelocity().x,1,playerEntity.getVelocity().z);

        return TypedActionResult.success(playerEntity.getStackInHand(hand));
    }
}
