class PriceCalculator {

    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        val storeStrategy: StoreStrategy

        return when (store) {
            "7-11" -> {
                storeStrategy = SevenEleven()
                storeStrategy.price(unitPrice, amount)
            }
            "carrefour" -> {
                storeStrategy = Carrefour()
                storeStrategy.price(unitPrice, amount)
            }
            "pchome" -> {
                storeStrategy  = PcHome()
                storeStrategy.price(unitPrice, amount)
            }
            "watsons" -> {
                storeStrategy = Watsons()
                storeStrategy.price(unitPrice, amount)
            }
            else -> 0
        }
    }
}