package com.example.library

import com.squareup.anvil.annotations.ContributesTo
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module
@ContributesTo(SubcomponentScope::class)
object DemoModule {
    @Provides
    @Reusable
    fun provideDependency(): Dependency = Dependency()
}