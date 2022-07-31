package p4

class AppTest extends GroovyTestCase {
    void  "test 2 digits"() {
        def result = MaxPalindrome.PalindromeProduct(2)
        assert result == 9009
    }
}
