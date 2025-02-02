package mezz.jei.fabric.platform;

import mezz.jei.common.platform.IPlatformRecipeHelper;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.crafting.CraftingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.crafting.UpgradeRecipe;
import org.jetbrains.annotations.Nullable;

public class RecipeHelper implements IPlatformRecipeHelper {
    @Override
    public <T extends CraftingRecipe> int getWidth(T recipe) {
        if (recipe instanceof ShapedRecipe shapedRecipe) {
            return shapedRecipe.getWidth();
        }
        return 0;
    }

    @Override
    public <T extends CraftingRecipe> int getHeight(T recipe) {
        if (recipe instanceof ShapedRecipe shapedRecipe) {
            return shapedRecipe.getHeight();
        }
        return 0;
    }

    @Override
    public Ingredient getBase(UpgradeRecipe recipe) {
        return recipe.base;
    }

    @Override
    public Ingredient getAddition(UpgradeRecipe recipe) {
        return recipe.addition;
    }

    @Override
    @Nullable
    public ResourceLocation getRegistryNameForRecipe(Object object) {
        if (object instanceof Recipe recipe) {
            return recipe.getId();
        }
        return null;
    }
}
