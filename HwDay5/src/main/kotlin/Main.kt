fun main() {
    var car1 = Car(
        model = "Toyota",
        year = 2022,
    )
    println(car1.model + " " + car1.year)

    var book1 = arrayOf<Book>(
        Book("Game of Thrones","G.R.R Martin",54.00),
        Book("We Were Liars", "E. Lockhart", 30.00)
    )

    book1[0].bookDetails(true)
    book1[1].bookDetails(false)
}
