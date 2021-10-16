fun main() {

//    Assign the values "Toyota" and "2020" to model and year variables respectively
    var myCar = Car()
    myCar.year = 2020
    myCar.model = "Toyota"

    println(myCar.model + " " + myCar.year)

    // book class

    var gotBook = Book("Game of Thrones", "George Martin", 54.00 , true)
    var weWereLiarsBook = Book("We Were Liars", "E. Lockhart", 30.00, false)

    gotBook.bookDetails()
    weWereLiarsBook.bookDetails()

    // optional class rectangle
    print("Enter height: ")
    val height = Integer.valueOf(readLine())

    print("Enter width: ")
    val width = Integer.valueOf(readLine())
    var rec1 = Rectangle( height, width)
    println("rectangle perimeter: ${rec1.getPer()}")
   println( "rectangle area: ${rec1.getArea()}")
    println(rec1.draw())
}

//
//    Write a class named 'Car' with following features:
//    Instance variables :
//
//    model for the car model of type String.
//    year for the car year of type int.

class Car() {
    var model: String = ""
    var year: Int = 0


}

//Write a class named Book using primary constructor with following features:
//title for the title of book of type String.
//author for the author’s name of type String.
//price for the book price of type double.

class Book (var title: String, var author: String, var price: Double, var inStock: Boolean) {

    fun bookDetails() {
        val rounded = String.format("%.2f", price).toInt()
        if (inStock) {
            println("""
                Name: $title 
                Author: $author
                Price: $$rounded
                Availability: In stock
            
            """.trimIndent())
        } else {
            println(
                """
                Name: $title 
                Author: $author
                Price: $$rounded
                Availability: Out of stock
            
            """.trimIndent()
            )
        }
    }
}


//  Part III - (Optional) Classes Challenge.

//a. Write a class named 'Rectangle' with following features.
//Instance variables :
//
//length for the length of rectangle of type int.
//width for the width of rectangle of type int.
//Instance functions:
//
//'getPer()' which return the perimeter of the rectangle.
//'getArea()' which return the area of the rectangle.
//'draw()' which draws rectangle by stars.
//How it work:
//
//Ask user to input length and width for a rectangle.
//Print the result.

class Rectangle (var length: Int , var width:Int){

    fun getPer (): Int {

        return (length + width ) * 2
    }
    fun getArea (): Int {

        return length * width
    }

    fun draw (): String {
        var art = ""
        for (l in 1 .. length){
            art += "\n"
            for (w in 1 .. width){
                art += "* "
            }
        }
        return art
    }

}