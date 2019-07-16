package org.zerhusen.model.security;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @desc: -.
 * @Author: lipei
 * @CreateDate: 2019/7/9 14:55
 * @Version: 1.0
 */

public class ArrayListTest {
    public static void main(String[] args) {
         ArrayList<Integer> ids = new ArrayList<>();
        ids.add(1);
        ids.add(2);
        ids.add(3);
        ids.add(4);
        ids.add(5);
        ids.add(6);
        ids.add(7);
        ids.add(8);
        ids.add(9);
        ids.add(10);
        ids.add(11);
        ids.add(12);
        ids.add(13);
        ids.add(14);
        ids.add(15);
        ids.add(16);
        Integer[] objects = (Integer[]) Arrays.copyOf(ids.toArray(), 1);

      System.out.println(ids.get(0));

    }
}
