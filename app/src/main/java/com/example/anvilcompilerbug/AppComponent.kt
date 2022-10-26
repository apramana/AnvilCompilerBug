package com.example.anvilcompilerbug

import com.example.library.ComponentScope
import com.squareup.anvil.annotations.MergeComponent
import javax.inject.Singleton

@Singleton
@MergeComponent(
    scope = ComponentScope::class
)
interface AppComponent