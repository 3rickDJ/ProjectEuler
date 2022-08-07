package p8

class LargestProductSeries {
    static List getLargestProduct(Integer len, String num){
        List numbers = num.collect { it -> it  as BigInteger}
        def max = [prod:0,index:0]

        def i=0
        while( i <= (numbers.size()-len ) ){
            List slice = numbers[i..<(i+len)]
            def product = slice.inject(1){total,next->total*next}

            if(product==0){
                i = slice.findIndexOf{it==0} + i +1
            }else{
                if(product > max.prod){
                    max.prod = product
                    max.index = i
                }
                i = i + 1
            }

        }
        numbers[(max.index)..(max.index+len-1)]
    }
}
