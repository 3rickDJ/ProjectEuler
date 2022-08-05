package p8
import static LargestProductSeries.*
import static UtilReader.getDigits

def digitString = getDigits('1000-digitNumber.txt','src/main/resources/')

def n = 13
def result = getLargestProduct(n, digitString)
println "The $n adjacent digits in the 1000-digit number that have the greatest product are $result"
