package com.example

class Game {

    private var frame = 0
    private var score = 0
    private var frameState = FramePart.FIRST_PART
    private var strikeRolls = 0

    fun roll(pins: Int) {
        frameState = nextFrameState()
        var rollScore = pins
        if (strikeRolls > 0) {
            rollScore = pins * 2
            strikeRolls--
        }
        score += rollScore
        var isStrike = pins == 10 && frameState == FramePart.FIRST_PART
        if (isStrike) {
            strikeRolls = 2
        }
    }

    private fun nextFrameState(): FramePart {
        return when (frameState) {
            FramePart.FIRST_PART -> FramePart.SECOND_PART
            FramePart.SECOND_PART -> FramePart.FIRST_PART
        }
    }

    fun score(): Int {
        return score
    }

    private enum class FramePart {
        FIRST_PART,
        SECOND_PART
    }
}