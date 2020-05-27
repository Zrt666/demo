package com.springboot.demo.sort;

/**
 * 插入排序， 稳定的
 */
public class Insertion {

    public static void sort(int[] array) {
        // 第一个元素默认最大，不需要插入
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (!Helper.compare(array[j], array[j - 1])) {
                    Helper.exch(array, j, j - 1);
                } else {
                    // 找到可以插入元素的地方，跳出
                    break;
                }
            }
        }
    }
}
