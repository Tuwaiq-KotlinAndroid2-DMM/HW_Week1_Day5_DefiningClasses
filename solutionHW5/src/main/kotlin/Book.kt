class Book (var title: String , var author: String ,var price: Double , var availability: Boolean){

fun bookdetails(inStock : Boolean) {
    println("--Book Details--")
    println("Name: "+" "+title)
    println("Author: "+" "+author)
    println("price: "+" "+price)

     if (inStock == true) {
         println("Availability :In Stock")
     }else
         print("Availability :Out Of Stock")
    println(" ")
 }
}



