package com.remipradal.dicasestudy

class BaseInjector {

    companion object {
        val INSTANCE = BaseInjector()
    }

    private lateinit var dateRepository: DateRepository

    fun provideDateRepository(): DateRepository {
        return if (this::dateRepository.isInitialized) {
            dateRepository
        } else {
            dateRepository = DateRepository()
            dateRepository
        }
    }

}