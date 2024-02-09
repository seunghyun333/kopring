fun main(args: Array<String>) {

    val item = Item("BOOK", 10000)
    println("Item name is ${item.name}, price is ${item.price}")
}

//생성자
class Item (
    val name: String,
    val price: Int
)

//enum class
enum class Color {
    RED,
    GREEEN,
    BLUE
}
