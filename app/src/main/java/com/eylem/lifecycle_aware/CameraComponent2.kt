package com.eylem.lifecycle_aware

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

//bu yapının içinde sadece override etmek zorunda olduğumuz onStateChange() adında bir fonksiyonu var
//event parametresi içinde yine tüm lifecycle fonksiyonları bize veriliyor. Biz istediğimiz event'i
//tanımlayarak işlemleri gerçekleştiriyoruz. En son "else ->" ksmını unutmamak gerekir.

class CameraComponent2: LifecycleEventObserver {
    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when(event){
            Lifecycle.Event.ON_START -> startCamera()
            Lifecycle.Event.ON_STOP -> stopCamera()
            else -> {
            //
            }

        }
    }

    fun startCamera(){

    }
    fun stopCamera(){

    }
}