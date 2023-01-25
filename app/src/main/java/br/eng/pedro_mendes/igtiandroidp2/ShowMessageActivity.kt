package br.eng.pedro_mendes.igtiandroidp2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ShowMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_message)

        setReceivedMessageAsCurrentText()
    }

    private fun setReceivedMessageAsCurrentText() {
        val message = intent.getStringExtra(EXTRA_MESSAGE)

        findViewById<TextView>(R.id.text_view_message).apply {
            text = message
        }
    }
}