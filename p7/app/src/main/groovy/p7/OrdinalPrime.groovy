package p7

class OrdinalPrime {
    static List<BigInteger> primes = new ArrayList<BigInteger>(){{
        add(2)
    }}
    static BigInteger currentNumber = 3

    static BigInteger ordinal(n){
        while(this.primes.size()<n){
            this.nextPrime()
        }
        this.primes[this.primes.size()-1]
    }

    static void nextPrime(){
        while(this.primes.any{this.currentNumber % it ==0}) {
            this.currentNumber += 2
        }
        this.primes << this.currentNumber
    }
}
