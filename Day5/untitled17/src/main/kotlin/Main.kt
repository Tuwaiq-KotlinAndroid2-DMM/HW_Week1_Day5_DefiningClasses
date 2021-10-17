fun main() {
    val x=book("Game of Thrones","George Martin",89.9)
    x.bookDetails()
}

class book constructor(val title: String, val author: String, val price: Double, val availablity: Boolean?=true){

    fun bookDetails(){
        println("--- Book Details ---")
        println("Name: "+title)
        println("Author: "+author)
        println("Price: $"+price)
        if(availablity==true)
            println("Availability: In stock")
        else
            println("Availability: Out of stock")
    }
}