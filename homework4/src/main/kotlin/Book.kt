class Book(var title: String, var author: String, var price: Double, var availability:Boolean) {


    fun bookDetails(): Boolean {
        if (availability == true) {
            return availability
        }else return false

    }
}