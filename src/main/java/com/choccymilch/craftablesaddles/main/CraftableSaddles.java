package com.choccymilch.craftablesaddles.main;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(CraftableSaddles.MODID)
public class CraftableSaddles
{
    public static final String MODID = "craftablesaddles";
    private static final Logger LOGGER = LogUtils.getLogger();

    public CraftableSaddles(IEventBus modEventBus, ModContainer modContainer)
    {

    }

}
