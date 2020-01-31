package dev.alexfranco.mtw.clickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun helloHuman(view:View) {
        Toast.makeText(this, "Hello puny human!", Toast.LENGTH_SHORT).show()
    }

    fun countClicks(view: View){
        counter++
        lblCounter.text = counter.toString()
    }
}
