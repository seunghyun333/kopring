fun main(args: Array<String>) {

    val price: Int = 100

    when(price){
        100 -> println("1. price = $price")
        200 -> println("2. price = $price")
        300 -> println("3. price = $price")
        else -> println("4. Not")
    }

    // 범위 비교
    val price1: Int = 250

    when{
        price1 in 100..199 -> println("1. price1 = $price1")
        price1 in 200..299 -> println("2. price1 = $price1")
        price1 in 300..399 -> println("3. price1 = $price1")
        else -> println("4. Not in")
    }

}