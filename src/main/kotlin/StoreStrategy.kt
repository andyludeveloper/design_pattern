interface StoreStrategy {
    fun price(unitPrice: Int, amount: Int): Number
}