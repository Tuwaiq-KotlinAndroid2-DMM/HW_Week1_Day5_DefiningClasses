class Rectangle(var length:Int , var width:Int){

    fun getPer(length:Int , width: Int):Int{

        return 2*(length+width)
    }
    fun getArea(length:Int , width: Int):Int{

        return length*width
    }

    fun draw(length:Int , width: Int){

        for (i in 1..length) {
            print("*"+" ")
            for (i in 1..width-1)
                print("*"+" ")
            println("")
        }
    }
}




fun main() {

    var r = Rectangle(0,0)

    print("Please enter length:")
    var l = Integer.valueOf(readLine())
    print("Please enter width:")
    var w = Integer.valueOf(readLine())

    println("------------------")
    println("Rectangle perimeter is"+" "+r.getPer(l,w))
    println("Rectangle area is"+" "+r.getArea(l,w))
    println(" ")
    var d = r.draw(l,w)


}