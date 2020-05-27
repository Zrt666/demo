package com.springboot.demo.sort;

public class Helper {

    public static boolean compare(int a, int b) {
        return a > b;
    }

    /**
     * 交换
     * @param array
     * @param i
     * @param j
     */
    public static void exch(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
