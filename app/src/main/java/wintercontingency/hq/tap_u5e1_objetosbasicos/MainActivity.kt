package wintercontingency.hq.tap_u5e1_objetosbasicos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ejecutar.setOnClickListener{
            var nombre = dato.text.toString();

            Toast.makeText(this, "hola como estas mi amigo ${nombre}", Toast.LENGTH_LONG).show()

            dato.setText("")
        }
    }
}