class Rectangle(var length: Int, var width: Int) {
    fun getPer(): Int {
        var result = 0
        result = 2 * (length + width)
        return result
    }

    fun getArea(): Int {
        var result = 0
        result = length * width
        return result
    }

    fun draw(length:Int, width:Int): String {
        var result = ""
        for(w in 1..width){
            for(w in 1..length){
                result+="* "
            }
            result+="\n"
        }
        return result

    }
}

fun main() {
    var rec = Rectangle(6, 6)
    print("Please enter length: ")
    rec.length = Integer.valueOf(readLine())
    println("\nPlease enter width: ")
    rec.width = Integer.valueOf(readLine())
    println("---------------")
    println("Rectangle perimeter is ${rec.getPer()}")
    println("Rectangle area is ${rec.getArea()}")
    println("")
    println(rec.draw(rec.length, rec.width))
}