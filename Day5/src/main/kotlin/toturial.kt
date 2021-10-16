import java.awt.Dimension
import java.time.LocalDateTime
import java.time.LocalTime
import javax.swing.JFrame

fun main() {

    var d=LocalDateTime.now()

    println(""+d.hour +":"+d.minute +":"+d.second)

    /*var T=LocalTime.now()
    println(T)*/ //ممكن استخدم هذي الميثد بس مشكلتها تطلع جزء من الثانيه
     var f=JFrame()
    f.size = Dimension(500 , 500)
    f.setLocation(300 , 500)
    f.show()

}
