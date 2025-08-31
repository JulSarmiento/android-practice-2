package com.julhdev.buttons

import android.graphics.drawable.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SegmentedButtonDefaults.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.julhdev.buttons.ui.theme.ButtonsTheme

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
fun NormalBtn(){
  Button(
    onClick = { /*TODO*/ },
    enabled = false
  ) {
    Text(
      fontSize = 30.sp,
      text = "Normal Button")
  }
}


@Composable
fun NormalBtn2(){
  Button(
    onClick = { /*TODO*/ },
    colors = ButtonDefaults.buttonColors(
      containerColor = Color.Red,
    )
  ) {
    Text(
      fontSize = 30.sp,
      text = "Normal Button 2")
  }
}

@Composable
fun TextBtn() {
  TextButton(
    onClick = { /*TODO*/ }
  ) {
    Text(
      fontSize = 30.sp,
      text = "Text Button"
    )
  }
}

@Composable
fun OutlinedBtn(){
  OutlinedButton(
    border = BorderStroke(2.dp, Color.Red),
    onClick = { /*TODO*/ }
  ) {
    Text(
      fontSize = 30.sp,
      text = "Outlined Button"
    )
  }
}

@Composable
fun IconBtn() {
  Icon(
    Icons.Filled.Home,
    contentDescription = "Icon",
    tint = Color.Red,
    modifier = Modifier
      .size(50.dp)
  )
}

@Composable
fun SwitchBtn() {
  var switchState by remember { mutableStateOf(false) }
  Switch(
    switchState,
    onCheckedChange = { switchState = it },
    colors = SwitchDefaults.colors(
      checkedThumbColor = Color.Red,
      uncheckedThumbColor = Color.Gray,
      checkedTrackColor = Color.LightGray,
      uncheckedTrackColor = Color.DarkGray
    )
  )
}

@Composable
fun DarkMode(darkmode: MutableState<Boolean>){
  Button(
    onClick = {
      darkmode.value = !darkmode.value
    }
  ) {
    Icon(
      imageVector = Icons.Default.Star,
      contentDescription = "Dark mode",
    )
    Spacer(modifier = Modifier.width(5.dp))
    Text(text = "Dark mode", fontSize = 30.sp)
  }
}

@Composable
fun FloatingBtn(){
  FloatingActionButton(
    onClick = { /*TODO*/ },
    containerColor = Color.Red,
    contentColor = Color.White
  ) {
    Icon(
      Icons.Filled.Add,
      contentDescription = "Floating Action Button",
      modifier = Modifier.size(30.dp)
    )
  }
}


@Composable
fun Space() {
  Spacer(modifier = Modifier.height(10.dp))
}