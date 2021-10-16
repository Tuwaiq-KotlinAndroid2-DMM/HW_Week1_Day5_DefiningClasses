class Book(var Title: String, var Author: String, var Price: Double, var Availability: Boolean) {
    //var Stock = arrayOf(1,4,1,5)

    fun inStock(Ava: Boolean) {
        if (Ava == true)
            println("Name: " + Title + "\nName: " + Author + "\nPrice: " + Price + "\nAvailability: In Stock")
        else
            println("Name: " + Title + "\nName: " + Author + "\nPrice: " + Price + " SR" + "\nAvailability: Out of stock")
    }

}


/*
fun inStock(Ava:Boolean){

    if (Ava == true){
        println("in Stock")
    }
    else
        println("Out of stock")
    /* var n1 ="12 Rules for Life"
     //var n2 ="Magic of Thinking Big"
   //  var n3 ="The Da Vinci Code"
   //  var n4 ="The Power of Habit"
     var res =""

     if (name.contentEquals(n1)) {

         if (Stock[0] ==0)
            res ="Out of stock"
         else
             res="In stock"
         Stock[0]-1
                   }
  //   else if (name == n2)
     return res
*/