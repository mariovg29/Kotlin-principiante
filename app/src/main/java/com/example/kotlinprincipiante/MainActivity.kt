package com.example.kotlinprincipiante

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Leccion 1
        //variablesYConstantes()

        //Leccion 2
        //tiposDeDatos()

        //Leccion 3
        //sentenciaIf()

        //Leccion 4
        //sentenciaWhen()

        //Leccion 5
        //arrays()

        //Lección 6 Diccionarios
        //maps()

        //Leccion 6 Bucles
        //bucles()

        //Lección 8
        //nullSafety()

        //Lección 9
        //funciones()

        //lección 10
        clases()


    }



    private fun variablesYConstantes(){

        //Variables

        var myFirstVariable = "Hello Mario!"
        println(myFirstVariable)

        myFirstVariable = "Bienvenidos a Mario Neta"
        println(myFirstVariable)

        var mySecondVariable = "Suscribed"
        println(mySecondVariable)

        mySecondVariable = myFirstVariable
        println(mySecondVariable)

        myFirstVariable = "Ya te has suscrito?"
        println()
        myFirstVariable

        /////CONSTANTES//////

        val myFirstConstante = "Te gusto la clase???"
        println(myFirstConstante)

        val mySecondConstant = myFirstVariable
        println(mySecondConstant)




    }
    private fun tiposDeDatos(){
        //String
        val myString  = "Hola Mario"
        val myString2  = "Hola Marioneta"
        val myString3 = myString+ ", "+ myString2
        println(myString3)

        val myint = 1
        val myInt2 = 2
        val myInt3 = myint + myInt2
        println(myInt3)

        val myFloat = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1
        val myDouble4 = myDouble+myDouble2+myDouble3
        println(myDouble4)

        //Boolean (Bool)

        val myBool = true
        val myBool2 = false
        println(myBool == myBool2)
        println(myBool && myBool2)




    }
    private fun sentenciaIf(){
        val myNumber = 10

        //Operadores condicionales
        // >< >= <= == !=

        if(myNumber< 10 && myNumber > 5){
            println("$myNumber es menor o igual que 10")

        }else {
            println("$myNumber es mayor que 10 o menor que 5")
        }


    }

    private fun sentenciaWhen() {
        // When con strign
        val country = "Colombia"

        when (country) {
            "México", "España", "Perú", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            }
            "EE.UU." -> {
                println("El idioma es Ingles")
            }
            "Francia" -> {
                println("El idioma es Frances")
            }
            else -> {
                println("No conocemos el idioma")
            }
        }

        //When con int

        val age = 11
        when (age) {
            0, 1, 2 -> {
                println("Eres un bebe")
            } in 3..10 -> {
                println("Eres un niño")
            } in 11..17->{
                println("Eres un Adolescente")
            } in 18..69->{
                println("Eres un Adulto")
            } in 70..99->{
                println("Eres un Anciano")
            }


        }



    }
    fun arrays(){
        val name  = "Mario"
        val surname = "Valadez"
        val company = "none"
        val edad = "37"

        //Creacion de un array

        val myArray= arrayListOf<String>()
        //añadir datos de uno en uno
        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(edad)
        //myArray.add(edad)
        //myArray.add(edad)

        println(myArray)

        //Añadir conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenido al curso"))
        println(myArray)

        //Acceso a datos

        val myCompany = myArray[2]
        println(myCompany)

        //Modificación de datos
        myArray[5] = "Suuscribete y activa la campanita"
        println(myArray)

        //Eliminar datos
        myArray.removeAt(5)
        println(myArray)

        //Recorrer datos
        myArray.forEach{
            println(it)
        }

        println(myArray.count())
        //myArray.clear()
        //println(myArray.count())

        println("El primer elemento es: "+myArray.first())
        println("El último  elemento es: "+myArray.last())

    }

    fun maps(){

        //mapas y diccionarios
        var myMap:Map<String, Int> = mapOf()
        println(myMap)

        //añadir elementos
        myMap = mutableMapOf("Mario" to 1, "Pepe" to 2)
        println(myMap)

        //Añadir elementos al mapa

        //Añadir un solo valor
        myMap["Ana"] =  7
        println(myMap)
        myMap.put("Juan", 8 )
        println(myMap)
        myMap.put("Mario", 9)

        println(myMap)
        myMap.put("Pedro",9)
        println(myMap)

        //Acceso a un dato
        println(myMap["Mario"])
        myMap["Mario"] = 100
        println(myMap["Mario"])

        //Borrado de Datos
        myMap.remove("Mario")
        println(myMap)

    }
    fun bucles(){

        val myArray = listOf<String>("Hola", "Bienvenido", "Aprende")
        println(myArray)

        val myMap = mutableMapOf("Mario" to 1, "Pedro" to 2, "Sara" to 1)
        println(myMap)

        //For
        for(myString in myArray){
            println(myString)

        }
        for(myElement in myMap){
            println("${myElement.key}-${myElement.value}")

        }
        for (x in 0..9){
            println(x)
        }
        for (y in 9 until 30){
            println(y)
            
        }
        for(x in 0..10 step 2){
            println(x)

        }
        for(x in 10 downTo 0 step 2){
            println(x)

        }
        for(x in 10 downTo 0 step 3){
            println(x)

        }
        val numericArray =(0..20)
        for (num in numericArray){
            println("num = "+num)
        }

        //while
        var x= 0
        while (x < 10){
            println(x)
            x+=2

        }



    }
    fun nullSafety(){
        //seguridad contra nulos

        var myString = "Mario"

        // myString = null Esto daría un error de compilación
        println(myString)

        //variable nullSafety
        var mySafetyString: String? = "Mario en nullSafety"

        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Valadez"
        //println(mySafetyString)




        /*if (mySafetyString != null){
            println("no es nulo"+mySafetyString!!)
        }else{
            println("Es nullo "+ mySafetyString)
        }*/

        //safe Call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        } ?: run {
            println("El valor es nullo"+mySafetyString)
        }
        
    }

    fun funciones (){

        saluda()
        saluda()
        saluda()

        sayMyName("mario")
        sayMyName("valadez")
        sayMyName("guerrero")
        sayMyNameAndAge("guerrero", 37)

        val sumResult = sumTwoNumbers(20,25)
        println(sumResult)

        println(sumTwoNumbers (30,60))
        println(sumTwoNumbers(10,sumTwoNumbers(10,10)))

    }
    //funcion simple
    fun saluda(){
        println("Hola!")
    }
    //funciones con parametro de entrada
    fun sayMyName(name:String){
        println("Hola mi nombre $name")
    }
    //funciones con más de un parametro de enrada
    fun sayMyNameAndAge(name:String, age:Int){
        println("Hola mi nombre $name y mi edad es $age")
    }

    //Funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber : Int, secondNumber : Int):Int {
      val sum = firstNumber+secondNumber
      return sum

    }
    fun clases(){
        //crear un Programador
        val mario = Programmer(
            "Mario",
            32,
            //Acceder a los lenguajes del array de enum definido en la clase Programmer
            arrayOf(
                Programmer.Languaje.JAVA,
                Programmer.Languaje.JAVASCRIPT,
                Programmer.Languaje.SWIFT)
                    )
        println(mario.name)
        mario.age = 40
        mario.code()

        //Crear un programador adicional
        val el_pepe = Programmer(
            "El Pepe",
            37,

            arrayOf(
                Programmer.Languaje.JAVASCRIPT,
                Programmer.Languaje.JAVA,
                ),
            //Acceder a loa amigos que se encuentran en la clase Programmers
            arrayOf(mario)
        )
        println(el_pepe.name)
        el_pepe.name = "el pepe"
        el_pepe.code()
        println("${el_pepe.friends?.first()} es amigo de ${el_pepe.name}")

    }

}