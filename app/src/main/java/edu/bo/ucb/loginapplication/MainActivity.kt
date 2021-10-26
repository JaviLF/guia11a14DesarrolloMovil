package edu.bo.ucb.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent

import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        session.user = Usuario("Roberto Carlos", "Callisaya Mamani", 32)
    }

    fun openSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}