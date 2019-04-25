package com.remipradal.dicasestudy.activity1

import com.remipradal.dicasestudy.DateRepository
import org.joda.time.DateTime
import javax.inject.Inject

class Presenter1 @Inject constructor(
    private val dateRepository: DateRepository
) {

    fun setDate(dateToStore: DateTime) {
        dateRepository.storedDateTime = dateToStore
    }

}