package p5

class SmallestMultipleTest extends GroovyTestCase {

    void testMCM5(){
        def result = SmallestMultiple.mCM(5)
        assert result == 60
    }

    void testMCM8(){
        def result = SmallestMultiple.mCM(8)
        assert result == 840
    }

    void testMCM10(){
        def result = SmallestMultiple.mCM(10)
        assert result == 2520
    }
}
