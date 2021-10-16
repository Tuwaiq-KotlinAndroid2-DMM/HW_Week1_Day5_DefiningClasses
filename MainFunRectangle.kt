fun main(){

    var r1  = Rectangle()
    print(" Please enter the length: ")
    r1.length = Integer.valueOf(readLine())
    print(" Please enter the width: ")
    r1.width = Integer.valueOf(readLine())
    println(" ------------------ ")

    println("Rectangle Perimeter: ${r1.getPer()}")
    println("Rectangle area: ${r1.getArea()}")
    println(r1.DrawStar())


}
