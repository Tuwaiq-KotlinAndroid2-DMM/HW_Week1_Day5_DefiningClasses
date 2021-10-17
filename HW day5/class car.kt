class Car ( var model: String, var year: Int){
}

fun main() {
    var car = Car("Toyota", 2020)

    println("The car model is : " + car.model + "\n The car produced at year:" + car.year)
}