class Book(var title: String, var author:String, var price: Double, var availability:Boolean) {



    fun isStock():String{

       if (availability== true)
           return "in stock"
        else
            return "out of stock"





    }
}