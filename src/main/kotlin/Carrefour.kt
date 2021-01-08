class Carrefour {
    fun price(amount: Int, unitPrice: Int) = if (amount <= 100) {
        unitPrice * amount * 0.85
    } else {
        unitPrice * amount * 0.8
    }
}