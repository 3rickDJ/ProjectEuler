package p4
class MaxPalindrome {
    static int PalindromeProduct(int n){
        def (max, min) = MaxMinDigit(n)
        def sup= max**2
        def inf = min**2
        def list = (sup..inf).findAll{isPalindrome(it)}
        list.find{it -> isProduct(it, max, min)}
    }
    static def MaxMinDigit(n){
        def max = ("9"*n) as BigInteger //n decimal digits
        def min = ("1"+("0"*(n-1))) as BigInteger
        [max,min]
    }
    static boolean isPalindrome( n ){
        n = n as String
        n ==  n.reverse()
    }
    static isProduct(elm, max, min){
        def i = max
        // def productOfnDigits ={elm, max,min -> elm<max && elm>min}
        do{
            if(elm%i==0){
                elm = elm/i
                return  elm<=max && elm>=min
            }
            i=i-1
        }while(i>=min)
        false
    }
}
