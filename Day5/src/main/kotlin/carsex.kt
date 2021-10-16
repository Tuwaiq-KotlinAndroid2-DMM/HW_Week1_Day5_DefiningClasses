fun main() {
/*    var c1=cars()
    c1.brand="BMW"
    c1.model="x6"
    c1.year=2020
    c1.pricce=240000

    var c2=cars()
    c1.brand="marcedes"
    c1.model="Gle coupe"
    c1.year=2020
    c1.pricce=260000*/


    /*if (c1.price>c2.price){
        println(c1.brand + " "+c1.model )
        else
            println(c2.price)
    }*/

    var a= arrayOf<cars>(
        cars("Mercedes","GLE Coupe",2020,260000),
        cars("BMW","X6",2020,240000),
        cars("Toyota","Camry",2020,200000),
        cars("Mazda","6",2018,120000),
        cars("Mazda","CX",2019,180000),
        cars("Tesla","Model S",2020,300000),
        cars("Pourche","Carera",2020,450000),
        cars("Masarati","M1",2020,500000),
        cars("Hyundai","GLS",2020,110000),


    )

    var mosExp=getMostexpcars(a)


    println(mosExp.brand+" "+ mosExp.model+" "+mosExp.year+" "+mosExp.pricce)

    for (c in a){
        if(c.IsNew()){
            println(c.brand+" "+c.model)
        }
    }


    for (c in a){
        if(c.mp()){
            println(c.brand+" "+c.pricce)
        }
    }


}
fun getMostexpcars(a:Array<cars>):cars{

    var max = a[0]

    for (c in a){
        if(c.pricce > max.pricce)
            max=c
    }
    return max
}
