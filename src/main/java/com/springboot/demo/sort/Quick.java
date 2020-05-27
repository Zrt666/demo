package com.springboot.demo.sort;

/**
 * 快速排序
 */
public class Quick {

    public static void sort(int[] array) {
        int lo = 0, hi = array.length - 1;
        sort(array, lo, hi);
    }

    // 对数组a中从索引lo到索引hi之间的元素进行排序
    public static void sort(int[] array, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        // 需要对数组中lo索引到hi索引处的元素进行分组（左子组和右子组）
        // 返回的是分组的分界值所在的索引，分界位置变换后的索引
        int partition = partition(array, lo, hi);
        // 让左子组有序
        sort(array, lo, partition - 1);
        // 让右子组有序
        sort(array, partition + 1, hi);
    }

    // 对数组a从索引lo到hi之间的元素进行分组，并返回分组界限对应的索引
    public static int partition(int[] array, int lo, int hi) {
        // 确定分界值
        int value = array[lo];
        // 定义两个指针，分别指向待切分元素的最小元素索引和最大元素索引的下一个位置
        int left = lo, right = hi + 1;
        // 切分
        while (true) {
            // 从右往左扫描，移动right指针，找到一个比分界值小的元素，停止
            while (!Helper.compare(value, array[--right])) {
                if (right == lo) {
                    break;
                }
            }
            // 从左往右扫描，移动left指针，找到一个比分界值大的元素，停止
            while (Helper.compare(value, array[++left])) {
                if (left == hi) {
                    break;
                }
            }
            // 判断 left >= right，如果是，则证明元素扫描完毕，结束循环，如果不是，则交换元素
            if (left >= right) {
                break;
            } else {
                Helper.exch(array, left, right);
            }
        }

        // 交换分界值
        Helper.exch(array, lo, left);

        return left;
    }
}
