
package net.mcreator.spacevs.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RawCompositeItem extends Item {
	public RawCompositeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
