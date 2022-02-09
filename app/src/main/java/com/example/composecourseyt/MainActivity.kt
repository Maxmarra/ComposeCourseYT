package com.example.composecourseyt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.ProgressIndicatorDefaults.IndicatorBackgroundOpacity

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierInfo
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinearProgressIndicator(progress = 5.0f)
        
        }
    }
}




@Composable
fun LinearProgressIndicator(
    progress: Float?,
    modifier: Modifier? = Modifier,
    color: Color? = MaterialTheme.colors.primary,
    backgroundColor: Color? = color?.copy(alpha = IndicatorBackgroundOpacity)
): Unit
{
    
}
















