package com.eylem.lifecycle_aware

import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

//tüm lifecycle fonksiyonlarının ihtiyacımız kadarını override ederek kullanabiliriz.
//Hangi lifecycle içinde kamerayı açıp kapatacaksak startCamera ve stopCamera fonksiyonlarını ilgili fonksiyon içine yazıyoruz


class CameraComponent1: DefaultLifecycleObserver{

    override fun onCreate(owner: LifecycleOwner) {
        super.onCreate(owner)
    }

    override fun onStart(owner: LifecycleOwner) {
        super.onStart(owner)
        startCamera()
    }

    override fun onResume(owner: LifecycleOwner) {
        super.onResume(owner)

    }

    override fun onPause(owner: LifecycleOwner) {
        super.onPause(owner)

    }

    override fun onStop(owner: LifecycleOwner) {
        super.onStop(owner)
        stopCamera()
    }

    override fun onDestroy(owner: LifecycleOwner) {
        super.onDestroy(owner)
    }

    fun startCamera(){

    }
    fun stopCamera(){

    }


}