import java.io.File

fun main(){
    var HWFile = File("MyHomeWorkFile.txt")
    var FileExtension = HWFile.extension

    println("The extension File is: $FileExtension")

    if(HWFile.canRead() && HWFile.canWrite()){
        println("The file had the permission to be read wnd write ")

    }else{
        println("The file had no permission to be read wnd write ")

    }
}
