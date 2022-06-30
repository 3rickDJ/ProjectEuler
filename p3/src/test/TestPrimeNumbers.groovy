import static PrimeNumbers.maxFact
class TestPrimeNumbers extends GroovyTestCase {
    void testMaxFact() {
        long result = maxFact(19L)
        assertEquals(result, 19L)
        result = maxFact(50388L)
        assertEquals(result,19L)
        result = maxFact(77693L)
        assertEquals(result, 1009)

    }

    void testInvalidNumber(){
        def msg = shouldFail { maxFact(1L) }
        assert msg == "The number 1 is invalid"
    }
}
