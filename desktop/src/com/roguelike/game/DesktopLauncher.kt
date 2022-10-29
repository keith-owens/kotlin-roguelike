package com.roguelike.game

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
object DesktopLauncher {
    @JvmStatic
    fun main(arg: Array<String>) {
        Lwjgl3Application(Roguelike(), Lwjgl3ApplicationConfiguration().apply {
            setTitle("Kotlin Roguelike")
            setWindowedMode(640, 400)
        })
    }
}