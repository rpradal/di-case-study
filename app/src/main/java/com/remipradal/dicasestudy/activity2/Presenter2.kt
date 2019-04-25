package com.remipradal.dicasestudy.activity2

import com.remipradal.dicasestudy.DateRepository

class Presenter2(private val dateScreen: DateScreen) {

    private val formatter = Formatter()

    fun loadDate() {
        val storedDateTime = DateRepository.storedDateTime
        val humanDate = formatter.toHumanDate(storedDateTime)
        dateScreen.showDate(humanDate)
    }

}

interface DateScreen {
    fun showDate(humanDate: String)
}