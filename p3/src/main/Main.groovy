import static PrimeNumbers.*
public class Main {
    public static void main(String[] args){
        long num = 34580L
        // print "Digit a number: "
        // long num = System.in.newReader().readLine() as long
        long maxFactor = maxFact(num)
        println "The hightest prime factor in $num is $maxFactor"
    }
}
