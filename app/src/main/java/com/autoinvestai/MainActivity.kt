package com.autoinvestai

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import com.autoinvestai.ui.AutoInvestAiApp
import com.autoinvestai.ui.theme.AutoInvestAiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            AutoInvestAiTheme {
                AutoInvestAiApp()
            }
        }
    }
}
