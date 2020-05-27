package com.springboot.demo.sort;

/**
 * 冒泡排序
 */
public class Bubble {

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (Helper.compare(array[j], array[j + 1])) {
                    Helper.exch(array, j, j + 1);
                }
            }
        }
    }
}
