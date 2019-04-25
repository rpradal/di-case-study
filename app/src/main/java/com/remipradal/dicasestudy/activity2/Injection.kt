package com.remipradal.dicasestudy.activity2

import com.remipradal.dicasestudy.BaseComponent
import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Scope

@Component(dependencies = [BaseComponent::class], modules = [Activity2Module::class])
@Activity2Scope
interface Activity2Component {
    fun inject(activity: Activity2)
}

@Module
class Activity2Module(private val dateScreen: DateScreen) {
    @Provides
    fun provideDateScreen(): DateScreen = dateScreen
}


@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class Activity2Scope