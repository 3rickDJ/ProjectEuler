package p8
import static UtilReader.getDigits

class LargestProductSeriesTest extends GroovyTestCase{
    void testSeries2(){
         def number = getDigits('1000-digitNumber.txt','src/test/resources/')
         def result = LargestProductSeries.getLargestProduct(2, number)
         assert result == [9,9]
    }

    void testSeries3(){
         def number = getDigits('1000-digitNumber.txt','src/test/resources/')
         def result = LargestProductSeries.getLargestProduct(3, number)
         assert result == [9,8,9]
    }

    void testSeries4(){
         def number = getDigits('1000-digitNumber.txt','src/test/resources/')
         def result = LargestProductSeries.getLargestProduct(4, number)
         assert result == [9,9,8,9]
    }
}
