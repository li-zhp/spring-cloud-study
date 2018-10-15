package com.lizhp.lambdatest;

/**
 * @ClassName: Finder
 * @PackageName: com.lizhp.lambdatest
 * @Description: finder
 * @Author lizhp
 * @Create 2018-09-26 16:06
 **/
public class Finder {

    public static int find(int[] a, int value, int start, int end) {
        if (value < a[start] || value > a[end] || start > end) {
            return -1;
        }
        int middle = (start + end) / 2;
        if (value < a[middle]) {
            return find(a, value, start, middle);
        } else if (value > a[middle]) {
            return find(a, value, middle, end);
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 55, 56, 67, 78, 909};
        int index = find(intArray, 5, 0, intArray.length - 1);
        System.out.println(index);
        int[] intArray2 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 11, 55, 56, 67, 78, 909};
        int index2 = find(intArray2, 5);
        System.out.println(index2);
    }

    public static int find(int[] a, int value) {
        int start = 0;
        int end = a.length - 1;
        int middle = 0;
        if (value < a[start] || value > a[end] || start > end) {
            return -1;
        }
        while (end >= start) {
            middle = (start + end) / 2;
            if (value < a[middle]) {
                end = middle - 1;
            } else if (value > a[middle]) {
                start = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

}
