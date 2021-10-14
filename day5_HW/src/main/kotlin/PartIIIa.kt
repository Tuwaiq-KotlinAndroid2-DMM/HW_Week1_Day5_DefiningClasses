fun main() {
    println("Please enter length:")
    var length = Integer.valueOf(readLine())
    println("Please enter width:")
    var width = Integer.valueOf(readLine())
    getRectInfo(length,width)
}

fun getRectInfo(rectLength: Int, rectWidth: Int){
    var rect = Rectangle(rectLength,rectWidth)
    println("Rectangle perimeter is ${rect.getPer()}")
    println("Rectangle area is ${rect.getArea()}")
    rect.draw()
}

class Rectangle (var length: Int, var width: Int){

    fun getPer(): Int{
        return 2*(length+width)
    }
    fun getArea(): Int{
        return length*width
    }
    fun draw(){
        for (x in 1..length){
            for (y in 1..width){
                print("* ")
            }
            println()
        }
    }


}
