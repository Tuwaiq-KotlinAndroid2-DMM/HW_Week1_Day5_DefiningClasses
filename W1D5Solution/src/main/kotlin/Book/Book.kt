package Book

class Book(var title: String, var author: String, var price: Double, var inStock: Boolean) {

    fun bookDetails(books: List<Book>, name: String) {
        var stockity = "Out of stock"
        for (b in books) {
            if (b.title.equals(name, true) && b.inStock == true) {
                stockity = "In stock"
                println("--- Book Details ---")
                print("Name: ${b.title}\nAuthor: ${b.author}\nPrice: $${b.price}\nAvailability: $stockity")
                break
            } else if (b.title.equals(name, true) && b.inStock == false) {
                stockity = "Out of stock"
                println("--- Book Details ---")
                print("Name: ${b.title}\nAuthor: ${b.author}\nPrice: $${b.price}\nAvailability: $stockity")
                break
            }
        }
    }
}