package br.com.jessicaraissapessoa.navigation.navigation.lifecycle

import android.app.Activity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry

//Essa classe é basicamente o que a activity faz por debaixo dos panos
//Não precisamos nos preocuparmos com isso quando usamos o Jetpack
class LifecycleActivity : Activity(), LifecycleOwner {

    private val lifecycleRegistry = LifecycleRegistry(this)

    override fun onStart() {
        super.onStart()
        lifecycleRegistry.currentState = Lifecycle.State.STARTED
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lifecycle
        lifecycleRegistry.currentState = Lifecycle.State.CREATED
    }

    override fun onResume() {
        super.onResume()
        lifecycleRegistry.currentState = Lifecycle.State.RESUMED
    }

    override fun onDestroy() {
        super.onDestroy()
        lifecycleRegistry.currentState = Lifecycle.State.DESTROYED
    }

    override val lifecycle: Lifecycle = lifecycleRegistry

}