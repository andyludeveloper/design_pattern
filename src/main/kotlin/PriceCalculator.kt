class PriceCalculator {
    fun calculatePrice(store: String, unitPrice: Int, amount: Int): Number {
        return when(store){
            "7-11" -> {
                unitPrice * amount
            }
            "carrefour" ->{
                if(amount<=100){
                    unitPrice * amount * 0.85
                }else{
                    unitPrice * amount * 8
                }
            }
            "pchome" ->{
                if(unitPrice * amount >=
                    1000){
                    unitPrice * amount - 100
                }else{
                    unitPrice * amount
                }
            }
            else -> 0
        }
    }
}