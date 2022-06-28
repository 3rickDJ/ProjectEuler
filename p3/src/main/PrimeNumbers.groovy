class PrimeNumbers {
    static long maxFact(long  num){
        long divisor=2L
        //Unique even prime '2'
        while (!(num.equals(1L))){
            long remainder = Long.remainderUnsigned(num,2L)
            if(remainder.equals(0L)){
                // println "$num : $divisor"
                num=Long.divideUnsigned(num,divisor)
            } else {
                break
            }
        }
        if(num.equals(1L)){return 2L}

        //odd primes
        divisor++
        while (!(num.equals(1L))){
            long remainder = Long.remainderUnsigned(num,divisor)
            if(remainder.equals(0L)){
                num= Long.divideUnsigned(num,divisor)
            } else {
                divisor+=2
            }
        }
        divisor
    }
}
