const val ITEM_PRICE = 200

fun main() {
    var discountStart = 1_000
    var itemCount = 7
    var discount = 100
    val meloman: Boolean = true
    var totalPrice = itemCount * ITEM_PRICE
    println("Сумма: $totalPrice")
    if(totalPrice > discountStart)
        totalPrice -= discount
    println("Сумма с учетом скидки: $totalPrice")
    println("-------------------------------")

    discountStart = 10_000
    itemCount = 51
    totalPrice = itemCount * ITEM_PRICE
    println("Сумма: $totalPrice")
    if(totalPrice > discountStart)
        discount = totalPrice/100 * 5
    totalPrice -=  discount
    println("Сумма с учетом скидки: $totalPrice")
    if(meloman){
        totalPrice -= totalPrice / 100
        println("Сумма со скидкой постоянного покупателя: $totalPrice")
    }
}