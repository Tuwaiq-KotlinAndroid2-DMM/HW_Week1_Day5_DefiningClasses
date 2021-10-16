class cars (var brand:String,var model:String,var year:Int ,var pricce:Int) {

    fun IsNew(): Boolean {
        return year == 2021//هذي الجمله اختصار if الي تحت
    }

    /* if (year == 2021)
            return true
        else
            return false
        */
    fun mp(): Boolean {
        return pricce >= 220000
    }
}


    /*var brand:String=""
    var model:String=""
    var year:Int=0
    var price:Int=0
*/

