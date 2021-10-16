
class Book(var BookTitle:String, var AuthorsName:String, var BookPrice:Double, var Availability: String){


    fun BoookDetails():Boolean {
        if(Availability == "In stock")
            return true
        else
            return false
    }



}