package jp.co.nissan.hmi.poundconverter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SettingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        val text :TextView = findViewById(R.id.textView1)
        val button:Button = findViewById(R.id.button2)

        val textMsg = intent.extras?.get("name").toString()
        text.setText("Hello "+textMsg+" , Welcome to new course!!")
        button.setOnClickListener(View.OnClickListener {
            var intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
        })
    }
}
