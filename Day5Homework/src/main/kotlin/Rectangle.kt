class Rectangle(var Length:Int, var Width:Int) {

    fun getPer() {

        var p = (Length + Width) * 2
        println(p)


    }

    fun getArea() {

        var p = Length * Width
        println(p)
    }

    fun draw() {
        for (i in 1..Length) {
            print("*")

            for (i in 1..Width - 1)
                print("*")

            println("")
        }
    }
}