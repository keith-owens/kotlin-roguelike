package com.roguelike.game.screen

import com.badlogic.gdx.graphics.OrthographicCamera
import com.badlogic.gdx.graphics.g2d.Batch
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.utils.ScreenUtils
import com.roguelike.game.Roguelike
import ktx.app.KtxScreen
import ktx.graphics.use

class RoguelikeScreen(val roguelike: Roguelike): KtxScreen {
    override fun render(delta: Float) {
        ScreenUtils.clear(0f, 0f, 0f, 1f)
        roguelike.batch.use {
            roguelike.font.draw(it, "Kotlin Roguelike", 260f, 200f)
        }
    }
}