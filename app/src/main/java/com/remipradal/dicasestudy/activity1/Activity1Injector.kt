package com.remipradal.dicasestudy.activity1

import com.remipradal.dicasestudy.BaseInjector

class Activity1Injector(
    private val baseInjector: BaseInjector
) {

    fun providePresenter1(): Presenter1 {
        return Presenter1(baseInjector.provideDateRepository())
    }

}