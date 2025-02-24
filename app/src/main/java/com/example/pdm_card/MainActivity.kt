package com.example.pdm_card

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pdm_card.ui.theme.PDMCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PDMCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Box(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        CardExamples()
                    }
                }
            }
        }
    }
}

@Composable
fun CardExamples() {
    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceVariant),
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Filled", textAlign = TextAlign.Center)
            }
        }

        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Elevated", textAlign = TextAlign.Center)
            }
        }

        OutlinedCard(
            colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
            border = BorderStroke(1.dp, Color.Black),
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Outlined", textAlign = TextAlign.Center)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    PDMCardTheme {
        CardExamples()
    }
}
