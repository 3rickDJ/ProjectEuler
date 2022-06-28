class PrimeNumbers {
    static long maxFact(long  num){
        long divisor=2
        while (!(num.equals(1L))){
            long remainder = Long.remainderUnsigned(num,divisor)
            if(remainder.equals(0L)){
                // println "$num : $divisor"
                num= Long.divideUnsigned(num,divisor)
            } else {
                divisor++
            }
        }
        divisor
    }
}
