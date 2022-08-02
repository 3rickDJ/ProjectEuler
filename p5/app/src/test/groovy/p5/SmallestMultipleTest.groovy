package p5

class SmallestMultipleTest extends GroovyTestCase {

    void "test1 number 5"(){
        def result = SmallestMultiple.mCM(5)
        assert result = 60
    }

    void "test2 number 8"(){
        def result = SmallestMultiple.mCM(8)
        assert result = 840
    }

    void "test3 number 10"(){
        def result = SmallestMultiple.mCM(10)
        assert result = 2520
    }
}
