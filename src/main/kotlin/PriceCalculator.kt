class PriceCalculator {
    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        return when (store) {
            "7-11" -> {
                getPrice(unitPrice, amount)
            }
            "carrefour" -> {
                if (amount <= 100) {
                    getPrice(unitPrice, amount) * 0.85
                } else {
                    getPrice(unitPrice * amount, 8)
                }
            }
            "pchome" -> {
                if (getPrice(unitPrice, amount) >= 1000) {
                    getPrice(unitPrice, amount) - 100
                } else {
                    getPrice(unitPrice, amount)
                }
            }

            "watsons" -> {
                if (getPrice(unitPrice, amount) * 0.88 >= 1000) {
                    getPrice(unitPrice, amount) * 0.88 * 0.8
                } else {
                    getPrice(unitPrice, amount) * 0.88
                }
            }
            else -> 0
        }
    }

    private fun getPrice(unitPrice: Int, amount: Int) = unitPrice * amount
}