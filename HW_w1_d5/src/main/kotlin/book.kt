class book(var title:String,var author:String,var price :Double,var stock:Boolean) {
    fun bookDetails( stock:Boolean ):String{

        if (stock==true){

return """
          --- Book Details ---
         Name   :$title   
         Author : $author
         Price  : $price$
        Availability: In stock"""
        }
        else{

           return """
          --- Book Details ---
         Name  :$title   
         Author: $author
         Price : $price$
        Availability: Out of stock"""

        }
    }
}