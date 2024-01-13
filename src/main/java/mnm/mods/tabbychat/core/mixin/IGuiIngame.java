package mnm.mods.tabbychat.core.mixin;

import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.GuiNewChat;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(GuiIngame.class)
public interface IGuiIngame {

    @Accessor
    @Mutable
    void setPersistantChatGUI(GuiNewChat chat);
}
