package br.eng.pedro_mendes.igtiandroidp2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

const val EXTRA_MESSAGE = "br.eng.pedro_mendes.igtiandroidp2.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getMessageFromEditText(): String {
        val editText = findViewById<EditText>(R.id.edit_text_message)

        return editText.text.toString()
    }

    private fun sendMessageToShowMessageActivity(message: String) {
        val intent = Intent(this, ShowMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }

        startActivity(intent)
    }

    fun sendMessage(@Suppress("UNUSED_PARAMETER") view: View) {
        val message = getMessageFromEditText()

        sendMessageToShowMessageActivity(message)
    }


}