import java.lang.IllegalArgumentException

class PriceCalculator {

    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        return getStore(store).price(unitPrice, amount)
    }

    private fun getStore(store: String) = when (store) {
        "7-11" -> SevenEleven()
        "carrefour" -> Carrefour()
        "pchome" -> PcHome()
        "watsons" -> Watsons()
        else -> throw IllegalArgumentException("Incorrect store name")
    }
}