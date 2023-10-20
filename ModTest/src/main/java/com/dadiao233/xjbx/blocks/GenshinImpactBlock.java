package com.dadiao233.xjbx.blocks;


import com.dadiao233.xjbx.Xjbx;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;

public class GenshinImpactBlock extends Block {
    public GenshinImpactBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(0.1f,01f)
                .sound(SoundType.METAL)
                .harvestLevel(0)
                .setRequiresTool()
                .harvestTool(ToolType.PICKAXE)
                .setLightLevel(value -> 15)
        );
    }
}
