package com.remipradal.dicasestudy.activity2

import com.nhaarman.mockitokotlin2.given
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.then
import com.remipradal.dicasestudy.DateRepository
import org.joda.time.DateTime
import org.junit.Test

class Presenter2Test {

    private val formatterMock: Formatter = mock()
    private val screenMock: DateScreen = mock()
    private val dateRepositoryMock: DateRepository = mock()

    private val presenter = Presenter2(
        screenMock,
        formatterMock,
        dateRepositoryMock
    )

    @Test
    fun loadDate() {
        // Given
        given(dateRepositoryMock.storedDateTime).willReturn(DateTime.parse("2019-04-29"))
        given(formatterMock.toHumanDate(DateTime.parse("2019-04-29"))).willReturn("my date")

        // When
        presenter.loadDate()

        // Then
        then(screenMock).should().showDate("my date")
    }
}