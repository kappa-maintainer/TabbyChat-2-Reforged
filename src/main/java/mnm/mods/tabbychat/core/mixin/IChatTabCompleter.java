package mnm.mods.tabbychat.core.mixin;

import net.minecraft.client.gui.GuiTextField;
import net.minecraft.util.TabCompleter;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(TabCompleter.class)
public interface IChatTabCompleter {

    @Accessor
    @Mutable
    void setTextField(GuiTextField textfield);
}
