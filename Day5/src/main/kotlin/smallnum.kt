fun main() {

    println(SmallestNum(5,10,7))
}

fun SmallestNum(num1:Int,num2:Int,num3:Int) {
    when (true) {
        num1 <= num2 || num2 <= num3 -> println("$num1 is smallest number")
        num2 <= num1 || num2 <= num3 -> println("$num2 is smallest number")
        else -> println("$num3 is smallest number")
    }
}
