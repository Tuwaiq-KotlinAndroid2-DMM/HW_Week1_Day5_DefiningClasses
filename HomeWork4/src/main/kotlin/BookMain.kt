fun main(){
    var book1=Book("Game of Thrones","George Martin",54.00,"In stock")
    var book2=Book("We Were Liars","E. Lockhart",30.00,"Out of stock")

   println("--- Book Details ---")
   println(" Name: ${book1.title}\n Author: ${book1.author}\n  Price: ${book1.price}\n Availability: ${book1.Availability}")
   println("--- Book Details ---")
   println(" Name: ${book2.title}\n Author: ${book2.author}\n  Price: ${book2.price}\n Availability: ${book2.Availability}")
    println("--- In stock Or  Out of stock ---")
    println(book1.bookDetails())
    println(book2.bookDetails())







}
////--- Book Details ---
////Name: Game of Thrones
////Author: George Martin
////Price: $54.00
////Availability: In stock
////
////--- Book Details ---
////Name: We Were Liars
////Author: E. Lockhart
////Price: $30.00
////Availability: Out of stock