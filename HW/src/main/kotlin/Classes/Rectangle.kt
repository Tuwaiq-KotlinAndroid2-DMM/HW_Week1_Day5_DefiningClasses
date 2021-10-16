package Classes

class Rectangle(var length: Int, var width: Int) {
    //    perimeter of the rectangle
    fun getPer(): Int {
        return 2 * (length + width)
    }

    //     the area of the rectangle
    fun getArea(): Int {
        return length * width
    }

    //    draws rectangle by stars
    fun draw() {
        for (i in 1..length) {
            print('*')
            for (i in 1..width - 1) {
                print('*')
            }
            println("")
        }
    }
}