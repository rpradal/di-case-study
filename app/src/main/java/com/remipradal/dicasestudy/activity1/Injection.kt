package com.remipradal.dicasestudy.activity1

import com.remipradal.dicasestudy.BaseComponent
import dagger.Component
import javax.inject.Scope

@Component(dependencies = [BaseComponent::class])
@Activity1Scope
interface Activity1Component {
    fun inject(activity: MainActivity)
}


@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class Activity1Scope