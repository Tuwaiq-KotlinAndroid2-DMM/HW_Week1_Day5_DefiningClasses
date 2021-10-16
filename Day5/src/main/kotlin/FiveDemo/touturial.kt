package FiveDemo

import java.io.File

fun main() {

    var f=File("myfile.txt")
    f.writeText("Hello World")
}