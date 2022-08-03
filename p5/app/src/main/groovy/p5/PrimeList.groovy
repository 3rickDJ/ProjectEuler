package p5

class PrimeList {

    static List getPrimeList(n){
        (2..n).findAll{isPrime(it)}
    }

    static boolean isPrime(n){
        if(n==1){return false }
        if(n==2){return true }

        !((n-1)..2).any{ n % it == 0 }
    }
}
