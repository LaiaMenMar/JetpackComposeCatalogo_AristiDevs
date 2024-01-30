package com.laiamenmar.jetpackcomposecatalogo

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.laiamenmar.jetpackcomposecatalogo.model.Routes

@Composable
fun Screen1(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)
    ) {
        Text(text = "PANTALLA 1", modifier = Modifier
            .align(Alignment.Center)
            .clickable {
                navController.navigate(
                    Routes.Pantalla2.route
                )
            })
    }
}

@Composable
fun Screen2(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Text(
            text = "PANTALLA 2",
            modifier = Modifier
                .align(Alignment.Center)
                .clickable { navController.navigate(Routes.Pantalla3.route) })
    }
}

@Composable
fun Screen3(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Magenta)
    ) {
        Text(text = "PANTALLA 3", modifier = Modifier.align(Alignment.Center).clickable { navController.navigate("pantalla4/Laia") })
    }
}

@Composable
fun Screen4(navController: NavController, name: String) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Yellow)
    ) {
        Text(text = name, modifier = Modifier.align(Alignment.Center).clickable { navController.navigate(Routes.Pantalla5.createRoute(38)) })
    }
}

@Composable
fun Screen5(navController: NavController, num: Int) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Text(text = "mi edad es de $num", modifier = Modifier.align(Alignment.Center).clickable { navController.navigate(Routes.Pantalla6.createRoute("Laia ")) })
    }
}

@Composable
fun Screen6(navController: NavController, name1: String?) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Text(text = "me llamo $name1", modifier = Modifier.align(Alignment.Center))
    }
}