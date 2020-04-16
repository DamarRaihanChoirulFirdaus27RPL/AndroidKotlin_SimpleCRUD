package com.example.simplecrud

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.simplecrud.Pegawai.MainPegawai
import com.example.simplecrud.Student.MainActivity

class Beranda : AppCompatActivity() {
    private lateinit var btnStudent: Button
    private lateinit var btnPegawai: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)
        btnStudent = findViewById(R.id.btn_student)
        btnPegawai = findViewById(R.id.btn_pegawai)

        btnStudent.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))}
        btnPegawai.setOnClickListener{
            startActivity(Intent(this, MainPegawai::class.java))}
    }
}
