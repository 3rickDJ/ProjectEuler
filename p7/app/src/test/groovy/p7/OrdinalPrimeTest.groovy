package p7

import static OrdinalPrime
class OrdinalPrimeTest extends GroovyTestCase{
    void testOrdinal4(){
        def result = ordinal(3)
        assert result == 5
    }

    void testOrdinal6(){
        def result = ordinal(6)
        assert result == 13
    }
}
