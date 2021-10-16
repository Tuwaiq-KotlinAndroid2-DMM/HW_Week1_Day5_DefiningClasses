fun main(){
    var b1  = Book("Game of Thrones","George Martin",54.00,"In stock")
    var b2  = Book("We Were Liars","E. Lockhart",30.00, "Out of stock")

    println(" --- Book Detalis ---")
    println(" Name: ${b1.BookTitle} \n Authors: ${b1.AuthorsName} \n Price: ${b1.BookPrice} \n Availability: ${b1.Availability}")
    println(" In Stock: ${b1.BoookDetails()}")

    println(" --- Book Detalis ---")
    println(" Name: ${b2.BookTitle} \n Authors: ${b2.AuthorsName} \n Price: ${b2.BookPrice} \n Availability: ${b2.Availability}")
    println(" In Stock: ${b2.BoookDetails()}")

}
