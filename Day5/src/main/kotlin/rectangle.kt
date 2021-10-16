fun main() {
    println("Enter width :")
    var num1 = Integer.valueOf(readLine())
    println("Enter length :")
    var num2 =Integer.valueOf(readLine())
    println(draw(num1 ,num2))
}

fun draw(num1:Int,num2:Int) {

    for (i in 1..num2) {
        print("*")
        for (i in 1..num1 - 1)
            print("*")
        println(" ")
    }
}