package com.remipradal.dicasestudy.activity2

import com.remipradal.dicasestudy.DateRepository

class Presenter2(
    private val dateScreen: DateScreen,
    private val formatter: Formatter,
    private val dateRepository: DateRepository
) {

    fun loadDate() {
        val storedDateTime = dateRepository.storedDateTime
        val humanDate = formatter.toHumanDate(storedDateTime)
        dateScreen.showDate(humanDate)
    }

}

interface DateScreen {
    fun showDate(humanDate: String)
}