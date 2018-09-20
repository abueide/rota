@file:JvmName("Lwjgl3Launcher")

package com.abueide.rota.lwjgl3

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration
import com.abueide.rota.RotA

/** Launches the desktop (LWJGL3) application. */
fun main(args: Array<String>) {
    Lwjgl3Application(RotA(), Lwjgl3ApplicationConfiguration().apply {
        setTitle("RotA")
        setWindowedMode(640, 480)
        setResizable(false)
        setWindowIcon(*(arrayOf(128, 64, 32, 16).map { "libgdx$it.png" }.toTypedArray()))
    })
}
