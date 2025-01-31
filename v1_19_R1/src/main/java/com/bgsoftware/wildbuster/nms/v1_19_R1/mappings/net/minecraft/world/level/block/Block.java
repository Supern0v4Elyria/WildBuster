package com.bgsoftware.wildbuster.nms.v1_19_R1.mappings.net.minecraft.world.level.block;

import com.bgsoftware.wildbuster.nms.mapping.Remap;
import com.bgsoftware.wildbuster.nms.v1_19_R1.mappings.MappedObject;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.IBlockData;

public class Block extends MappedObject<net.minecraft.world.level.block.Block> {

    public static Block AIR = new Block(Blocks.a);

    public Block(net.minecraft.world.level.block.Block handle) {
        super(handle);
    }

    @Remap(classPath = "net.minecraft.world.level.block.Block",
            name = "defaultBlockState",
            type = Remap.Type.METHOD,
            remappedName = "m")
    public IBlockData getBlockData() {
        return handle.m();
    }

    @Remap(classPath = "net.minecraft.world.level.block.Block",
            name = "stateById",
            type = Remap.Type.METHOD,
            remappedName = "a")
    public static IBlockData getByCombinedId(int combinedId) {
        return net.minecraft.world.level.block.Block.a(combinedId);
    }

    @Remap(classPath = "net.minecraft.world.level.block.Block",
            name = "getId",
            type = Remap.Type.METHOD,
            remappedName = "i")
    public static int getId(IBlockData blockData) {
        return net.minecraft.world.level.block.Block.i(blockData);
    }

}
