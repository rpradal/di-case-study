package com.remipradal.dicasestudy.activity2

import org.joda.time.DateTime
import org.joda.time.format.ISODateTimeFormat

class Formatter {
    fun toHumanDate(storedDateTime: DateTime?): String {
        return storedDateTime?.let {
            val timeFormatter = ISODateTimeFormat.basicDateTime()
            timeFormatter.print(it)
        } ?: "invalid"
    }
}