fun main() {
    var toyota = Car("Toyota", "Camry", 2020, 25000)
    println(toyota.toString())
}

class Car (var brand: String, var model: String, var year: Int, var price: Int){
    override fun toString(): String {
        return "The car $model id produced by $brand in $year and it costs $price"
    }
}