package com.example.anvilcompilerbug

import com.example.library.ComponentScope
import com.example.library.Dependency
import com.example.library.SubcomponentScope
import com.squareup.anvil.annotations.ContributesSubcomponent

@FeatureScope
@ContributesSubcomponent(
    scope = SubcomponentScope::class,
    parentScope = ComponentScope::class
)
interface Feature1Component {

//    fun dependency(): Dependency
}