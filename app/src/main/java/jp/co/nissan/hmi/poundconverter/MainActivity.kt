package jp.co.nissan.hmi.poundconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener(View.OnClickListener {
            val name = editText.text.toString()
            val intent  = Intent(this,SettingActivity::class.java)
            intent.putExtra("name", name)
            startActivity(intent)
        })
    }
}

