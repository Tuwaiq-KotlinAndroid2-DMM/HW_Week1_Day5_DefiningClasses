fun main(args: Array<String>) {
//  Part I - Practice with Class Defining.
    var car1 = Classes.Car("Toyota", 2020)
    println(car1.model + " Corolla " + car1.year)

//  Part II - Practice with Instance Constrcuting and Class Functions.
    var book1 = Classes.Book("Game of Thrones", "George Martin", 54.00, true)
    var book2 = Classes.Book("We Were Liars", "E. Lockhart", 30.00, false)
    book1.bookDetails()
    book2.bookDetails()

//  Part III - (Optional) Classes Challenge
//    a. Write a class named 'Rectangle' with following features.
    print("Please enter length:")
    var length = Integer.valueOf(readLine())
    print("Please enter width:")
    var width = Integer.valueOf(readLine())
    println("---------------")
    var rectangle = Classes.Rectangle(length, width)
    println("Rectangle perimeter is " + rectangle.getPer())
    println("Rectangle perimeter is " + rectangle.getArea() + "\n")
    rectangle.draw()
}

