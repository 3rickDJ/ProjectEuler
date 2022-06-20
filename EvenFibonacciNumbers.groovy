num1 = 1
num2 = 2
sum = 0
while (num1 <= 4000000) {
    // println"$num1 , $num2"
    if (num1%2==0) {
        sum = sum + num1
    }
    (num1, num2) = [num2, num1 +num2]
}

println "sum: $sum "
