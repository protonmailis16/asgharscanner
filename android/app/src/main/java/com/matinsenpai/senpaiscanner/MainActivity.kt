package com.protonmailis16.asgharscanner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.protonmailis16.asgharscanner.theme.asgharscannerTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    enableEdgeToEdge()
    setContent {
      asgharscannerTheme { Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) { com.protonmailis16.asgharscanner.ui.main.AppUI() } }
    }
  }
}
