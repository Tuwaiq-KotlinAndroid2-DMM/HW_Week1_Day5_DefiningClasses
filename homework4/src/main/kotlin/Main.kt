fun main() {

    // part 1
    var c =car("Toyota",2020)

    println(c.model +","+c.year)

    // part 2

    
    var b1= Book("Game of Thrones", "George Martin", 54.00,true)
    var b2= Book("We Were Liars","E. Lockhart",30.00,false)

    println("--- Book Details ---,${b1.title}, ${b1.author},${b1.price}, ${b1.availability} ")
    println("--- Book Details ---,${b2.title}, ${b2.author},${b2.price}, ${b2.availability} ")


//    var books = arrayOf<Book>(
//        Book("Game of Thrones", "George Martin", 54.00,true),
//        Book("We Were Liars","E. Lockhart",30.00,false)
//    )

//    for (b in books){
//        if (b.bookDetails()){
//            println("--- Book Details ---")
//            println("Title: ${b.title}")
//            println("Author: ${b.author}")
//            println("Price; ${b.price}")
//            println("Availability: ${b.availability}")
//        }
//    }

}