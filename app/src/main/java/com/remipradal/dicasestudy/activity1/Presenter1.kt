package com.remipradal.dicasestudy.activity1

import com.remipradal.dicasestudy.DateRepository
import org.joda.time.DateTime

class Presenter1(
    private val dateRepository: DateRepository
) {

    fun setDate(dateToStore: DateTime) {
        dateRepository.storedDateTime = dateToStore
    }

}