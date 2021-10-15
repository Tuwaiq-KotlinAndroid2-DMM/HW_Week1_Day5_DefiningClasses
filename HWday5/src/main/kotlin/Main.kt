fun main() {
    // Part I
    var c = Car("Toyota", 2020)
    println(c.model + " " + c.year)

    //Part II
    var b = arrayOf<Book>(
        Book("Game of Thrones", "George Martin", 54.00, "In stock"),
        Book("Thrones", "George Martin", 54.00, "In stock"),
        Book("Les Miserables", "Vector Hugo", 46.00, "Out of stock")

    )
    println("Search for a book: ")
    var name = readLine().toString()

    for (i in b){
        if(i.inStoke(name,i.status)){
            println("Availability: ${i.status}")
        }
    }
}
