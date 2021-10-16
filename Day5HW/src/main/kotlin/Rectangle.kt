class Rectangle(var length: Int, var width: Int) {

    fun getPer(num1: Int, num2: Int): Int {

        var resPer = (num1 * 2) + (num2 * 2)
        return resPer
    }

    fun getArea(num1: Int, num2: Int): Int {
        var resAr = num1 * num2
        return resAr

    }

    fun draw(num1: Int,num2: Int) :String{
        var Rect =""
        for ( i in 1..num1){

            for (i in 1..num2)
                print(" * ")
            println("")
        }
        return Rect
    }

}