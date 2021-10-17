class Book (var title:String , var author:String , var price:Double , var Availability:String ){
     fun bookDetails():Boolean {
          if (Availability=="In stock")
              return true
             else return false


     }

}

