package me.egil.fotosmarteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import me.egil.fotosmarteapp.MarsPhotosApp
import me.egil.fotosmarteapp.ui.theme.FotosMarteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FotosMarteAppTheme {
                MarsPhotosApp()
            }
        }
    }
}
