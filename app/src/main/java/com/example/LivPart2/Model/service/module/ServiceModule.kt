package com.example.livpart2.model.service.module

import com.example.livpart2.model.service.AccountService
import com.example.livpart2.model.service.ConfigurationService
import com.example.livpart2.model.service.LogService
import com.example.livpart2.model.service.StorageService
import com.example.livpart2.model.service.implementation.AccountServiceImpl
import com.example.livpart2.model.service.implementation.ConfigurationServiceImpl
import com.example.livpart2.model.service.implementation.LogServiceImpl
import com.example.livpart2.model.service.implementation.StorageServiceImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {
    @Binds abstract fun provideAccountService(impl: AccountServiceImpl): AccountService

    @Binds abstract fun provideLogService(impl: LogServiceImpl): LogService

    @Binds abstract fun provideStorageService(impl: StorageServiceImpl): StorageService

    @Binds
    abstract fun provideConfigurationService(impl: ConfigurationServiceImpl): ConfigurationService
}