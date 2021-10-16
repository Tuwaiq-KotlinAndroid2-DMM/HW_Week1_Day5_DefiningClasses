class Book(var title: String, var author: String, var price: Double){

    fun BookDetails(in_stock :Boolean) {

        var availabilty : String

        if (in_stock==true)
            availabilty="In Stock"
        else
            availabilty= "Out of Stock"

        println("---------"+"Book Details"+"----------")
        println("Name : "+ title)
        println("Author: "+author)
        println("Price : $"+ price)
        println("Availability: "+ availabilty)

    }
}

fun main() {
    val book1 = Book("Game of the Thrones", "Goerge Martin", 54.00)
    val book2 = Book("We were liarse", "Lockhart", 30.00)
    book1.BookDetails(true)
    book2.BookDetails(false)
}