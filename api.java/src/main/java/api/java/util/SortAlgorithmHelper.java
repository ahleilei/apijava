package api.java.util;

import java.util.Arrays;

/**
 * 
 * 
 * 项目名称 : api.java
 * 创建日期 : 2018年1月23日
 * 类  描  述 : 常用8种排序算法
 * 插入排序（直接插入排序、希尔排序）
 * 交换排序（冒泡排序、快速排序）
 * 选择排序（直接选择排序、堆排序）
 * 归并排序
 * 分配排序（基数排序）
 * 
 * 所需空间最多 归并排序
 * 所需空间最小 堆排序
 * 平均速度最快 快速排序
 * 
 * 修改历史 : 
 *     1. [2018年1月23日]创建文件 by ziqiang.zhang
 */
public class SortAlgorithmHelper {
    /**
     * 插入排序（直接插入排序）
     * 1、假设前面n－1个是已经排好顺序的；
     * 2、将第n个数插入到前面有序数组中，使得这n个数也是排好顺序的，如此反复
     * 
     * @param a
     * 2018年1月23日 by ziqiang.zhang
     */
    public static void insertSort(int[] a) {
        // 从第二位开始循环
        for(int i=1;i<a.length;i++){
            
            int j = i-1;
            // 保存当前值至变量temp
            int temp = a[i];
            // 倒序遍历i-1 至 0，与temp比较，如果大于temp，则将该值换到下一位,否则跳出循环
            for(;j>=0&&a[j]>temp;j--){
                
                a[j+1] = a[j];                                               
            }
            // 将小于temp的位置的下一位替换为temp
            a[j+1] = temp;
        }
    }
    /**
     * 插入排序（希尔排序）
     * 
     * @param a
     * 2018年1月23日 by ziqiang.zhang
     */
    public static void shellSort(int[] a) {

    }

    public static void bubbleSort(int[] a) {

    }

    public static void quickSort(int[] a) {

    }

    public static void selectionSort(int[] a) {

    }

    public static void heapSort(int[] a) {

    }

    public static void mergeSort(int[] a) {

    }

    public static void radixSort(int[] a) {

    }

    public static void main(String[] args) {

        int[] a = {2,1,6,4,5,3};
        
        SortAlgorithmHelper.insertSort(a);
        
        System.out.println(Arrays.toString(a));
    }

}
