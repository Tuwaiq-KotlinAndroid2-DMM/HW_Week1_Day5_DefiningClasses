 fun main(){
     var book1 = Book ("Game of Thrones","George Martin",54.00 ,  " In stock")

     var book2 =Book("We were Liars","E.Lockhart",30.00 ,"Out of stock" )

        println("--Book Details-- ")
        println("Name: ${book1.title}\n Author: ${book1.author}\n price: ${book1.price}\n Availability: ${book1.Availability} \n ${book1.bookDetails()} "  )
        println("---Book Details---")
        println("Name: ${book2.title}\n Author: ${book2.author}\n price: ${book2.price}\n Availability: ${book2.Availability}\n ${book2.bookDetails()}")




 }