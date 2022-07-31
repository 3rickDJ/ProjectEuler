package p4
import static MaxPalindrome.*

class MaxPalindromeTest extends GroovyTestCase {
    void test1MaxPalindrome(){
        def result = PalindromeProduct( 2 )
        assert result == 9009
    }
    void test2(){
        def result = PalindromeProduct(1)
        assert result == 9
    }
}
