@file:JvmName("DesktopLauncher")

package com.abueide.rota.desktop

import com.badlogic.gdx.Files
import com.badlogic.gdx.backends.lwjgl.LwjglApplication
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration

import com.abueide.rota.RotA

/** Launches the desktop (LWJGL) application. */
fun main(args: Array<String>) {
    LwjglApplication(RotA(), LwjglApplicationConfiguration().apply {
        title = "RotA"
        width = 640
        height = 480
        resizable = false
        intArrayOf(128, 64, 32, 16).forEach{
            addIcon("libgdx$it.png", Files.FileType.Internal)
        }
    })
}
