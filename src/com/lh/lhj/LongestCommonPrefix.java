package com.lh.lhj;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 * 示例 1:
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * <p>
 * 示例 2:
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        //方法一
//        String comStr ="";
//        if(strs.length==1){
//            return strs[0];
//        }
//        if(strs.length!=0){
//            String firStr = strs[0];
//            for (int i = 1; i < strs.length; i++) {
//                comStr ="";
//                if(firStr.length()<strs[i].length()){
//                    for (int j=0;j<firStr.length();j++){
//                        if(firStr.charAt(j)==strs[i].charAt(j)){
//                            comStr+=firStr.charAt(j);
//                        }else {
//                            break;
//                        }
//                    }
//                }else {
//                    for (int j=0;j<strs[i].length();j++){
//                        if(firStr.charAt(j)==strs[i].charAt(j)){
//                            comStr+=firStr.charAt(j);
//                        }else {
//                            break;
//                        }
//                    }
//                }
//                firStr=comStr;
//            }
//        }
//        return comStr;

        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int count = strs.length;
        for (int i = 1; i < count; i++) {
                prefix = longcomprefix(prefix, strs[i]);
                if (prefix.length() == 0) {
                    break;
                }
        }
        return prefix;
    }


    public static String longcomprefix(String str1,String str2){
        int length = Math.min(str1.length(),str2.length());
        int index=0;

        while(index<length&&str1.charAt(index)==str2.charAt(index)){
            index++;
        }
        return str1.substring(0,index)  ;
    }
}
