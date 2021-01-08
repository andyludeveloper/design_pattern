class PriceCalculator {
    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        return when (store) {
            "7-11" -> SevenEleven().price(unitPrice, amount)
            "carrefour" -> Carrefour().price(amount, unitPrice)
            "pchome" -> PcHome().price(unitPrice, amount)
            "watsons" -> Watsons().price(unitPrice, amount)
            else -> 0
        }
    }
}