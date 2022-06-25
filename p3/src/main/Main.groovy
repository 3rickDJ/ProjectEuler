// import util.PrimeNumbers
public class Main {
    public static void main(String[] args){
        def prime = [1,2,3,5,7,11,13,17,19]
        int num = 34580
        // prime = PrimeNumbers.primes(num)
        int maxfactor = 1
        int index = 0
        int aux=num
        while(true){
            if(aux%prime[index]==0){
                println prime[index]
                aux=aux/prime[index]
                maxfactor = prime[index]
            }
            if(prime[index]>aux) break
            index = index + 1
        }
        println "The hightest prime factor in $num is $maxfactor"
    }
}
