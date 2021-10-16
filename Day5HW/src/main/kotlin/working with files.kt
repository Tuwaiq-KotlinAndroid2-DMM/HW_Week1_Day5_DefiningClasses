import java.io.File

fun main() {

    var f = File("FileName.txt")
    var ext =  f.extension
    f.createNewFile()
    if (ext == "txt") println( "files of kind $ext are ${f.nameWithoutExtension}")

    //check if can write and read

    if(f.canRead()) println("yes, can read") else println("sorry can't read")
    if(f.canWrite()) println("yes, can write") else println("sorry can't write")

    //copied the below argument from Google just to check how it works...

//    File("./").walk().forEach {
//        println(it.extension + " is the extension of " + it.name)
//    }

}