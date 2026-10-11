package com.barclient.mod.hud;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.ScaledResolution;

public class BarClientHUD extends Gui {
    private final Minecraft mc = Minecraft.getMinecraft();

    public void render() {
        ScaledResolution res = new ScaledResolution(mc);
        int width = res.getScaledWidth();
        int height = res.getScaledHeight();

        // Draw FPS
        String fpsText = "FPS: " + Minecraft.getDebugFPS();
        drawString(mc.fontRendererObj, fpsText, 2, 2, 0xFFFFFF);

        // Draw coordinates
        String coordsText = String.format("XYZ: %.1f / %.1f / %.1f", mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ);
        drawString(mc.fontRendererObj, coordsText, 2, 12, 0xFFFFFF);

        // Draw potion effects
        // Add code to display active potion effects

        // Draw armor
        // Add code to display armor durability
    }
}
