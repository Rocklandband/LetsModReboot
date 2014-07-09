package com.rocklandband.letsmodreboot.block;

import com.rocklandband.letsmodreboot.reference.Names;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class BlockRadio extends BlockMultiTexture
{
    public BlockRadio()
    {
        super();
        this.setBlockName(Names.Blocks.RADIO);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float px, float py,
                                 float pz)
    {
        player.addChatMessage(new ChatComponentText(String.format("Yo, Block activated at %s, %s, %s", x, y, z)));
        return true;
    }
}
