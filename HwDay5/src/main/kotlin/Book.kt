class Book(var title: String, var author: String, var price: Double) {

    fun bookDetails(inStock: Boolean) {
        if (inStock)
            println("Book Details \nName :$title \nAuthor: $author \nPrice: $price \nAvailability : In stock")
        else
            println("Book Details \nName :$title \nAuthor: $author \nPrice: $price \nAvailability : Out stock")
    }
}




