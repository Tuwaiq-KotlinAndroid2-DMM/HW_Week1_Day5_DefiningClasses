class book (var title : String , var author : String , var price :Double, var Availability : Boolean){

    fun stock() : String{

        if (Availability == true)

           return "IN stock"
        else
            return " out of stock"
    }


    }

fun main(){


    var a = arrayOf <book>(
        book("Game of Thrones", "George Martin" , 54.00 , true),
        book("We Were Liars", "E. Lockhart",30.00 , false)



    )
            for (books in a ) {
                println("--- Book Details ---")
                println("Name: " + books.title)
                println("Author: "+ books.author)
                println("Price: $" + books.price)
                println("Availability: "+ books.stock())

            }




}

