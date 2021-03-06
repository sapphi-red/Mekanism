package mekanism.client.gui.element;

import mekanism.client.gui.IGuiWrapper;
import mekanism.common.util.MekanismUtils;
import mekanism.common.util.MekanismUtils.ResourceType;
import net.minecraft.util.ResourceLocation;

public class GuiBucketIO extends GuiTexturedElement {

    public GuiBucketIO(IGuiWrapper gui, ResourceLocation def) {
        super(MekanismUtils.getResource(ResourceType.GUI_ELEMENT, "bucket.png"), gui, def, gui.getWidth(), 66, 26, 57);
    }

    @Override
    public void renderButton(int mouseX, int mouseY, float partialTicks) {
        minecraft.textureManager.bindTexture(getResource());
        guiObj.drawModalRectWithCustomSizedTexture(x, y, 0, 0, width, height, width, height);
        minecraft.textureManager.bindTexture(defaultLocation);
    }

    //TODO: Figure out what the point of the below was
    /*@Override
    public void preMouseClicked(double mouseX, double mouseY, int button) {
        if (inBounds(mouseX, mouseY)) {
            offsetX(26);
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        if (inBounds(mouseX, mouseY)) {
            offsetX(-26);
            return true;
        }
        return super.mouseClicked(mouseX, mouseY, button);
    }*/
}