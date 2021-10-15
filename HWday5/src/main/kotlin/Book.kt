class Book (var title: String="", var author: String="", var price: Double=0.0, var status: String=""){

    fun inStoke(t: String, s: String): Boolean {
        var result = false
        if (title == t && status == s) {
            println("---- Book details ----")
            println("Name: $title")
            println("Author: $author")
            println("Price: $price")
            result = true

        } else if (title == t && status == s) {
            println("---- Book details ----")
            println("Name: $title")
            println("Author: $author")
            println("Price: $price")
            result = false
        }
        return result
    }
}