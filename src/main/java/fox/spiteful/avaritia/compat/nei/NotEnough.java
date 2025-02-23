package fox.spiteful.avaritia.compat.nei;

import net.minecraft.item.ItemStack;

import codechicken.nei.api.API;

public class NotEnough {

    public static void items() {
        ExtremeShapedRecipeHandler shaped = new ExtremeShapedRecipeHandler();
        ExtremeShapelessRecipeHandler shapeless = new ExtremeShapelessRecipeHandler();
        CompressionHandler compress = new CompressionHandler();
        API.registerRecipeHandler(shaped);
        API.registerRecipeHandler(shapeless);
        API.registerRecipeHandler(compress);
        API.registerUsageHandler(shaped);
        API.registerUsageHandler(shapeless);
        API.registerUsageHandler(compress);
    }

    public static void hide(ItemStack stack) {
        API.hideItem(stack);
    }
}
