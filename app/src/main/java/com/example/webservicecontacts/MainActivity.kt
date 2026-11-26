package com.example.webservicecontacts

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.webservicecontacts.ui.theme.WebServiceContactsTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WebServiceContactsTheme {
                ContactApp()
            }
        }
    }
}
