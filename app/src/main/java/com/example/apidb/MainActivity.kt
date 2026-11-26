package com.example.apidb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.apidb.ui.theme.APIDBTheme
import com.example.apidb.ui.theme.ApiDBTheme
import com.example.apidb.uicontroller.DataSiswaApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            APIDBTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DataSiswaApp(
                        modifier = Modifier.padding(paddingValues = innerPadding)
                    )
                }
            }
        }
    }
}