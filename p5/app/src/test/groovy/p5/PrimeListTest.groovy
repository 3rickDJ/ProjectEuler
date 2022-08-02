package p5
import static PrimeList.*
class PrimeListTest extends GroovyTestCase{
    void "test Get Primes for range 1..5"{
        def list = getPrimeList(5)
        assert list = [2,3,5]
    }

    void "test Get Primes for range 1..10"{
        def list = getPrimeList(10)
        assert list = [2,3,5,7]
    }

    void "test Get Primes for raneg 1..20"{
        def list = getPrimeList(20)
        assert list = [2,3,5,7,11,13,17,19]
    }

}
