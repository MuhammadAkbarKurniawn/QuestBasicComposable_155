package com.example.questbasiccomposable_155

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questbasiccomposable_155.ui.theme.QuestBasicComposable_155Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestBasicComposable_155Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompos(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun BasicCompos(modifier: Modifier = Modifier){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 30.dp)
    ) {
        Text("Login", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.padding(10.dp))
        Text("Ini adalah halaman Login", fontSize = 30.sp, fontStyle = FontStyle.Italic)
        Spacer(modifier = Modifier.padding(5.dp))
        Image(painter = painterResource(id = R.drawable.logoumy1),
            contentDescription = "",
            modifier = Modifier
                .size(300.dp)
                .clip(CircleShape))
        Text("Nama", fontSize = 20.sp)
        Text("Muhammad Akbar Kurniawan", fontSize = 25.sp, color = Color.Blue, fontWeight = FontWeight.Bold)
        Text("20220140155", fontSize = 40.sp)
        Image(painter = painterResource(id = R.drawable.aku),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape))
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuestBasicComposable_155Theme {
        BasicCompos()
    }
}