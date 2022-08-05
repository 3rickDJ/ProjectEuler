package p8

class LargestProductSeries {
    static List getLP(len,num){
        def numbers = num.collect { it -> it  as byte}
        def max = [prod:1,index:0]

        def i=0
        while( i <= (numbers.size()-len ) ){
            def slice = numbers[i..<(i+len)]
            def zeroAt = slice.findIndexOf{it==0}
            if( zeroAt == -1){
                if(max.prod < slice.inject(1){total,next->total*next}){
                    max.prod = slice.inject(1){total,next->total*next};
                    max.index = i
                }
                i = i + 1
            } else { i = zeroAt + i + 1}
        }
        numbers[(max.index)..(max.index+len-1)]
    }
}
