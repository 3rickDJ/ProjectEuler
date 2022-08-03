package p5
import static PrimeList.*
class PrimeListTest extends GroovyTestCase{
    void testGetPrimes5(){
        def list = getPrimeList(5)
        assert list == [2,3,5]
    }

    void testGetPrimes10(){
        def list = getPrimeList(10)
        assert list == [2,3,5,7]
    }

    void testGetPrimes20(){
        def list = getPrimeList(20)
        assert list == [2,3,5,7,11,13,17,19]
    }

}
