class PrimeNumbers {
    static long maxFact(long  num){
        if (Long.compare(num,1L)<=0){ throw new Exception("The number $num is invalid")}
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
        if(num.equals(1L)){ 2L }

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
