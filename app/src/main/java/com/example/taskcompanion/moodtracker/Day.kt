package com.example.taskcompanion.moodtracker

class Day(var number: Int) {
    private val events = Array
    val mood = Mood
    val dayOfWeek = String
    val month = String

    fun addEvent(event: Task){
        this.events += event
        // quand une tâche sera accomplie elle pourra être ajoutée
    }

    fun addMood(mood: Mood){
        this.mood = mood
    }

    fun calculateDate(this.number: Int){
        //initialise toutes les dates etc à partir du numero du jour dans l'année (peut-être pas optimal)
    }


}