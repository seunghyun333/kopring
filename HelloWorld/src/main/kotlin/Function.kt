fun main(args: Array<String>) {

    //함수
/*    fun 함수명(매개변수: 타입): 반환타입 {
        //본문
        return 반환값
    }*/

    val price1: Int = 100
    val price2: Int = 200

    val price3 = sumPrice(price1, price2)
    println("price3= $price3")

}

fun sumPrice(price1: Int, price2: Int): Int {
    val price = price1 + price2
    return price
}

/*
* fun sumPrice(price1: Int, price2: Int): Int = price1 + price2
* */