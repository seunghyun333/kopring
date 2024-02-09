fun main(args: Array<String>) {

    // if문
    val priceA: Int = 100
    val priceB: Int = 200

    if (priceA >= priceB) {
        println("priceA= $priceA")
    } else {
        println("priceB = $priceB")
    }


    // null
    val price: Int? = null

    if(price == null) {
        println("null check true")
    } else {
        println("price = $price")
    }

    //in 체크
    val price1: Int = 100

    if(price1 in arrayOf(100, 200, 300)) {
        println("contain")
    } else {
        println("not contained")
    }


}