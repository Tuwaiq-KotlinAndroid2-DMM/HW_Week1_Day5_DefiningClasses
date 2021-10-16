import java.io.File

fun main() {

    var Car1 = Car("Toyot", 2020)

    println("")
    println("The model of car is : ${Car1.model} , year is : ${Car1.year} ")
    println("")

    println("")
    println("-----------------End Of HW1---------------------")
    println("")


    var Book1 = Book("12 Rules for LTife", "Jordan B.Peterson", 64.0, false)
    var Book2 = Book("Magic of Thinking Big", "David Schwartz", 69.0, true)
    var Book3 = Book("The Da Vinci Code", "Dan Brown", 53.0, false)
    var Book4 = Book("The Power of Habit", "Charles Duhigg", 71.0, false)

    println("--- Book Details ---")
    Book1.inStock(Book1.Availability)
    println("")
    println("")
    println("--- Book Details ---")
    Book2.inStock(Book2.Availability)
    println("")

    println("")
    println("-----------------End Of HW2---------------------")
    println("")


    print("Please enter length: ")
    var le = Integer.valueOf(readLine())

    print("Please enter width: ")
    var wi = Integer.valueOf(readLine())

    var calcul = Rectangle(le, wi)

    var r2 = calcul.getPer(le, wi)
    println("Rectangle perimeter is: $r2")

    var r1 = calcul.getArea(le, wi)
    println("Rectangle area is: $r1")

    var r3 = calcul.draw(le, wi)
    println(r3)

    println("")
    println("-----------------End Of HW3---------------------")
    println("")

    var f =File("HW.txt" )
    if( f.canRead() && f.canWrite()){
        println("You have permission to write and read")

    }
    else {
        println("You don't have permission to write and read")

    }

    println("")
    println("-----------------End Of HW4---------------------")
    println("")

    var fileExt = f.extension
    println("File extensions: $fileExt")

    println("")
    println("-----------------End Of HW5---------------------")
    println("")
}