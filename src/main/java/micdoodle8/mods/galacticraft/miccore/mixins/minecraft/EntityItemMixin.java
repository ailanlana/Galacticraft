package micdoodle8.mods.galacticraft.miccore.mixins.minecraft;

import micdoodle8.mods.galacticraft.core.util.WorldUtil;
import net.minecraft.entity.item.EntityItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EntityItem.class)
public abstract class EntityItemMixin {

    @ModifyConstant(method = "onUpdate", constant = @Constant(doubleValue = 0.9800000190734863D), require = 1)
    private double onOnUpdate(double value) {
        return WorldUtil.getItemGravity((EntityItem) (Object) this);
    }

    // CHECK
}
