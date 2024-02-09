fun main(args: Array<String>) {

    val item = Item("BOOK", 10000)
    println("Item name is ${item.name}, price is ${item.price}")

    item.buy()
    item.sell()
}
class Item(
    val name: String,
    val price: Int
) : ItemTrade {
    override fun buy() {
        println("[buy] $name")
    }

    override fun sell() {
        println("[sell] $name")
    }
}
interface ItemTrade {
    fun buy()
    fun sell()
}

//enum class
enum class Color {
    RED,
    GREEEN,
    BLUE
}
