fun main() {

    var student1=student(123,"mohammed",21,4.2)
    var student2=student(456,"Ahmed",21,4.5)


    if (student1.GPA < student2.GPA){
        println(student2.name)
    }
    else
        println(student1.name)

}
