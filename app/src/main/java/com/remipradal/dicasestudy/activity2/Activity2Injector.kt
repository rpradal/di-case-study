package com.remipradal.dicasestudy.activity2

import com.remipradal.dicasestudy.BaseInjector

class Activity2Injector(
    private val baseInjector: BaseInjector,
    private val screen: DateScreen
) {

    fun providePresenter2() : Presenter2 {
        return Presenter2(
            dateScreen = screen,
            formatter = provideFormatter(),
            dateRepository = baseInjector.provideDateRepository()

        )
    }

    fun provideFormatter() : Formatter = Formatter()
}