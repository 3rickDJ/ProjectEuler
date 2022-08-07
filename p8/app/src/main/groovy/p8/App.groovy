package p8
import static UtilReader.getDigits

def number = getDigits('1000-digitNumber.txt','src/main/resources/')

def n = 13
def result = LargestProductSeries.getLargestProduct(n, number)
println "The $n adjacent digits in the 1000-digit number that have the greatest product are $result , ${result.inject(1){total, next -> total*next}}"
