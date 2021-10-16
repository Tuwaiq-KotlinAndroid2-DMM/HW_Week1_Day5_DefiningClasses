class Rectangle(var length: Int, var width: Int) {
    fun getPer():Int {
var result=0
        result=2*(length+width)
     return   result
    }

    fun getArea():Int {
        var result=0
        result=length*width
return result
    }

    fun draw(length:Int,width: Int): String {
        var result = ""
        for (w in 1..width) {
            for (h in 1..length) {
                result += "*"
            }
            result += "\n"
        }
        return result
    }

    }
