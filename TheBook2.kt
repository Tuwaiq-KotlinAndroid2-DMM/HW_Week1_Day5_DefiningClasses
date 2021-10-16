
class Book(var title: String, var author:String, var price: Double, var availability:Boolean) {



fun Thebook (instock : Boolean){
    println("--- Book Detaile ---")
    println("Name: "+""+ title)
    println("authar: "+""+ authar)
    println("price:"+""+ price)


    if (instock == true) {
        println("availability : inStock")
    }

    else{

        println("availability : out of Stock")



    }







}
