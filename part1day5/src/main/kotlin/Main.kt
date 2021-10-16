class Car {
    var brand = ""
    var model: String = ""
    var year :Int = 0
}

fun main() {
    val ins = Car()

    ins.model = "Toyota"
    ins.year = 2020

    println(ins.model)
    println(ins.year)
}