package com.julhdev.buttons.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
/**
 * Muestra un botón normal deshabilitado con el texto "Normal Button".
 * Este botón utiliza el componente Button de Material 3 y está deshabilitado (\`enabled = false\`).
 * El texto tiene un tamaño de fuente de 30sp.
 */
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
/**
 * Muestra un botón normal con el texto "Normal Button 2".
 * Este botón utiliza el componente Button de Material 3 y tiene un color de fondo rojo.
 * El texto tiene un tamaño de fuente de 30sp.
 */
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
/**
 * Muestra un botón de texto con el texto "Text Button".
 * Este botón utiliza el componente TextButton de Material 3.
 * El texto tiene un tamaño de fuente de 30sp.
 */
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
/**
 * Muestra un botón con borde (Outlined Button) con el texto "Outlined Button".
 * Este botón utiliza el componente OutlinedButton de Material 3 y tiene un borde rojo de 2dp.
 * El texto tiene un tamaño de fuente de 30sp.
 */
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
/**
 * Muestra un botón de icono (Icon Button) con el icono de inicio (home).
 * Este botón utiliza el componente Icon de Material 3, con un tamaño de 50dp y un tinte rojo.
 * El icono tiene una descripción de contenido "Icon".
 */
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
/**
 * Muestra un botón de interruptor (Switch Button).
 * Este botón utiliza el componente Switch de Material 3 y mantiene su estado utilizando \`remember\` y \`mutableStateOf\`.
 * El color del pulgar y la pista del interruptor cambian según si está activado o desactivado.
 */
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
/**
 * Muestra un botón para alternar el modo oscuro (Dark Mode).
 * Este botón utiliza el componente Button de Material 3 y cambia el estado de \`darkmode\` al hacer clic.
 * El botón contiene un icono de estrella y el texto "Dark mode" con un tamaño de fuente de 30sp.
 *
 * @param darkmode Un estado mutable que indica si el modo oscuro está activado o desactivado.
 */
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
/**
 * Muestra un botón de acción flotante (Floating Action Button).
 * Este botón utiliza el componente FloatingActionButton de Material 3 con un color de fondo rojo y un color de contenido blanco.
 * El botón contiene un icono de adición (add) con un tamaño de 30dp.
 */
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