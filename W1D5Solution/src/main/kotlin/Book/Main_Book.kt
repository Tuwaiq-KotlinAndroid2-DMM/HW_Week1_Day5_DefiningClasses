package Book

fun main() {
    var books = listOf<Book>(
        Book("Game of Thrones", "George Martin", 54.00, true),
        Book("We Were Liars", "E. Lockhart", 30.00, false),
        Book("Luj", "Osamah",20.00, true)
    )

    print("Enter the book title: ")
    var userInput = readLine().toString()

    for (b in books) {
        b.bookDetails(books, userInput.trim())
        break
    }



}