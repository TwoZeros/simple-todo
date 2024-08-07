package ru.twozeros.todo.views

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.util.*

class SimpleTest {

    @Test
    fun null_Safety_type() {

        var name: String = "Kirill" //  non-null значение
        //name = null // ошибка компиляции

        var nickname: String? = "Kirill" // <НазваниеТипа>? - null-значения возможны
        nickname = null // это ок
    }

    private fun greeting(name: String) {
        println("Hello, $name")
    }

    fun getName(): String? {
        return "Kirill"
    }
    @Test
    fun testHello() {
        val name = getName()
        greeting(name.orEmpty().ifEmpty { "Аноним" })
    }


    class Wallet(val name: String, var sum: Int, )

    class Person(val name: String, var wallet: Wallet? = null)

    class Result(val date: Date, val person: Person? = null)

    private fun returnEmptyResult(): Result {
        return Result(
            date = Date(),
            person = null
        )
    }
    @Test
    fun testNestedNullObject() {
        val rs = returnEmptyResult()
        val sum = rs.person?.wallet?.sum
        println(sum)
    }
}