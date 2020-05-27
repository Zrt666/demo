package com.springboot.demo.sort;

/**
 * 希尔排序
 */
public class Shell {

    public static void sort(int[] array) {
        // 计算增长量
        int n = array.length;
        int h = 1;
        while (h < n / 2) {
            h = h * 2 + 1;
        }

        while (h >= 1) {
            // 排序
            // 找到待插入的元素
            for (int i = h; i < n; i++) {
                // 将待插入的元素插入到有序数组中
                for (int j = i; j >= h; j -= h) {
                    // 待插入元素a[j] a[j-h]
                    if (!Helper.compare(array[j], array[j - h])) {
                        Helper.exch(array, j, j - h);
                    } else {
                        break;
                    }
                }
            }

            // 减小h
            h = h / 2;
        }
    }
}
