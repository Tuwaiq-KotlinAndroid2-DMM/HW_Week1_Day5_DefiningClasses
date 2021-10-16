fun main() {

var car1=car("Toyota" ,2000)
var car2=car("GMC" ,2021)
println("this car is model "+car1.model+" year "+car1.year)
var book1=book("Game of Thrones","George Martin",54.00,true)
var book2=book("We Were Liars","E. Lockhart",30.00,false)
   println(book1.bookDetails(false))

    var rectangle1=Rectangle(0,0)
    print("Please enter length:")
    rectangle1.length=Integer.valueOf(readLine())
     print("Please enter width:")
    rectangle1.width=Integer.valueOf(readLine())

    println("-------------")
    println("Rectangle perimeter is ${rectangle1.getPer()}")
    println("Rectangle area is ${rectangle1.getArea()}")
    println("")
    println(rectangle1.draw(rectangle1.length,rectangle1.width))
}