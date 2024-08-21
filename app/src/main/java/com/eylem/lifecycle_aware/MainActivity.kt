package com.eylem.lifecycle_aware

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//aware = farkında olmak,haberdar olmak.Lifecycle'dan view classlar dışındaki classlar etkilenmezler
//eğer biz bir class ı lifecycledan etkilenmesini istiyorsak bunun iki yolu var:
// 1)DefaultLifecycleObserver   ---  2)LifecycleEventObserver    Interfaceleri
//CameraComponent1 ve CameraComponent2 classlarına bak. Sonra aşağıya dön...

class MainActivity : AppCompatActivity() {

    //burada classların nesnesini oluşturuyoruz
    private val camera1 = CameraComponent1()
    private val camera2 = CameraComponent2()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Sonrasında uygulama başında (onCreate içinde) lifecycle a observer ekleyerek takip etmesini sağlıyoruz.
        lifecycle.addObserver(camera1)
        lifecycle.addObserver(camera2)

    }





    override fun onDestroy() {
        super.onDestroy()
        //Sonrasında Uygulama sonunda (onDestroy içinde) removeObserver diyerek siliyoruz
        lifecycle.removeObserver(camera1)
        lifecycle.removeObserver(camera2)

    }

}
