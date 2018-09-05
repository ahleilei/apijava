package top.yning.java.util;

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
     * 时间复杂度：O（n^2）
     * @param a
     * 2018年1月23日 by ziqiang.zhang
     */
    public static void insertSort(int[] a) {
        // 从第二位开始循环
        for (int i = 1; i < a.length; i++) {

            int j = i - 1;
            // 保存当前值至变量temp
            int temp = a[i];
            // 倒序遍历i-1 至 0，与temp比较，如果大于temp，则将该值换到下一位,否则跳出循环
            for (; j >= 0 && a[j] > temp; j--) {

                a[j + 1] = a[j];
            }
            // 将小于temp的位置的下一位替换为temp
            a[j + 1] = temp;
        }
    }

    /**
     * 来自java Arrays.sort
     * use insertion sort on tiny arrays when length less than 47
     * traditional insertion sort
     * 
     * @param a
     * 2018年1月29日 by ziqiang.zhang
     */
    public static void insertSortFromJava(int[] a) {

        int left = 0;
        int right = a.length - 1;

        for (int i = left, j = i; i < right; j = ++i) {
            int ai = a[i + 1];
            while (ai < a[j]) {
                a[j + 1] = a[j];
                if (j-- == left) {
                    break;
                }
            }
            a[j + 1] = ai;
        }

    }

    /**
     * 插入排序（希尔排序）
     * 1、将排序的数组按增量d（n/2，n为要排序的个数）分成若干个组
     * 2、每组记录下标相差d，对每组进行CAS（compare and swap）
     * 
     * @param a
     * 2018年1月23日 by ziqiang.zhang
     */
    public static void shellSort(int[] a) {

        int d = a.length;

        while (d >= 1) {
            // 取增量
            d = (int) Math.ceil(d / 2);

            for (int i = 0; i < d; i++) {
                // 分组
                for (int j = i + d; j < a.length; j += d) {
                    // 分组中插入排序
                    for (; j - d >= 0 && a[j - d] > a[j]; j -= d) {
                        int temp = a[j];
                        a[j] = a[j - d];
                        a[j - d] = temp;
                    }

                }
            }
        }

    }

    /**
     * 冒泡排序
     * 1、将数组中相邻的数字两两比较，将较大的下沉，小大上冒
     * @param a
     * 2018年1月25日 by ziqiang.zhang
     */
    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length - 1; i++) {

            for (int j = 0; j < a.length - i - 1; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

            }

        }

    }

    /**
     * 快速排序
     * 1、取第一个数为中间数
     * 2、将高位放到后面，低位放入前面
     * 3、此时中间数的位置为正确位置
     * 4、用同样的方式递归处理前后两部分
     * 
     * @param a
     * 2018年1月25日 by ziqiang.zhang
     */
    public static void quickSort(int[] a) {
        _quickSort(a, 0, a.length - 1);
    }

    public static void _quickSort(int[] a, int low, int high) {

        if (low < high) {

            int middle = getMiddle(a, low, high);

            _quickSort(a, low, middle - 1);
            _quickSort(a, middle + 1, high);
        }
    }

    public static int getMiddle(int[] a, int low, int high) {

        int temp = a[low];

        while (low < high) {
            // 高位的值大于中间值，继续找下一个
            while (low < high && temp < a[high]) {

                high--;
            }
            // 将小于中间值赋值给低位
            a[low] = a[high];
            // 低位小于中间值，继续找下一个
            while (low < high && temp > a[low]) {
                low++;
            }
            // 将低位值赋给高位
            a[high] = a[low];

        }
        // 将中间值赋值给中间位置
        a[low] = temp;

        return low;
    }

    /**
     * 选择排序
     * 1、从下标＝1数组中的数与第一个比较，小于第一个数，则与之交换
     * 2、从下表＝2数组中的数与第二个比较，小于第二个数，则与之交换
     *  如此循环...
     * @param a
     * 2018年1月25日 by ziqiang.zhang
     */
    public static void selectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                // 数组后续数值循环与a[i]比较，小于则交换
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }

    }

    public static void heapSort(int[] a) {

    }

    public static void mergeSort(int[] a) {

    }

    public static void radixSort(int[] a) {

    }

    public static void main(String[] args) {

        int[] a = { 2, 1, 6, 4, 5, 3, 0 };

        SortAlgorithmHelper.insertSortFromJava(a);

        System.out.println(Arrays.toString(a));

        System.out.println(100/7);
        
        while(5>3);
    }

}
