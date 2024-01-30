package com.laiamenmar.jetpackcomposecatalogo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Star
import androidx.compose.material.icons.rounded.ToggleOff
import androidx.compose.material.icons.rounded.ToggleOn
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.laiamenmar.jetpackcomposecatalogo.model.Routes
import com.laiamenmar.jetpackcomposecatalogo.ui.theme.CheckInfo
import com.laiamenmar.jetpackcomposecatalogo.ui.theme.JetpackComposeCatalogoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeCatalogoTheme {
                // A surface container using the 'background' color from the theme
                /********* Tuit *******************//*
                Column(
                   modifier = Modifier.fillMaxSize().background(Color(0xFF161D26))

                ) {
                    TwitterCard()
                    TuitDivider()
                    TwitterCard()

                }
                /******************************************/*/

                Surface(
                    // modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    /********* MyAlertDialog *******************/ /*
                    var show by remember { mutableStateOf(false) }

                    Box(
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(onClick = { show = true}) {
                            Text(text = "Mostrar Dialogo")
                            
                        }
                        MyAlertDialog(
                            show = show,
                            onDismiss = { show = false },
                            onConfirm = { Log.i("aris", "click") })
                    }
                    /******************************************/ */

                    /********* MySimpleCustomDialog *******************/ /*
                    var show by remember { mutableStateOf(false) }

                    Box(
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(onClick = { show = true}) {
                            Text(text = "Mostrar Dialogo")

                        }
                        MySimpleCustomDialog(
                            show = show,
                            onDismiss = { show = false },
                            )
                    }
                    /******************************************/ */

                    /********* MyCustomDialog *******************//*
                    var show by remember { mutableStateOf(false) }

                    Box(
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(onClick = { show = true}) {
                            Text(text = "Mostrar Dialogo")

                        }
                        MyCustomDialog(
                            show = show,
                            onDismiss = { show = false },
                            )
                    }
                    /******************************************/*/
                    /********* MyConfirmationDialog *******************//*
                    var show by remember { mutableStateOf(false) }

                    Box(
                        Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ) {
                        Button(onClick = { show = true}) {
                            Text(text = "Mostrar Dialogo")

                        }
                        MyConfirmationDialog(
                            show = show,
                            onDismiss = { show = false },
                        )
                    }
                    /******************************************/*/
                    /********* LoginScreen *******************//*
                    LoginScreen()
                    /******************************************/*/

                    /********* SimpleRecicleView *******************//*
                    SimpleRecycleView()
                    /******************************************/*/

                    /********* SuperHeroView *******************//*
                   SuperHeroView()
                   /******************************************/*/

                    /********* SuperHeroView *******************//*
                   SuperHeroGridView()
                   /******************************************/*/

                    /********* SuperHeroViewSpecialControlView *******************//*
                   SuperHeroViewSpecialControlView()
                   /******************************************/*/

                    /********* SuperHeroStickyView *******************//*
                   SuperHeroStickyView()
                   /******************************************/*/

                    /********* ScaffoldExample_v1() *******************//*
                   ScaffoldExample_v1()
                   /******************************************/*/

                    /********* Navegacioón entre pantallas *******************/
                    val navigationController = rememberNavController()

                    NavHost(
                        navController = navigationController,
                        startDestination = Routes.Pantalla1.route
                    ) {
                        composable(Routes.Pantalla1.route) {
                            Screen1(navigationController)
                        }
                        composable(Routes.Pantalla2.route) {
                            Screen2(navigationController)
                        }
                        composable(Routes.Pantalla3.route) {
                            Screen3(navigationController)
                        }
                        /*La pasa como parámtro  OBLIGATORIO -> String*/
                        composable("pantalla4/{name}") { backStackEntry ->
                            Screen4(
                                navigationController,
                                backStackEntry.arguments?.getString("name").orEmpty()
                            )
                        }
                        /*La pasa como parámtro  OBLIGATORIO -> Int*/
                        composable(
                            Routes.Pantalla5.route,
                            arguments = listOf(navArgument("num") {type = NavType.IntType})
                        ) { backStackEntry ->
                            Screen5(
                                navigationController,
                                backStackEntry.arguments?.getInt("num") ?:0
                            )
                        }

                        composable (Routes.Pantalla6.route,
                            arguments = listOf(navArgument("name1", {defaultValue = "Pepe"}))) {
                                backStackEntry ->
                            Screen6(
                                navigationController,
                                backStackEntry.arguments?.getString("name1")
                            )

                        }


                    }
                }
            }
        }
    }
}


@Composable
fun MyStateExample() {
    //remember si nno vas a rotar la pantalla
    //hay que importtar import androidx.compose.runtime.getValue y setValue
    // en la variable counter si cmabias el = por un by puedes usar directamente el nombre de la variable
    var counter = remember { mutableStateOf(0) }
    var counter2 by rememberSaveable { mutableStateOf(0) }
    Column(
        Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(onClick = { counter2 += 1 }) {
            Text(text = "Pulsar")
        }
        Text(text = "Boton pulsado ${counter.value} veces")

    }
}

/*********************************************    BOX, COLUMN Y ROW    *********************************************/

@Composable
fun MyComplexLayout() {
    Column(Modifier.fillMaxSize()) {
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .weight(1f),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Ejemplo1")
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(Color.Cyan)
                .weight(1f)
        ) {
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Magenta)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                Text(text = "Ejemplo2")
            }
            Box(
                Modifier
                    .fillMaxHeight()
                    .background(Color.Yellow)
                    .weight(1f),
                contentAlignment = Alignment.Center
            ) {

                Text(text = "Ejemplo3")
            }


        }
        Box(
            Modifier
                .fillMaxWidth()
                .background(Color.Green)
                .weight(1f),
            contentAlignment = Alignment.BottomCenter
        ) {
            Text(text = "Ejemplo3")
        }

    }
}


@Composable
fun MyRow() {
    /*    Row (Modifier.fillMaxSize(), horizontalArrangement = Arrangement.SpaceBetween){
            Text(text = "Hola1")
            Text(text = "Hola1")
            Text(text = "Hola1")
        }*/
    Row(
        Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState()),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Hola1", Modifier.width(100.dp))
        Text(text = "Hola1", Modifier.width(100.dp))
        Text(text = "Hola1", Modifier.width(100.dp))
        Text(text = "Hola1", Modifier.width(100.dp))
        Text(text = "Hola1", Modifier.width(100.dp))
        Text(text = "Hola1", Modifier.width(100.dp))
    }
}

@Composable
fun MyColumn() {
    /*Column (Modifier.fillMaxSize()){
        Text(text = "Hola1", modifier= Modifier.background(Color.Green).weight(2f))
        Text(text = "Hola1",  modifier= Modifier.background(Color.Blue).weight(1f))
        Text(text = "Hola1",  modifier= Modifier.background(Color.Cyan).weight(1f))
        Text(text = "Hola1",  modifier= Modifier.background(Color.Red).weight(1f))
    }*/
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceBetween) {
        Text(
            text = "Hola1", modifier = Modifier
                .background(Color.Green)
                .fillMaxWidth()
        )
        Text(
            text = "Hola1", modifier = Modifier
                .background(Color.Blue)
                .fillMaxWidth()
        )
        Text(
            text = "Hola1", modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
        )
        Text(
            text = "Hola1", modifier = Modifier
                .background(Color.Red)
                .fillMaxSize()
        )
    }
}

/* Box ocupa el contenido que hay dentro, si quitas el alto y el ancho
y no contiene nada, no necesita espacio.*/
@Composable
fun MyBox() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Box(
            modifier = Modifier
                .width(50.dp)
                .height(50.dp)
                .background(Color.Gray)
                .verticalScroll(
                    rememberScrollState()
                ),
            contentAlignment = Alignment.Center

        ) {
            Text("Esto es un ejemplo")
        }
    }
}

/*********************************************    TEXT    *********************************************/
@Composable
fun MyTextFieldOutlined() {
    var myText by remember { mutableStateOf("") }
    OutlinedTextField(
        value = myText,
        onValueChange = { myText = it },
        modifier = Modifier.padding(24.dp),
        label = { Text(text = "Holaaaa") },
        placeholder = {
            Text("Placeholder")
        },
        colors = TextFieldDefaults.colors(
            focusedIndicatorColor = Color.Magenta,
            unfocusedIndicatorColor = Color.Red,

            )
    )
}

@Composable
fun MyTextFieldAdvance() {
    var myText by remember { mutableStateOf("") }
    TextField(
        value = myText,
        onValueChange = {
            myText = if (it.contains("a")) {
                it.replace("a", "")
            } else {
                it
            }
        },
        placeholder = {
            Text("Placeholder")
        },
        label = {
            Text(text = "Introduce tu nombre")
        })
}


@Composable
fun MyTextField(myText: String, onValueChanged: (String) -> Unit) {
    //  var myText by remember { mutableStateOf("Laia") } esto se va arriba al padre
    TextField(value = myText, onValueChange = { onValueChanged(it) })

    // en el padre se hace la llamada MyTextField(myText) { myText = it}
}


@Composable
fun Mytext() {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Esto es un ejemplo", color = Color.Blue)
        Text(text = "Esto es un ejemplo", fontWeight = FontWeight.ExtraBold)
        Text(text = "Esto es un ejemplo", fontWeight = FontWeight.Light)

        Text(text = "Esto es un ejemplo", style = TextStyle(fontFamily = FontFamily.Cursive))
        Text(
            text = "Esto es un ejemplo",
            style = TextStyle(textDecoration = TextDecoration.LineThrough)
        )
        Text(
            text = "Esto es un ejemplo",
            style = TextStyle(textDecoration = TextDecoration.Underline)
        )
        Text(
            text = "Esto es un ejemplo", style = TextStyle(
                textDecoration = TextDecoration.combine(
                    listOf(TextDecoration.LineThrough, TextDecoration.Underline)
                )
            )
        )

        Text(text = "Esto es un ejemplo", fontSize = 30.sp)

        //se puede quitar el style
    }
}

/*********************************************    BUTTON    *********************************************/

@Composable
fun MyButtonExample() {
    var enabled by remember { mutableStateOf(true) }
    Column(
        Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Button(
            onClick = { enabled = false },
            enabled = false,
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Blue,
                containerColor = Color.Magenta
            ),
            border = BorderStroke(5.dp, Color.White)
        ) {
            Text(text = "Hola")
        }

        OutlinedButton(
            onClick = { enabled = false },
            enabled = false,
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Blue,
                containerColor = Color.Magenta,
                disabledContainerColor = Color.Cyan
            ),

            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text(text = "Hola")
        }
        TextButton(onClick = { /*TODO*/ }) {
            Text(text = "Hola")
        }
    }
}

/*********************************************    ICON    *********************************************/

@Composable
fun MyIcon() {
    Icon(
        imageVector = Icons.Rounded.Star,
        contentDescription = "Icon",
        tint = Color.Red
        //libreria
        //  androidx.compose.material:material-icons-extended: ~compose_version
    )
}


@Composable
fun MyIcon2() {
    var estadoInterruptor by rememberSaveable { mutableStateOf(true) }

    Icon(
        imageVector = if (estadoInterruptor) Icons.Rounded.ToggleOn else Icons.Rounded.ToggleOff,
        contentDescription = "Interruptor",
        modifier = Modifier.clickable { estadoInterruptor = !estadoInterruptor },
        tint = if (estadoInterruptor) Color.Green else Color.Red

    )

}

/*********************************************    SWITCH    *********************************************/

@Composable
fun MySwitch2() {
    var state by rememberSaveable {
        mutableStateOf(false)
    }

    Switch(
        checked = state,
        enabled = false,
        onCheckedChange = { state = !state },
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            uncheckedTrackColor = Color.Magenta,

            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Cyan,

            disabledCheckedTrackColor = Color.Yellow.copy(alpha = 0.3f),
            disabledCheckedThumbColor = Color.Blue.copy(alpha = 0.3f),

            disabledUncheckedTrackColor = Color.Blue.copy(alpha = 0.3f),
            disabledUncheckedThumbColor = Color.Yellow.copy(alpha = 0.3f),
        )
    )
}

@Composable
fun MySwitch3() {
    var state by rememberSaveable { mutableStateOf(true) }
    Switch(
        checked = state,
        onCheckedChange = { state = !state },
        enabled = false,
        colors = SwitchDefaults.colors(
            uncheckedThumbColor = Color.Red,
            uncheckedTrackColor = Color.Magenta,
            checkedThumbColor = Color.Green,
            checkedTrackColor = Color.Cyan,
            disabledCheckedTrackColor = Color.Blue.copy(0.3f),
            disabledCheckedThumbColor = Color.Blue.copy(0.8f),
            disabledUncheckedTrackColor = Color.Yellow.copy(0.3f),
            disabledUncheckedThumbColor = Color.Yellow.copy(0.8f),
        )
    )
}

/*
/*********************************************    IMAGE    *********************************************/
@Composable
fun MyImage2() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "eejemplo",
        modifier = Modifier
            //.clip(RoundedCornerShape(25f))
            .clip(CircleShape)
            .border(5.dp, Color.Red, CircleShape)
    )
}


@Composable
fun MyImage1() {
    Image(
        painter = painterResource(id = R.drawable.ic_launcher_background),
        contentDescription = "eejemplo",
        alpha = 0.5f
    )
}
*/

/*********************************************    PROGRESSBAR    *********************************************/
@Composable
fun MyprogressBar() {
    var showLoading by remember { mutableStateOf(false) }
    Column(
        Modifier.padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        if (showLoading) {
            CircularProgressIndicator(color = Color.Red, strokeWidth = 10.dp)
            LinearProgressIndicator(
                modifier = Modifier.padding(top = 32.dp),
                color = Color.Red,
                trackColor = Color.DarkGray
            )
        }
        Spacer(modifier = Modifier.padding(16.dp))
        Button(onClick = { showLoading = !showLoading }) {
            Text(text = "caragndo")
        }


    }
}

@Composable
fun MyprogressBarAdvance() {
    var speed by remember { mutableStateOf(0f) }
    Column(
        Modifier.padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        CircularProgressIndicator(progress = speed)
        Spacer(modifier = Modifier.padding(16.dp))
        Row(Modifier.fillMaxWidth()) {
            Button(onClick = { speed += 0.1f }) {
                Text(text = "Incrementar")
            }
            Button(onClick = { speed -= 0.1f }) {
                Text(text = "Reducir")
            }


        }
    }
}

/*********************************************    CHECKBOX    *********************************************/

/*
*                    val myOptions = getOptions(titles = listOf("laia", "Pablo", "Aris"))

                    Column() {
                        MyTriStatusCheckBox()
                        myOptions.forEach {
                            Checkboxcompleted(it)
                        }
                    }

* * */

@Composable
fun MyTriStatusCheckBox() {
    var state by rememberSaveable { mutableStateOf(ToggleableState.Off) }

    TriStateCheckbox(state = state, onClick = {
        state = when (state) {
            ToggleableState.On -> ToggleableState.Off
            ToggleableState.Off -> ToggleableState.Indeterminate
            ToggleableState.Indeterminate -> ToggleableState.On
        }
    })

}


@Composable
fun Checkboxcompleted(checkInfo: CheckInfo) {

    Row(
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = checkInfo.onCheckedChange
        )
        Spacer(
            modifier =
            Modifier.width(8.dp)
        )
        Text(text = checkInfo.title)
    }
}

@Composable
fun getOptions(titles: List<String>): List<CheckInfo> {
    return titles.map {
        var status by remember { mutableStateOf(true) }
        CheckInfo(
            title = it,
            selected = status,
            onCheckedChange = { myNewStatus -> status = myNewStatus }  //{ status = it}
        )
    }
}


@Composable
fun CheckboxExample2() {
    var state by rememberSaveable { mutableStateOf(false) }
    Row(
        Modifier.padding(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(checked = state,
            onCheckedChange = { state = !state })
        Spacer(
            modifier =
            Modifier.width(8.dp)
        )
        Text(text = "Ejemplo 1 ")
    }
}

@Composable
fun CheckboxExample() {
    var isChecked by remember { mutableStateOf(false) }

    Column {
        Text(text = "Check the box:")

        Checkbox(
            checked = isChecked,
            onCheckedChange = {
                isChecked = it
            },

            )


        Text(text = if (isChecked) "Checkbox is checked" else "Checkbox is unchecked")
    }
}

@Composable
fun MyCheckBox() {
    var state by rememberSaveable { mutableStateOf(false) }

    Checkbox(
        checked = state,
        onCheckedChange = { state = it },
        enabled = true,
        colors = CheckboxDefaults.colors(
            checkedColor = Color.Red,
            uncheckedColor = Color.Blue,
            checkmarkColor = Color.Cyan

        )

    )
}

/*********************************************    RADIOBUTTON    *********************************************/

/**
 * **JetpackComposeCatalogoTheme {
 *                 var selected by remember { mutableStateOf("Aris") }
 *                 // A surface container using the 'background' color from the theme
 *                 Surface(
 *                     modifier = Modifier.fillMaxSize(),
 *                     color = MaterialTheme.colorScheme.background
 *                 ) {
 *                     MyRadioButtonList(selected) { selected = it } }
 *             }
 *         }
 */
@Composable
fun MyRadioButtonList(name: String, onItemSelected: (String) -> Unit) {

    Column(Modifier.fillMaxWidth()) {
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Aris",
                onClick = { onItemSelected("Aris") },
            )
            Text(text = "Aris")
        }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Laia",
                onClick = { onItemSelected("Laia") },
            )
            Text(text = "Laia")
        }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Pepe",
                onClick = { onItemSelected("Pepe") },
            )
            Text(text = "Pepe")
        }
        Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            RadioButton(
                selected = name == "Menganito",
                onClick = { onItemSelected("Menganito") },
            )
            Text(text = "Menganito")
        }


    }
}

/*********************************************    CARD    *********************************************/

@Composable
fun MyCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()

            .padding(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 12.dp),
        shape = MaterialTheme.shapes.small,
        border = BorderStroke(5.dp, Color.Yellow),
        colors = CardDefaults.cardColors(
            containerColor = Color.Red,    //fondo
            contentColor = Color.Blue
        )
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Ejemplo1")
            Text(text = "Ejemplo1")
            Text(text = "Ejemplo1")
            Text(text = "Ejemplo1")
        }
    }

}

/*********************************************    MYBADGEBOX    *********************************************/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyBadgeBox() {
    BadgedBox(
        modifier = Modifier.padding(50.dp),
        badge = {
            Badge(
                content = {
                    Text(modifier = Modifier.padding(2.dp), text = "12")
                },
                contentColor = Color.White,
                containerColor = Color.Green,
                modifier = Modifier.padding(2.dp)
            )
        },
    ) {
        Icon(
            modifier = Modifier.size(50.dp),
            imageVector = Icons.Default.Star,
            contentDescription = "l",
            tint = Color.Blue
        )
    }
}

/*********************************************    DIVIDIR    *********************************************/
@Composable

fun MyDividir() {
    Divider(
        Modifier
            .fillMaxWidth()
            .padding(16.dp), color = Color.Blue
    )
}


/*********************************************    DROPDOWN MENU    *********************************************/
@Composable
fun MyDropDownMenu() {
    7
    val desserts = listOf("helado", "chocolate", "fruta", "natilla")
    var expanded by remember { mutableStateOf(false) }
    var selectedText by remember { mutableStateOf(desserts[0]) }


    Column(Modifier.padding(20.dp)) {
        OutlinedTextField(
            value = selectedText,
            onValueChange = { selectedText = it },
            enabled = false,
            readOnly = true,
            modifier = Modifier
                .clickable { expanded = true }
                .fillMaxWidth()
        )
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier.fillMaxWidth()
        ) {
            desserts.forEach { dessert ->
                DropdownMenuItem(
                    text = {
                        Text(text = dessert)
                    },
                    onClick = {
                        expanded = false
                        selectedText = dessert
                    }
                )
            }
        }
    }
}


@Composable
fun GreetingPreview() {
    JetpackComposeCatalogoTheme {

    }
}