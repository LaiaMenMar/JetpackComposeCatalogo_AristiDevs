package com.laiamenmar.jetpackcomposecatalogo.model

/*agrupa pequeña cñse o objetos*/
sealed class Routes (val route: String) {
    object Pantalla1: Routes("pantalla1_id")
    object Pantalla2: Routes("pantalla2_id")
    object Pantalla3: Routes("pantalla3_id")

    object Pantalla5: Routes("pantalla5/{num}"){
        fun createRoute(num:Int) = "pantalla5/$num"
    }
    object Pantalla6: Routes("pantalla6?name1={name1}"){
        fun createRoute(name1:String) = "pantalla6?name1=$name1"
    }


}
