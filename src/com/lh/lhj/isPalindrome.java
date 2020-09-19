package com.lh.lhj;

/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 1:
 * 输入: 121
 * 输出: true
 *使用String字符串
 */
public class isPalindrome {

    public static boolean palindrome(int x){
            StringBuilder S1 =new StringBuilder();
            S1.append(x);
            String s1 =S1.toString();

            StringBuilder S2=S1.reverse();
            String s2 =S2.toString();

            if(s1.equals(s2)){
                return true;
            }
            return false;
    }


}
