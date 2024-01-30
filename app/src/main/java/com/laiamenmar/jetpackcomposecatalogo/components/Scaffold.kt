package com.laiamenmar.jetpackcomposecatalogo.components
/*
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Dangerous
import androidx.compose.material.icons.filled.Search


import androidx.compose.material.*
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem


import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun ScaffoldExample() {

    val snackBarHostState = remember { SnackbarHostState() }
    val coroutineScope = rememberCoroutineScope()
    var enable by remember { mutableStateOf(false)}
    val rotacion : Float by animateFloatAsState(targetValue =  if (enable) 45f else 0f)

    Scaffold(
        snackbarHost = { SnackbarHost(hostState = snackBarHostState) },
        topBar = { MyTopAppBar { coroutineScope.launch { snackBarHostState.showSnackbar("Has pulsado $it") } } },
        bottomBar = { MyBottomNavigation() },
        floatingActionButton = { Fab(onAbrirMenu = { enable = !enable },rotacion)})  { contentPadding ->
        Box(
            modifier = Modifier
                .height(50.dp)
                .fillMaxWidth()
                .background(Color.Red)
                .padding(contentPadding)
        ) {

        }
    }
}



@Composable
fun MyTopAppBar(onClickIcon: (String) -> Unit) {
    androidx.compose.material.TopAppBar(
        title = {Text(text = "Mi primera TopBar")},
        backgroundColor = Color.Red,
        contentColor = Color.White,
        elevation = 4.dp,
        navigationIcon = { /*Icono de navegacion, parte izquierda, antes el texto*/
            IconButton(onClick = { onClickIcon("Atras")}) {
                Icon(
                    imageVector = Icons.Filled.ArrowBack, contentDescription = "Back"
                )
            }
        },
        actions = {
            IconButton(onClick = { onClickIcon("buscar")}) {
                Icon(
                    imageVector = Icons.Filled.Search, contentDescription = "Search"
                )
            }

            IconButton(onClick = { onClickIcon("peligro")}) {
                Icon(
                    imageVector = Icons.Filled.Dangerous, contentDescription = "Dangerous"
                )
            }
        } ) /*al final de la toolbar para realizar acciones*/
}
@Composable
fun MyBottomNavigation() {
    var index by remember { mutableStateOf(0) }

    NavigationBar(contentColor = MaterialTheme.colors.primary) {

        NavigationBarItem(
            selected = index == 0,
            onClick = { index = 0 },
            label = { Text(text = "Home") },
            icon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = "home"
                )
            })

        NavigationBarItem(
            selected = index == 1,
            onClick = { index = 1 },
            label = { Text(text = "Favorite") },
            icon = {
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = "favorite"
                )
            })

        NavigationBarItem(
            selected = index == 2,
            onClick = { index = 2 },
            label = { Text(text = "Search") },
            icon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = "Search"
                )
            })

    }
}

@Composable
fun Fab(onAbrirMenu: ()->Unit, rotacion : Float) {
    FloatingActionButton(onClick = { onAbrirMenu() },
        backgroundColor = Color.Yellow,
        contentColor = Color.Blue

    ) {
        Icon(imageVector = Icons.Filled.Add, contentDescription = "add",
            modifier = Modifier.graphicsLayer(rotationZ = rotacion))
    }
}



*/