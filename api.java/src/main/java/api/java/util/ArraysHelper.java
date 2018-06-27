package api.java.util;

import java.util.Arrays;

/**
 * 
 * 
 * 项目名称 : api.java
 * 创建日期 : 2018年1月23日
 * 类  描  述 : Arrays.class 常用方法
 * 修改历史 : 
 *     1. [2018年1月23日]创建文件 by ziqiang.zhang
 */
public class ArraysHelper {
    /**
     * 
     * 数组排序
     * @param a
     * 2018年1月23日 by ziqiang.zhang
     */
    public static void sort(int[] a) {
        //       Arrays.sort(a); 
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

    public static void main(String[] args) {
        int[] a = { 2, 1, 6, 4, 5, 3, 0 };
        ArraysHelper.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
