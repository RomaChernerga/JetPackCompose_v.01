package com.example.jetpackcompose

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem(name = "Arnold Shvarzneger", prof = "actor", R.drawable.arnold)
                ListItem(name = "Brus Willis", prof = "actor", R.drawable.brus)
                ListItem(name = "Jan Clod VanDamm", prof = "actor", R.drawable.jkvd)
                ListItem(name = "Arnold Shvarzneger", prof = "actor", R.drawable.arnold)
                ListItem(name = "Brus Willis", prof = "actor", R.drawable.brus)
                ListItem(name = "Jan Clod VanDamm", prof = "actor", R.drawable.jkvd)
                ListItem(name = "Arnold Shvarzneger", prof = "actor", R.drawable.arnold)
                ListItem(name = "Brus Willis", prof = "actor", R.drawable.brus)
                ListItem(name = "Jan Clod VanDamm", prof = "actor", R.drawable.jkvd)
                ListItem(name = "Arnold Shvarzneger", prof = "actor", R.drawable.arnold)
                ListItem(name = "Brus Willis", prof = "actor", R.drawable.brus)
                ListItem(name = "Jan Clod VanDamm", prof = "actor", R.drawable.jkvd)
            }

        }
    }
}

@Composable
fun ListItem(name: String, prof: String, foto: Int) {
    Card(modifier = Modifier
        .padding(10.dp)
        .fillMaxWidth()
        .pointerInput(Unit){
            detectHorizontalDragGestures { change, dragAmount ->
                Log.d("MyLog","Long Press: $dragAmount")
            }
        },
    shape = RoundedCornerShape(15.dp),
    elevation = 5.dp
    ) {
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(painter = painterResource(foto),
                      contentDescription = "image",
                      contentScale = ContentScale.Crop,
                      modifier = Modifier
                          .padding(5.dp)
                          .size(64.dp)
                          .clip(CircleShape)
                )
                Column(modifier = Modifier.padding(start = 16.dp)) {
                    Text(text = name)
                    Text(text = prof)
                }
            }
        }

    }
}


