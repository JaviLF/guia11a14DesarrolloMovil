package edu.bo.ucb.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import android.widget.Toast


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Toast.makeText(this, session.user.nombre, Toast.LENGTH_SHORT).show()
        val txtUserSession = findViewById(R.id.txtUserSession) as TextView
        txtUserSession.text = "${session.user.nombre} ${session.user.apellido} ${session.user.edad}"
    }
}