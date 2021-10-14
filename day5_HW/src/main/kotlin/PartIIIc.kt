
import java.io.File
import java.nio.file.Files

fun main() {
    File("textFiles2/").walkTopDown().forEach { file ->
        println("The ${file.path}${ getFilePermission(file) }")

    }
}

fun getFilePermission(file: File): String{
    var writable = if (file.canWrite()) "is writable" else "is not writable"
    var readable = if (file.canRead()) "is readable" else "is not readable"

    return " $writable and $readable"
}