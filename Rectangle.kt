class Rectangle() {

    var length: Int = 0
    var width: Int = 0

    fun getPer():Int {
        var perimeter = (length + width ) * 2
        return perimeter
    }

    fun getArea():Int {
        var Area = length * width
        return Area
    }

    fun DrawStar():String {
        var Star = ""
        for (w in 1..width){
            for(l in 1..length){
                Star += " *"
            }
            Star += "\n"
        }
        return Star
    }

}
