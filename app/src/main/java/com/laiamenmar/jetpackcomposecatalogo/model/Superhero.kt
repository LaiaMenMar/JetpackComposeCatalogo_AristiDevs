package com.laiamenmar.jetpackcomposecatalogo.model

import androidx.annotation.DrawableRes
import java.util.concurrent.SubmissionPublisher

data class Superhero(
    var superHeroname: String,
    var realName: String,
    var publisher: String,
    @DrawableRes var photo: Int)

