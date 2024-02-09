fun main(args: Array<String>) {

    // 1. var & val
    // var : 변경 가능
    // val : 변경 불가

    var i: Int = 10
    val j: Int = 10

    i = 20
//   j = 20
    println(i)
    println(j)

    // 2. ? Int와 String에 ? 붙였을 때 null 허용

    var k: Int = 10
    var l: Int? = 10

    //k = null
    l = null

    println(k)
    println(l)

    var s: String = "ABC"
    var m: String? = "ABC"

    //s = null
    m = null

    println(s)
    println(m)



}