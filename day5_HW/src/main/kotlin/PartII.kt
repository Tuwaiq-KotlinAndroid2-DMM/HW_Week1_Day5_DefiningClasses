fun main() {
    var got = Book("Game of Thrones", "George Martin",54.00,5)
    var wwl = Book("We Were Liars", "E. Lockhart",30.00,0)

    var arrOfBook = arrayOf(got,wwl)
    getStock(arrOfBook)
}

fun getStock(booksArr: Array<Book>){
    for (book in booksArr){
        println(book.bookDetails(book.inAvailabile()))
    }
}

class Book (var title: String, var auther: String, var price: Double, var stock: Int){
    fun inAvailabile(): Boolean{
        return (stock > 0)
    }

    fun bookDetails(inStock: Boolean): String{
        return """
            --- Book Details ---
            Name: $title
            Author: $auther
            Price: ${'$'}$price
            Availability: ${if (inStock) "In stock" else "Out of stock"}
        """
    }
}
