package p5
import static PrimeList.getPrimeList
class SmallestMultiple {
    static def mCM(n){
        // def primeFactors = [[2,0],[3,0],[5,0],[7,0]] //getPrimeList
        if(n==1){return 1}
        def primeFactors = getPrimeList(n)
        primeFactors.collect{prime->
            def counter = 0
            (2..n).each{
                def counting = 0
                while( it % prime ==0){
                    counting = counting + 1
                    it = it/prime as BigInteger
                }
                counter = counting > counter ? counting:counter
            }
            prime**counter
        }.inject(1){total,next -> total*next}
    }
}
