
///////class
fun main() {

}
class Car() {
    var model: String = ""
    var year: Int = 0


}


fun main() {

    var theCar = Car()
    theCar.year = 2020
    theCar.model = "Toyota"

    println(theCar.model + + theCar.year)
//////////////////////////////////////////////////////////////////

    
class Book (var title: String, var author: String, var price: Double, var inStock: Boolean) {

    fun bookInformation() {
        val rounded = String.format("%.2f", price).toInt()
        if (inStock) {
            println("""
                Name: $title 
                Author: $author
                Price: $$rounded
                Availability: In stock
            
            """.trimIndent())
        } else {
            println(
                """
                Name: $title 
                Author: $author
                Price: $$rounded
                Availability: Out of stock
            
            """.trimIndent()
            )
        }
    }
}




