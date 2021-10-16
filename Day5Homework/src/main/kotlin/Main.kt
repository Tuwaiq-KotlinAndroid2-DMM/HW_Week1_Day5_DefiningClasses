fun main(args: Array<String>) {

    // Solution 1
 /*   var car = Car(model = "Toyota", year = 2020)

    println("The car model is: ${car.model}")
    println("The car Year is: ${car.year}")


    // Solution2

    var book = arrayOf<Book>(
        Book(title = "Game of Thrones ",author = "George Martin",price = 54.00,availability = true),
        Book(title = " Beauty of everything ",author = "philips E",price = 40.00, availability = false),
        Book(title = "We Were Liars ",author = "E. Lockhart",price = 30.00,availability = true)
    )


        for (b in book){

            println("--Book Details--")
            println("Name: "+b.title )
            println("Author: "+ b.author)
            println("Price: "+ "$"+b.price )
            println("Availability: "+ b.isStock())
            println(" ")


        }

  */



   // Challenge Solution

    println("Please enter the lenght")
    var length = Integer.valueOf(readLine())
    println("Please enter the width")
    var width = Integer.valueOf(readLine())

var result = Rectangle(length,width)
    print("perimeter of the rectangle: ")
    println(result.getPer())
    println(" ")


    print("The Area is: ")
    println(result.getArea())
    println(" ")

    println(result.draw())



}