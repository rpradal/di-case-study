package com.remipradal.dicasestudy.activity2

import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat
import javax.inject.Inject

class Formatter @Inject constructor() {
    fun toHumanDate(storedDateTime: DateTime?): String {
        return storedDateTime?.let {
            val timeFormatter = ISODateTimeFormat.basicDateTime()
            timeFormatter.print(it)
        } ?: "invalid"
    }
}