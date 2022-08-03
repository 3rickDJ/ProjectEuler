package p6

class SumSquareDifferenceTest extends GroovyTestCase {

    void testFirst10Num(){
        def result = SumSquareDifference.getDifference(10)
        assert result == 2640
    }

}
