package com.lh.lhj;

import java.util.List;
import java.util.Stack;

/**
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 */
public class reverseList {

    public ListNode reverse(ListNode head) {

//        if (head == null) return head;
//          ListNode result=new ListNode(-1);
//          ListNode newListNode=result;
//
//        Stack<ListNode> stack =new Stack<ListNode>();
//
//          while (head!=null){
//              stack.push(head);
//              head=head.next;
//          }
//
//          while (!stack.empty()){
//              ListNode ls=stack.pop();
//              newListNode.next=ls;
//              newListNode=ls;
//          }
//
//          newListNode.next=null;
//          return result.next;

//方法二
//        ListNode pre=null,cru=head,next=null;
//        while (cru!=null){
//            next=cru.next;
//            cru.next=pre;
//            pre=cru;
//            cru=next;
//        }
//        return  pre;

        //方法三递归
            //终止条件
            if (head == null || head.next == null)
                return head;
            //保存当前节点的下一个结点
            ListNode next = head.next;
            //从当前节点的下一个结点开始递归调用
            ListNode reverse = reverse(next);
            //reverse是反转之后的链表，因为函数reverseList
            // 表示的是对链表的反转，所以反转完之后next肯定
            // 是链表reverse的尾结点，然后我们再把当前节点
            //head挂到next节点的后面就完成了链表的反转。
            next.next = head;
            //这里head相当于变成了尾结点，尾结点都是为空的，
            //否则会构成环
            head.next = null;
            return reverse;
        }



}
