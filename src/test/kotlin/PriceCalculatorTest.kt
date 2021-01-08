import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class PriceCalculatorTest : FunSpec({
    test("7-11: 1 item, unit price 100 should be return 100") {
        val sut = PriceCalculator()
        sut.calculatePrice("7-11", 100, 1) shouldBe 100
    }

    test("carrefour: 1 item, unit price 100 should be return 85") {
        val sut = PriceCalculator()
        sut.calculatePrice("carrefour", 100, 1) shouldBe 85
    }

    test("carrefour: 1000 items, unit price 100 should be return 800000") {
        val sut = PriceCalculator()
        sut.calculatePrice("carrefour", 100, 1000) shouldBe 80000
    }

    test("pchome: 1 item, unit price 100 should be return 100") {
        val sut = PriceCalculator()
        sut.calculatePrice("pchome", 100, 1) shouldBe 100
    }
    test("pchome: 10 items, unit price 100 should be return 100") {
        val sut = PriceCalculator()
        sut.calculatePrice("pchome", 100, 10) shouldBe 900
    }
    test("watsons: 1 item, unit price 100 should be return 88") {
        val sut = PriceCalculator()
        sut.calculatePrice("watsons", 100, 1) shouldBe 88
    }
    test("watsons: 10 items, unit price 100 should be return 88") {
        val sut = PriceCalculator()
        sut.calculatePrice("watsons", 100, 20) shouldBe 1408
    }

})
