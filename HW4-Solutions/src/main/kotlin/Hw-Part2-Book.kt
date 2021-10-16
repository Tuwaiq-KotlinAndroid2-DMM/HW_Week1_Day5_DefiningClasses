class Book(var title: String, var author: String, var price: Double){

    fun bookDetails(inStock: Boolean){

        println("--- Book Details ---")
        println("Name:"+" "+ title)
        println("Author:"+" "+author)
        println("Price:"+" "+"$"+price)
        print("Availability:"+" ");if(inStock == true)println("In Stock")else println("Out of Stock ")
        println("  ")

    }
}

fun main (){

    var book1 = Book("Game of Thrones", "George Martin", 54.00)
    var book2 = Book("We Were Liars", "E. Lockhart", 30.00)

    book1.bookDetails(true)
    book2.bookDetails(false)

}
/*
if ( inStock == true) {
print("In Stock")}
else {
print("Out of Stock ")

}

val BookStore = arrayOf("Game of Thrones )
for (e in BookStore){

if (e =="Game of Thrones "){

println("In Stock")

}else {println("Out of Stock")}

}
*/