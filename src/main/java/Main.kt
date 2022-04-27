const val ITEM_PRICE = 200
var itemCount = 1
var discount = 100
const val MELOMAN: Boolean = false

const val ITEM_PRICE2 = 200
var itemCount2 = 4
const val MELOMAN2: Boolean = true

val itemPrice3 = 200
var itemCount3 = 100
const val MELOMAN3: Boolean = true


fun main() {
    discount(ITEM_PRICE, itemCount, MELOMAN)
    println("------------------------")
    discount(ITEM_PRICE2, itemCount2, MELOMAN2)
    println("------------------------")
    discount(itemPrice3, itemCount3, MELOMAN3)
}

fun discount(itemPrice: Int, itemCount: Int, meloman: Boolean) {
    var totalPrice = itemCount * itemPrice
    println("Сумма: $totalPrice")
    if (totalPrice in 1001..10000) {
        totalPrice -= discount
        println("Сумма с учетом скидки: $totalPrice")
    } else if (totalPrice > 10000) {
        discount = totalPrice / 100 * 5
        totalPrice -= discount
        println("Сумма с учетом скидки: $totalPrice")
    }
    if (meloman) {
        totalPrice -= totalPrice / 100
        println("Сумма со скидкой постоянного покупателя: $totalPrice")
    }
}
