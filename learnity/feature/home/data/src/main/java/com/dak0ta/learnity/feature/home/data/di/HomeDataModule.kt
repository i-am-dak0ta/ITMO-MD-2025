package com.dak0ta.learnity.feature.home.data.di

import com.dak0ta.learnity.feature.home.data.repository.QuotesRepository
import com.dak0ta.learnity.feature.home.data.repository.QuotesRepositoryImpl
import com.dak0ta.learnity.feature.home.data.usecase.GetQuotesUseCaseImpl
import com.dak0ta.learnity.feature.home.data.usecase.ObserveQuotesUseCaseImpl
import com.dak0ta.learnity.feature.home.data.usecase.RefreshQuotesUseCaseImpl
import com.dak0ta.learnity.feature.home.domain.usecase.GetQuotesUseCase
import com.dak0ta.learnity.feature.home.domain.usecase.ObserveQuotesUseCase
import com.dak0ta.learnity.feature.home.domain.usecase.RefreshQuotesUseCase
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class HomeDataModule {

    @Binds
    @Singleton
    internal abstract fun bindUsersRepository(
        impl: QuotesRepositoryImpl,
    ): QuotesRepository

    @Binds
    internal abstract fun bindGetUsersUseCase(
        impl: GetQuotesUseCaseImpl,
    ): GetQuotesUseCase

    @Binds
    internal abstract fun bindObserveUsersUseCase(
        impl: ObserveQuotesUseCaseImpl,
    ): ObserveQuotesUseCase

    @Binds
    internal abstract fun bindRefreshUsersUseCase(
        impl: RefreshQuotesUseCaseImpl,
    ): RefreshQuotesUseCase
}
