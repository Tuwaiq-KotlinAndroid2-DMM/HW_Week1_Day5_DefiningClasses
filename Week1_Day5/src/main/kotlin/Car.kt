class Car(var Model:String , var Year: Int ) {

}

fun main(args: Array<String>) {
    var c1=Car("Toyota",2020)
    println(c1.Model +": " + c1.Year)
}