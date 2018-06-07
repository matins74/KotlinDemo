package com.example.matsayya.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        strToInt()
        findMyAge()
        simpleWhen()
        decisonMaking()
        forLoop()


    }

    private fun forLoop() {

        for (item in 1..5)
        {
            println("count : $item")
        }
    }

    private fun decisonMaking() {

        var n1 = 2
        var n2 = 3
    }

    private fun simpleWhen() {
        var x = 16

        when(x) {
            1 -> println("value is 1")
            2,3 -> println("value is 2 or 3")
            in 4..10 -> println("value is in between 4 and 10")
            !in 4..10 -> println("value is not in between 4 and 10")
            else ->
            {
                println("value is out of range")
            }
        }
    }

    private fun findMyAge() {


        var Dob:Int = 1991
        var cyear = Calendar.getInstance().get(Calendar.YEAR)
        var age = cyear - Dob

        println(" Your age is $age")
    }

    private fun strToInt() {

        var n1:Int=10
        var n2:Int?
        var n2Str:String= "12"
        n2 = n2Str.toInt()
        println("N1:" + n1)
        println("N2:" + n2)
    }
}
