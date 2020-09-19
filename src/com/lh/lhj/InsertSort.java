package com.lh.lhj;

/**
 * 插入排序
 */
public class InsertSort {


    public static void insertSort(int[] arry){
        //index 未排序数组下边
        for (int index=1;index<arry.length;index++){
            //leftIndex 左边已排序数组的最大值下标
            int leftIndex=index-1;
            int temp=arry[index];

            while (leftIndex>0&&arry[leftIndex]>temp){
                arry[leftIndex+1]=arry[leftIndex];
                leftIndex--;
            }
            arry[leftIndex+1]=temp;

        }
    }


    public static void main(String[] args) {
        int a[] = {1,18,334,2,445,2343,146};
        insertSort(a);

        for (int x:
        a){
            System.out.println(x);
        }

    }
}
