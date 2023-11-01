package br.com.jessicaraissapessoa.navigation.navigation.lifecycle.streaming

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class LiveVideo : DefaultLifecycleObserver {

    override fun onStart(owner: LifecycleOwner) { //Play vídeo
        super.onStart(owner)
    }

    override fun onStop(owner: LifecycleOwner) { //Pausa o vídeo
        super.onStop(owner)
    }

    override fun onDestroy(owner: LifecycleOwner) { //Libera memória do vídeo
        super.onDestroy(owner)
    }



//    //Implementações "manuais" pré DefaultLifecycleObserver
//    fun start() { //Usuário entrou na tela -> Inicia reprodução da live
//    }
//
//    fun stop() { //Usuário saiu da activity e/ou fechou app -> Pausa o vídeo
//    }
//
//    fun release() { //Para quando sai/fecha -> Release para liberar memória do vídeop e destruir referência da live
//    }

}