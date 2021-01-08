class PcHome {
    fun price(unitPrice: Int, amount: Int) = if (unitPrice * amount >= 1000) {
        unitPrice * amount - 100
    } else {
        unitPrice * amount
    }
}