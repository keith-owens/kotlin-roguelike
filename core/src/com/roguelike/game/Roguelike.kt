package com.roguelike.game

import com.badlogic.gdx.Application
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.g2d.BitmapFont
import com.badlogic.gdx.graphics.g2d.SpriteBatch
import com.roguelike.game.screen.RoguelikeScreen
import ktx.app.KtxGame
import ktx.app.KtxScreen

class Roguelike : KtxGame<KtxScreen>() {
    val batch by lazy { SpriteBatch() }
    val font by lazy { BitmapFont() }

    override fun create() {
        Gdx.app.logLevel = Application.LOG_DEBUG
        addScreen(RoguelikeScreen(this))
        setScreen<RoguelikeScreen>()
        super.create()
    }

    override fun dispose() {
        batch.dispose()
        font.dispose()
        super.dispose()
    }
}