package com.rocklandband.letsmodreboot.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockMultiTexture extends BlockLMRB
{
    public IIcon topIcon, bottomIcon, sideIcon;


    public BlockMultiTexture()
    {
        this(Material.rock);
    }

    public BlockMultiTexture(Material material)
    {
        super(material);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int metadata)
    {
        if (side == 0)
        {
            return topIcon;
        }
        else if (side == 1)
        {
            return bottomIcon;
        }
        else
        {
            return sideIcon;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        topIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()
        )) + "Top");
        bottomIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()
        )) + "Bottom");
        sideIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName()
        )) + "Side");
    }


}
