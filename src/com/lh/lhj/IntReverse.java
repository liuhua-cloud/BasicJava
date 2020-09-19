package com.lh.lhj;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringType;

public class IntReverse {

    public static int reverse(int x) {


        int temp = 0;
        int sum = 0;
        while (x!= 0) {
            temp = x % 10;
//            if(sum*10/10!=sum){
//                return 0;
//            }


            if(Integer.MAX_VALUE/10<sum||(Integer.MAX_VALUE/10==sum&&temp==7)){return 0;}
            if(Integer.MIN_VALUE/10>sum||(Integer.MIN_VALUE/10==sum&&temp==7)){return 0;}
            sum = sum * 10 + temp;
            x=x/10;
        }


        return sum;
    }
}
