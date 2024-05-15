package perez.jaime.tdejemploservicios

import android.app.Service
import android.content.Intent
import android.os.CountDownTimer
import android.os.IBinder
import android.util.Log

class ServicioDeTest : Service() {

    override fun onBind(intent: Intent): IBinder? {
        // Implementar si es un servicio vinculado
        return null
    }

    //En esta funcion es donde el servicio comienza
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        //Aca iria toda la logica que quiero hacer
        val timer = object: CountDownTimer(20000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                Log.d("El servicio", "Tic Tac")
            }

            override fun onFinish() {
                Log.d("El servicio", "Termino el ContDown")
            }
        }
        timer.start()

        return START_STICKY
    }

    //Cuando se destruya el servicio
    override fun onDestroy() {
        Log.d("El servicio", "Hizo caputttt")
        super.onDestroy()
    }

}