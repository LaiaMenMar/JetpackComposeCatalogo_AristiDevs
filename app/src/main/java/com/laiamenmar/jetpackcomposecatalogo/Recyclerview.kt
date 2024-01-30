package com.laiamenmar.jetpackcomposecatalogo

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.laiamenmar.jetpackcomposecatalogo.model.Superhero
import kotlinx.coroutines.launch

@Composable
fun SimpleRecycleView() {
    var myList = listOf("Aris", "laia", "Pablo", "pablo")

    LazyColumn {
        item { Text(text = "preimer item") }

        items(7) {
            Text(text = "se va a repetir 7 veces  $it")
        }

        items(myList) {
            Text(text = "Hola m llamos $it") // si fuera una obketo it.cada uno de los campos
        }
    }
}


@Composable
fun SuperHeroView() {
    val context = LocalContext.current
    /* LazyRow (horizontalArrangement = Arrangement.spacedBy(8.dp)) {
         items(getSuperheroes()) {
             ItemHero(superhero = it)
         }

         items(getSuperheroes()) { superhero ->
             ItemHero(superhero = superhero)
         }
     } */

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {
        items(getSuperheroes()) { superhero ->
            ItemHero(superhero = superhero) {
                Toast.makeText(
                    context,
                    it.superHeroname,
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun SuperHeroStickyView() {
    val context = LocalContext.current
    val superhero: Map<String, List<Superhero>> = getSuperheroes().groupBy { it.publisher }

    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)) {

        superhero.forEach { (publisher, mySuperHero) ->

            stickyHeader {
            Text(text = publisher,
                modifier = Modifier.fillMaxWidth().background(Color.Green),
                 )
            }
            items(mySuperHero) { superhero ->
                ItemHero(superhero = superhero) {
                    Toast.makeText(
                        context,
                        it.superHeroname,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }
    }
}

@Composable
fun SuperHeroViewSpecialControlView() {
    val context = LocalContext.current
    val rvState = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Column {
        LazyColumn(
            modifier = Modifier.weight(1f),
            state = rvState,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(getSuperheroes()) { superhero ->
                ItemHero(superhero = superhero) {
                    Toast.makeText(
                        context,
                        it.superHeroname,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        }

        val showbutton by remember {
            derivedStateOf {
                rvState.firstVisibleItemIndex > 0
            }

        }

        if (showbutton) {
            Button(
                onClick = {
                    coroutineScope.launch {
                        rvState.animateScrollToItem(0)
                    }
                },
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp)
            ) {
                Text(text = "soy un boton")

            }
        }
    }

}

@Composable
fun SuperHeroGridView() {
    val context = LocalContext.current
    LazyVerticalGrid(
        columns = GridCells.Adaptive(100.dp),  /*columns = GridCells.Fixed(2) num columnas o columns = GridCells.Adaptive(100.dp) tamaño minimo del iterm*/
        content = {
            items(getSuperheroes()) { superhero ->
                ItemHero(superhero = superhero) {
                    Toast.makeText(
                        context,
                        it.superHeroname,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }
        },
        verticalArrangement = Arrangement.spacedBy(6.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        /* contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)*/
    )
}


@Composable
fun ItemHero(superhero: Superhero, onItemSelected: (Superhero) -> Unit) {
    Card(border = BorderStroke(2.dp, Color.Red),
        modifier = Modifier.fillMaxWidth()
        .clickable { onItemSelected(superhero) }) {
        Column() {
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = "",
                modifier = Modifier.fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Text(
                text = superhero.superHeroname,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = superhero.realName,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                fontSize = 12.sp
            )
            Text(
                text = superhero.publisher,
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(4.dp),
                fontSize = 10.sp
            )
        }
    }

}

fun getSuperheroes(): List<Superhero> {
    return listOf(
      /*  Superhero("Spiderman", "Petter Parker", "Marvel", R.drawable.spiderman),
        Superhero("Wolverine", "James Howlett", "Marvel", R.drawable.logan),
        Superhero("Batman", "Bruce Wayne ", "DC", R.drawable.batman),
        Superhero("Thor", "Thor Odinson", "Marvel", R.drawable.thor),
        Superhero("Flash", "Jay Garrick", "DC", R.drawable.flash),
        Superhero("Green Latern", "Alan Scott", "DC", R.drawable.green_lantern),
        Superhero("Wonder Woman", "Princess DIana", "DC", R.drawable.wonder_woman)*/
    )


}