package com.example.kotlinprincipiante

class Programmer(
    var name:String,
    var age:Int,
    var Languages:Array<Languaje>,
    val friends: Array<Programmer>? = null

    ) {
    enum class Languaje{
        KOTLIN,
        SWIFT,
        JAVA,
        JAVASCRIPT
    }

    fun code(){
        for (language in Languages ){
            println("Estoy programando en $language")
        }
    }
}