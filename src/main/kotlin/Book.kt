class Book(var TheTitle: String, var AuthorName: String, var price: Double, var stock: Int) {


    fun B(): String {


        if (stock >= 1)

            return "In stock"
        else
            return  "Out of stock"


    }
}

fun main() {
    var a = arrayOf<Book>(
        Book("Game of Thrones", "George Martin ", 54.00, 30),
        Book("We Were Liars ", " E. Lockhart  ", 30.00, 0),

        )


    for (m in a) {
        println("--- Book Details ---")
        println("Name: " + m.TheTitle)
        println("Author: " + m.AuthorName)
        println("Price: " + m.price + " $")
        println("Availability: " + m.B())
    }
}
