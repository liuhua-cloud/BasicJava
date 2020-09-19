package com.lh.lhj;

/**
 *
 *
 * 实现字符反转
 */
public class Reverse {
////方法一：字符串拼接
//    public String reverseCharacter(String str){
//        char a[] = str.toCharArray();
//        String  str1="";
//        if(str.length()==0||str==""){
//            return str;
//        }else {
//            for (int i=str.length()-1;i>=0;i--){
//                    //a[str.length()-i-1]=str.charAt(i);
//                    str1+=str.charAt(i);
//
//            }
//        }
//
//        return str1;
//
//
//    }

//方法二：递规

    public String reverseCharacter(String string){
        if(string==""||string.length()==1){
            return string;
        }else

        return reverseCharacter(string.substring(1))+string.charAt(0);
    }

}
