package FileDemo
import java.io.File
import java.nio.file.Files

fun main() {
    var folder = createFolder()
    var extension = "pdf" //"doc" or "txt"
    var files = getByExtension(extension,folder)
    for (file in files){
        println(file.path)
    }
}

fun getByExtension(extension: String, folder: File): List<File>{
    var listOfFileByExtension = mutableListOf<File>()
    folder.walk().forEach { file ->
        if (file.extension == extension){
            listOfFileByExtension.add(file)
        }
    }
    return listOfFileByExtension
}

fun createFilesAndFolders(){
    var newFolder = createFolder()
    var newFile = createFile("textFile5.pdf",newFolder)
}

fun createFile(fileName: String, folder: File): File{
    var file = File(folder,fileName)
    file.writeText("Text within this file to test")
    return file
}

fun createFolder(): File{
    var folder = File("textFiles2")
    Files.createDirectories(folder.toPath())
    return folder
}