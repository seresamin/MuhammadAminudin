package com.example.hellowordapps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)

        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val dateEditText = findViewById<EditText>(R.id.dateEditText)
        val sksEditText = findViewById<EditText>(R.id.sksEditText)

        simpanButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            val email = emailEditText.text.toString()
            var jumlahSks = sksEditText.text.toString().toInt()
            jumlahSks = 168 - jumlahSks
            Toast.makeText(this,"Sisa SKS... $jumlahSks", Toast.LENGTH_SHORT).show()

            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("nama",nama)
            intent.putExtra("email",email)
            intent.putExtra("jumlah_sks",jumlahSks)
            startActivity(intent)

        }

        batalButton.setOnClickListener{
            Toast.makeText(this,"Batal...", Toast.LENGTH_SHORT).show()
        }
    }
}