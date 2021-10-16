class Book(var title: String, var author: String, var price: Double, var stock: Boolean) {
    fun bookDetails(stock: Boolean):String {
        if (stock == true) {
            return """
                 --- Book Details ---
                   Name: $title 
                   Author: $author
                   Price: $price
                   Availability: In stock
                   
                   """

        } else {
            return """
                --- Book Details ---
                   Name: $title
                   Author: $author
                   Price: $price
                   Availability: Out of stock
                   """

        }
    }
}

fun main() {
    var b1 = Book("Game Of Thrones", "George Martin", 54.00, true)
    var b2 = Book("We Were Liars", "E. Lockhart", 30.00, false)
    println(b1.bookDetails(true))
    println(b2.bookDetails(false))
}