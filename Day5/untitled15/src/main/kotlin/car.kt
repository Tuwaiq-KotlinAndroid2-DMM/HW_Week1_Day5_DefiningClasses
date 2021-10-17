fun main() {
    val x=car()
    x.a()
}
class car {
    var M:String="BMW"
    var Y:Int=2019

    fun a(){
        println(M+Y)
    }
}
