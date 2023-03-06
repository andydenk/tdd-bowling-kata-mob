package com.example

class Game {

    private var frame = 0
    private var score = 0

    fun roll(pins: Int) {
        score += pins
    }

    fun score(): Int {
        return score
    }
}