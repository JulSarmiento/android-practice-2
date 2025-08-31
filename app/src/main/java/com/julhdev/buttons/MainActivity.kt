package com.julhdev.buttons

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.julhdev.buttons.ui.theme.ButtonsTheme
import com.julhdev.buttons.components.*


class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      val darkmode = remember { mutableStateOf(false) }
      ButtonsTheme(
        dynamicColor = false,
        darkTheme = darkmode.value
      ) {
        Scaffold(modifier = Modifier.fillMaxSize()){ paddingValues -> {
          Modifier.padding(paddingValues)
        }
          Content(darkmode )
        }
      }
    }
  }
}

@Composable
fun Content(darkmode: MutableState<Boolean>){
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier
      .fillMaxSize()
      .wrapContentSize(Alignment.Center)
      .padding(20.dp)
  ) {
    NormalBtn()
    Space()
    NormalBtn2()
    Space()
    TextBtn()
    Space()
    OutlinedBtn()
    Space()
    IconBtn()
    Space()
    SwitchBtn()
    Space()
    DarkMode(darkmode)
    Space()
    FloatingBtn()
  }
}



@Composable
fun Space() {
  Spacer(modifier = Modifier.height(10.dp))
}