class SevenEleven :StoreStrategy{
    override fun price(unitPrice: Int, amount: Int) = unitPrice * amount
}