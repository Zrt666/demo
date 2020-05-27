package com.springboot.demo.sort;

/**
 * 归并排序
 */
public class Merge {

    private static int[] assist;

    public static void sort(int[] array) {
        // 初始化一个辅助数组assist
        assist = new int[array.length];
        //定义一个lo变量和hi变量，分别记录数组中最小的索引和最大的索引
        int lo = 0, hi = array.length - 1;
        //调用sort重载方法完成数组a中，从索引lo到索引hi的元素的排序
        sort(array, lo, hi);
    }

    private static void sort(int[] array, int lo, int hi) {
        // 安全性校验
        if (lo >= hi) {
            return;
        }
        // 对lo到hi之间的数据进行分为两个组
        int mid = (lo + hi) / 2;
        // 分别对每一组数据进行排序
        sort(array, lo, mid);
        sort(array, mid + 1, hi);
        // 把两个数组中的数据进行归并
        merge(array, lo, hi, mid);
    }

    private static void merge(int[] array, int lo, int hi, int mid) {
        // 定义三个指针
        int i = lo, p1 = lo, p2 = mid + 1;
        // 遍历 移动p1和p2指针，比较对应索引处的值，找出小的那个值，放到辅助数组的对应索引处
        while (p1 <= mid && p2 <= hi) {
            // 比较对应索引处的值
            if (!Helper.compare(array[p1], array[p2])) {
                assist[i++] = array[p1++];
            } else {
                assist[i++] = array[p2++];
            }
        }
        // 遍历，如果p1的指针没有走完，那么顺义p1指针，把对应的元素放到辅助数组的对应索引处
        while (p1 <= mid) {
            assist[i++] = array[p1++];
        }
        // 遍历，如果p2的指针没有走完，那么顺义p1指针，把对应的元素放到辅助数组的对应索引处
        while (p2 <= hi) {
            assist[i++] = array[p2++];
        }
        // 把辅助数组中的元素放到数组中
        for (int x = lo; x <= hi; x++) {
            array[x] = assist[x];
        }
    }
}
