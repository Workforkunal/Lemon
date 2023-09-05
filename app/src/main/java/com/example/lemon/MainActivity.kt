package com.example.lemon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemon.ui.theme.LemonTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LemonTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LemonApp()
                }
            }
        }
    }
}

@Composable
fun LemonApp() {
    var currentStep by remember { mutableStateOf(1) }
    when (currentStep) {
        1 -> {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.lemon_tree),
                    contentDescription = stringResource(id = R.string.message),
                    modifier = Modifier.clickable { currentStep = 2 }
                        .wrapContentSize()
                        .border(
                            BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )
                Spacer(modifier = Modifier.height(50.dp))

                Text(text = stringResource(id = R.string.message))

            }

        }
        2 -> {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.lemon_squeeze),
                    contentDescription = stringResource(id = R.string.squeeze),
                    modifier = Modifier.clickable { currentStep = 3 }
                        .wrapContentSize()
                        .border(
                            BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )
                Spacer(modifier = Modifier.height(50.dp))

                Text(text = stringResource(id = R.string.squeeze))
            }
        }
        3-> {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.lemon_drink),
                    contentDescription = stringResource(id = R.string.drink),
                    modifier = Modifier.clickable { currentStep = 4 }
                        .wrapContentSize()
                        .border(
                            BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )
                Spacer(modifier = Modifier.height(50.dp))

                Text(text = stringResource(id = R.string.drink))
            }

        }
        4-> {
            Column(
                modifier = Modifier,
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.lemon_restart),
                    contentDescription = stringResource(id = R.string.empty_glass),
                    modifier = Modifier.clickable { currentStep = 1 }
                        .wrapContentSize()
                        .border(
                            BorderStroke(3.dp, Color.Black),
                            shape = RoundedCornerShape(10.dp)
                        )
                )
                Spacer(modifier = Modifier.height(50.dp))

                Text(text = stringResource(id = R.string.empty_glass))
            }

        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun LemonAppPreview() {
    LemonTheme {
        LemonApp()
    }
}