fun main(){


var c1 = car ("MG" , 2021)
var c2 = car ("BMW" , 2020)
var c3 = car ("toyota" , 2020)

var result = (" " + c1.model +" "+ c1.year+" , " + c2.model  +" "+ c2.year+"")

    var a = arrayOf<car> (
        car("Tesla" , 2020),
        car("mg", 2021),
        car("BMW",2020),
        car("toyota", 2020),
        car("Lexus",2021),
    )

for (i in a)
print(i.model + " , " +i.year +"\n" )


    println(result)

}

class car ( var model: String , var year : Int )