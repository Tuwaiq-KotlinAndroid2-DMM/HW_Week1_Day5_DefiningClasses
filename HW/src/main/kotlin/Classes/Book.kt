package Classes

class Book(var title: String, var author: String, var price: Double, var inStock: Boolean) {
    fun bookDetails() {
        println("--- Book Details ---\n Name: $title\n Author: $author \n Price:$price ")
        if (inStock) {
            println("Availability: In stock")
        } else println("Availability: Out of stock")

    }
}