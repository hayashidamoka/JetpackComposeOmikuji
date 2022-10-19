package jp.co.pannacotta.mokaomikuji

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlin.random.Random

@Composable
fun ResultScreen(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = result())
    }
}
fun result(): String {
    val text = when(Random.nextInt(5)) {
        0 -> "大吉"
        1 -> "中吉"
        2 -> "小吉"
        3 -> "吉"
        else -> "凶"
    }
    return text
}