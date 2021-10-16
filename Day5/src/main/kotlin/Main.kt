fun main() {

    var num =7
    println(day(4))

    }
fun day(num: Int):String{
    var dayOfWeek = arrayOf("Sunday","Monday","Teusday","Wedensday","Thursday","Friday","Saturday")
    return dayOfWeek[num-1]
}