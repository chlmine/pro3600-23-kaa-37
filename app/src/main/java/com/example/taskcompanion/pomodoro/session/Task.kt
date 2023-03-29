package com.example.taskcompanion.pomodoro.session

import android.os.CountDownTimer

class Task(var taskName: String, var breakTime: Int = 5 * 60, var focusTime: Int = 25 * 60) {
    private val breakTimer = object : CountDownTimer((breakTime * 1000).toLong(), 1000) {
        override fun onTick(p0: Long) {
            TODO("Not yet implemented")
        }

        override fun onFinish() {
            TODO("Not yet implemented")
        }
    }
    private val focusTimer = object : CountDownTimer((focusTime * 1000).toLong(), 1000) {
        override fun onTick(p0: Long) {
            TODO("Not yet implemented")
        }

        override fun onFinish() {
            TODO("Not yet implemented")
        }

    }
    fun startFocusing(){
        focusTimer.start()
    }
    fun rest() {
        breakTimer.start()
    }

}