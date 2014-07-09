package com.rocklandband.letsmodreboot.init;

import com.rocklandband.letsmodreboot.block.BlockLMRB;
import com.rocklandband.letsmodreboot.block.BlockRadio;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlocks
{
    public static final BlockLMRB radio = new BlockRadio();

    public static void init()
    {
        GameRegistry.registerBlock(radio, "radio");
    }
}
