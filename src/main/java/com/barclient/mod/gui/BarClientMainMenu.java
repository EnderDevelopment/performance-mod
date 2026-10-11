package com.barclient.mod.gui;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.renderer.GlStateManager;

public class BarClientMainMenu extends GuiScreen {
    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        // Draw black to red gradient background
        GlStateManager.disableTexture2D();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ZERO);
        GlStateManager.shadeModel(7425);
        GlStateManager.pushMatrix();
        GlStateManager.begin(7);
        GlStateManager.color(0.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.vertex(0, height, 0.0D);
        GlStateManager.color(1.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.vertex(width, height, 0.0D);
        GlStateManager.color(1.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.vertex(width, 0, 0.0D);
        GlStateManager.color(0.0F, 0.0F, 0.0F, 1.0F);
        GlStateManager.vertex(0, 0, 0.0D);
        GlStateManager.end();
        GlStateManager.popMatrix();
        GlStateManager.shadeModel(7424);
        GlStateManager.disableBlend();
        GlStateManager.enableTexture2D();
        // Add other GUI elements here
    }
}
