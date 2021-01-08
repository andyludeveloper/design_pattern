class PriceCalculator {
    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        return when (store) {
            "7-11" -> {
                unitPrice * amount
            }
            "carrefour" -> {
                if (amount <= 100) {
                    unitPrice * amount * 0.85
                } else {
                    unitPrice * amount * 8
                }
            }
            "pchome" -> {
                if (unitPrice * amount >= 1000) {
                    unitPrice * amount - 100
                } else {
                    unitPrice * amount
                }
            }

            "watsons" -> {
                if (unitPrice * amount * 0.88 >= 1000) {
                    unitPrice * amount * 0.88 * 0.8
                } else {
                    unitPrice * amount * 0.88
                }
            }
            else -> 0
        }
    }
}