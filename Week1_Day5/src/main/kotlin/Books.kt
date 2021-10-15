class Books(var Title:String,var Author:String,var Price:Double,var instock:Boolean) {
    fun bookDetail(boo: Array<Books>, name: String) {
        var av1 = ""

        for (b in boo) {
            if (b.Title.equals(name) && b.instock == true) {
                av1 = "In stock"
                println("--- Book Details ---")
                println("Name22: " + b.Title)
                println("Author: " + b.Author)
                println("Price: $" + b.Price)
                println("Availability: $av1")
                break

            } else if (b.Title.equals(name) && b.instock == false) {
                av1 = "Out stock"
                println("--- Book Details ---")
                println("Name11: "+b.Title)
                println("Author: " + b.Author)
                println("Price: $" + b.Price)
                println("Availability: $av1")
                break
            }
        }
    }
}



fun main() {
    var book= arrayOf<Books>(
        Books("Game of Thrones","George Martin",54.0,true),
        Books("We Were Liars","E. Lockhart",30.0,false)
    )
    println("Please Enter Book Title: ")
    var t= readLine()
    var b=Books(t.toString(),"",0.0,false)
    b.bookDetail(book,t.toString())
}