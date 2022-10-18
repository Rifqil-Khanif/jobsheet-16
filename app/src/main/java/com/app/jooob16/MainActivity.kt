package com.app.jooob16

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val biodata = arrayOf("M Rifqil Khanif", "XI PPLG 2", "3015")

        btn1.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Biodata Diri")
                .setItems(biodata,  DialogInterface.OnClickListener { dialog, which ->
                })
                .setPositiveButton("Ya", DialogInterface.OnClickListener { dialogInterface, i ->
                })
                .show()
        }

        btn2.setOnClickListener {
            val inflater = layoutInflater
            val dialoglayout = inflater.inflate(R.layout.activity_dialog, null)
            val editText = dialoglayout.findViewById<EditText>(R.id.editText)
            AlertDialog.Builder(this)
                .setTitle("Masukkan Nama Lengkap")
                .setView(dialoglayout)
                // Add action buttons
                .setPositiveButton("Benar",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                        Toast.makeText(this,"Nama kamu adalah " + editText.getText().toString(), Toast.LENGTH_SHORT).show()
                    })
                .setNegativeButton("Batal",
                    DialogInterface.OnClickListener { dialogInterface, i ->
                    }) .show()
        }
    }
}