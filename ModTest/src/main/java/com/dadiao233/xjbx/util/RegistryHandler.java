package com.dadiao233.xjbx.util;

import com.dadiao233.xjbx.Xjbx;
import com.dadiao233.xjbx.blocks.GenshinImpactBlock;
import com.dadiao233.xjbx.blocks.GenshinImpactBlockItem;
import com.dadiao233.xjbx.items.RedScarf;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Xjbx.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Xjbx.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }



//注册的物品
    public static final RegistryObject<Item> RED_SCARF =ITEMS.register("red_scarf", RedScarf::new);






//注册的方块
    public static final RegistryObject<Block> GENSHIN_IMPACT_BLOCK =BLOCKS.register("GenshinImpact_Block", GenshinImpactBlock::new);

//注册方块手持状态

    public static final RegistryObject<Item> GENSHIN_IMPACT_BLOCK_ITEM =ITEMS.register("GenshinImpact_Block", () -> new GenshinImpactBlockItem(GENSHIN_IMPACT_BLOCK.get()));
}
