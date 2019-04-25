package com.remipradal.dicasestudy

import org.joda.time.DateTime
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DateRepository @Inject constructor() {
    var storedDateTime: DateTime? = null
}