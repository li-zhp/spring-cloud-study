package com.lizhp.lambdatest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: LambdaTest1
 * @PackageName: com.lizhp.lambdatest
 * @Description: lambda测试类
 * @Author lizhp
 * @Create 2018-08-31 11:31
 **/
public class LambdaTest1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.forEach(a -> System.out.println(a));
        list.forEach(System.out::println);

        System.out.println(Thread.currentThread().getId());
        new Thread(() -> System.out.println(Thread.currentThread().getId())).start();
        new Thread(() -> System.out.println(Thread.currentThread().getId())).start();
        new Thread(() -> System.out.println(Thread.currentThread().getId())).start();

        Runnable runnable = () -> System.out.println(Thread.currentThread().getId());
        runnable.run();

        String[] array = new String[]{"a", "c", "b", "e", "d"};
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(array, sortByName);
        Arrays.asList(array).forEach(System.out::print);

        System.out.println();

        String[] array1 = new String[]{"a", "c", "b", "e", "d"};
        Arrays.sort(array1, (String a, String b) -> (b.compareTo(a)));
        Arrays.asList(array1).forEach(System.out::print);
    }
}
