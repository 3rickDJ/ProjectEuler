import static PrimeNumbers.*
public class Main {
    public static void main(String[] args){
        // def prime = [1,2,3,5,7,11,13,17,19]
        // int num = 34580
        print "Digit a number: "
        long num = System.in.newReader().readLine() as long
        long maxFactor = maxFact(num)
        println "The hightest prime factor in $num is $maxFactor"
    }
}
