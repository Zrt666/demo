package com.springboot.demo.sort;

/**
 * 选择排序
 */
public class Selection {

    public static void sort(int[] array) {
        // 选择排序最后一个不需要比较，当排到最后一个后，默认必为最大值
        for (int i = 0; i < array.length - 1; i++) {
            // 记录最小元素所在的索引，默认取第一个，则第一个不必进行比较
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (Helper.compare(array[minIndex], array[j])) {
                   minIndex = j;
                }
            }
            // 放在外面减少交换次数
            Helper.exch(array, i, minIndex);
        }
    }
}
