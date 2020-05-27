package com.springboot.demo.sort;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 10, 5, 3, 4, 6};
//        Bubble.sort(arr);
//        Selection.sort(arr);
//        Insertion.sort(arr);
//        Shell.sort(arr);
//        Merge.sort(arr);
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
