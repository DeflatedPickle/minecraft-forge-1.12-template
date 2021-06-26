/* Copyright (c) 2021 $developer under the MIT license */

@file:Suppress("SpellCheckingInspection", "unused")

package com.example

import com.example.ExampleMod.ACCEPTED_VERSIONS
import com.example.ExampleMod.ADAPTER
import com.example.ExampleMod.DEPENDENCIES
import com.example.ExampleMod.MOD_ID
import com.example.ExampleMod.NAME
import com.example.ExampleMod.VERSION
import net.minecraftforge.fml.common.Mod

@Mod(
    modid = MOD_ID,
    name = NAME,
    version = VERSION,
    acceptedMinecraftVersions = ACCEPTED_VERSIONS,
    dependencies = DEPENDENCIES,
    modLanguageAdapter = ADAPTER
)
@Mod.EventBusSubscriber
object ExampleMod {
    const val MOD_ID = "$[id]"
    const val NAME = "$[name]"
    const val VERSION = "$[version]"
    const val ACCEPTED_VERSIONS = "[$[min_version],$[max_version]]"
    const val DEPENDENCIES = "$[dependencies]"
    const val ADAPTER = "net.shadowfacts.forgelin.KotlinAdapter"
}
