class Carrefour : StoreStrategy {
    override fun price(unitPrice: Int, amount: Int) = if (amount <= 100) {
        unitPrice * amount * 0.85
    } else {
        unitPrice * amount * 0.8
    }
}