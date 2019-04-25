package com.remipradal.dicasestudy

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface BaseComponent {

    fun dateRepository(): DateRepository

    companion object {
        private lateinit var instance: BaseComponent

        fun getInstance(): BaseComponent {
            return if (this::instance.isInitialized) {
                instance
            } else {
                instance = DaggerBaseComponent.create()
                instance
            }
        }
    }
}