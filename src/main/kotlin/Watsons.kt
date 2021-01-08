class Watsons {
    fun price(unitPrice: Int, amount: Int) = if (unitPrice * amount * 0.88 >= 1000) {
        unitPrice * amount * 0.88 * 0.8
    } else {
        unitPrice * amount * 0.88
    }
}