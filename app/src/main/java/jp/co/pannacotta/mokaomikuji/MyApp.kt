package jp.co.pannacotta.mokaomikuji

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun MyApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "top"
    ){
        composable("top") {
            TopScreen() {
                navController.navigate("result")
            }
        }
        composable("result") {
            ResultScreen()
        }
    }
}