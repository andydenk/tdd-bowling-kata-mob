package com.example

import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@MicronautTest
class GameTest {

    @Test
    fun `given the game just started, then the score should be 0`() {
        val game = Game()

        assertEquals(0, game.score())
    }

    @Test
    fun `given we roll a 5, then the score should be incremented by 5`() {
        val game = Game()
        val currentScore = game.score()
        game.roll(5)

        assertEquals(5, game.score() - currentScore)
    }
}