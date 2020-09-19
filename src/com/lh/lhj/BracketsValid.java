package com.lh.lhj;

import java.util.HashMap;
import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 示例 1:
 * 输入: "()"
 * 输出: true
 */
public class BracketsValid {

    public boolean isValid(String s) {

        HashMap<Character,Character> hashmap =new HashMap<Character,Character>();

        hashmap.put(')','(');
        hashmap.put(']','[');
        hashmap.put('}','{');
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if(hashmap.containsValue(s.charAt(i))){//如果是左括号
                stack.push(s.charAt(i));
            }
            if(hashmap.containsKey(s.charAt(i))){//如果是右括号，判断栈顶元素是否与map中当前元素的value值是否相等
                if(stack.empty()){
                    return  false;
                }
                else if(stack.peek()==hashmap.get(s.charAt(i))){
                    stack.pop();
                   // return true;
                }else
                    return false;

            }
        }


        return stack.empty()?true:false;
    }
}
