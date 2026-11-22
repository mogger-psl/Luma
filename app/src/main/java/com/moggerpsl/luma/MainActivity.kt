package com.moggerpsl.luma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val LumaPink = Color(0xFFE8BFD2)
private val LumaBackground = Color(0xFFFFF8FB)
private val LumaPurple = Color(0xFFB9A8D8)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            LumaApp()
        }
    }
}

@Composable
fun LumaApp() {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = LumaPink,
            secondary = LumaPurple,
            background = LumaBackground,
            surface = Color.White
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = LumaBackground
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Luma",
                    fontSize = 38.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF98718C)
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "Un pequeño espacio para compartir cómo estamos.",
                    color = Color.DarkGray
                )

                Spacer(modifier = Modifier.height(32.dp))

                Card(
                    shape = RoundedCornerShape(24.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(
                        modifier = Modifier.padding(20.dp)
                    ) {
                        Text(
                            text = "Mi estado actual",
                            fontWeight = FontWeight.Bold
                        )

                        Spacer(modifier = Modifier.height(12.dp))

                        Text(
                            text = "Tranquilo 🌸",
                            fontSize = 24.sp,
                            color = Color(0xFF98718C)
                        )

                        Text(
                            text = "Bienvenido a Luma 0.1",
                            color = Color.Gray
                        )
                    }
                }
            }
        }
    }
}
