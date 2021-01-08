class PriceCalculator {
    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        return when (store) {
            "7-11" -> getPriceBy711(unitPrice, amount)
            "carrefour" -> getPriceByCarrefour(amount, unitPrice)
            "pchome" -> getPriceByPchome(unitPrice, amount)
            "watsons" -> getPriceByWatsons(unitPrice, amount)
            else -> 0
        }
    }

    private fun getPriceByWatsons(unitPrice: Int, amount: Int) = if (unitPrice * amount * 0.88 >= 1000) {
        unitPrice * amount * 0.88 * 0.8
    } else {
        unitPrice * amount * 0.88
    }

    private fun getPriceByPchome(unitPrice: Int, amount: Int) = if (unitPrice * amount >= 1000) {
        unitPrice * amount - 100
    } else {
        unitPrice * amount
    }

    private fun getPriceByCarrefour(amount: Int, unitPrice: Int) = if (amount <= 100) {
        unitPrice * amount * 0.85
    } else {
        unitPrice * amount * 0.8
    }

    private fun getPriceBy711(unitPrice: Int, amount: Int) = unitPrice * amount

}