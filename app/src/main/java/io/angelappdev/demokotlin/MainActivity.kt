package io.angelappdev.demokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var fullname = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goButtonTouched(button:View) {
        val firstname = firstnameField.text
        val lastname = lastnameField.text
        if (!firstname.isEmpty() || !lastname.isEmpty()) {
            fullname = "${firstname} ${lastname}"
            welcomeUser()
        }
    }

    fun clearButtonTouched(button:View) {
        welcomeUser()
    }

    private fun welcomeUser() {
//        resultView.text = "Bonjour ${fullname}"

        if (!fullname.isEmpty()) {
            resultView.text = "Bonjour ${fullname}"
        }
        firstnameField.setText("")
        lastnameField.setText("")
    }
}