package com.lh.lhj;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class MergeList {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//方法一：递归
//        if (l1 == null) {
//        return l2;
//    }
//        else if (l2 == null) {
//        return l1;
//    }
//
//        else if (l1.val < l2.val) {
//        l1.next=mergeTwoLists(l1.next,l2);
//        return l1;
//    }
//        else {
//        l2.next=mergeTwoLists(l2.next,l1);
//        return l2;
//    }


        //方法二：迭代
        ListNode result=new ListNode();
        ListNode preHead=result;
        while (l1!=null&&l2!=null){
            if(l1.val<l2.val){
                preHead.next=l1;
                l1=l1.next;
            }
            else {
                preHead.next=l2;
                l2=l2.next;
            }
            preHead=preHead.next;
        }
        preHead.next=l1==null?l2:l1;

        return result.next;

}
}