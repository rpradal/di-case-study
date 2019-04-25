package com.remipradal.dicasestudy.activity1

import com.remipradal.dicasestudy.DateRepository
import org.joda.time.DateTime

class Presenter1 {

    fun setDate(dateToStore: DateTime) {
        DateRepository.storedDateTime = dateToStore
    }

}