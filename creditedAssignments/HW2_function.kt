package WorkStud.creditedAssignments

/***
 * Домашняя работа 02
 * Содержание : Изучение функций
 * Задание : перенести всю логику программы в фукнции
 */


fun main() {

    codeExecution()
    codeExecution(1)

}




fun codeExecution() {
    var firstName = "Maxim"
    var lastName = "Maralev"
    // вес
    var weight: Float = 90.3f
    // рост
    var height: Int = 150

    cat(firstName, lastName, height, weight)

    println("Введите свой рост")
    height = readLine()!!.toInt()

    cat(firstName, lastName, height, weight)

    print(if (weight < 40 || height < 150) "Вы ребенок" else "Вы взрослый")
}

fun codeExecution(a:Int) {
    var firstName = "Maxim"
    var lastName = "Maralev"
    // вес
    var weight: Float = 90.3f
    // рост
    var height: Int = 150

    cat(firstName, lastName, height, weight)

    println("Введите свой рост")
    height = readLine()!!.toInt()

    cat(firstName, lastName, height, weight)

    print(if (weight < 40 || height < 150) "Вы ребенок" else "Вы взрослый")
}

// функция
fun cat(firstName: String, lastName: String, height: Int, weight: Float) {

    var info: String = """
        $firstName
        $lastName
        $height
        $weight
        """
    println(info)
}

