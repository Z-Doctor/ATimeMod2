package com.router1011.atimemod2.blocks;

import net.minecraft.block.material.Material;

public class SteelOre extends BlockBase {

	public SteelOre(String blockName, Material material) {
		super(blockName, material);
		this.setHarvestLevel("pickaxe", 3);
	}

}
