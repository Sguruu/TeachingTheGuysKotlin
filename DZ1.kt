package WorkStud

import kotlin.math.sqrt

fun main() {
    var firstName: String = "Maxim"
    var lastName: String = "Maralev"
    var weight: Float = 90.3f
    var height: Int = 150
    var isChild: Boolean

    var a: String

    if (weight < 40 || height < 150) {
        isChild = true
    } else {
        isChild = false
    }

    logicInfo(firstName, lastName, height, weight, isChild)

    println("Введите свой рост")
    height = readLine()!!.toInt()

    if (weight < 40 || height < 150) {
        isChild = true
    } else {
        isChild = false
    }

    logicInfo(firstName, lastName, height, weight, isChild)

    logicInfo(firstName, lastName, height, weight)

    println(" -------------------------------------------------------- ")

    a = summ()

    println("А равно : $a")


}


fun logicInfo(firstName: String = "rfrf", lastName: String, height: Int, weight: Float, isChild: Boolean = true) {
    var info: String = """
        $firstName
        $lastName
        $height
        $weight
        $isChild"""
    println(info)
}

fun summ(): String {
    return "3" + "2"
}

fun solveEquatoin(a: Int, b: Int, c: Int) {
    val x1: Double
    var aD = a as Double
    var bD  = b as Double
    var cD : Double = c as Double
    x1 = ((-bD + sqrt(aD * bD - 4 * aD * cD)) / 2 * aD)
        //
}


