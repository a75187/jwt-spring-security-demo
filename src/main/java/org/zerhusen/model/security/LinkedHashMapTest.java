package org.zerhusen.model.security;

import java.util.LinkedHashMap;


/**
 * @desc: -.
 * @Author: lipei
 * @CreateDate: 2019/7/12 15:00
 * @Version: 1.0
 */

public class LinkedHashMapTest {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        /*  map.put("a2", "2");
        map.put("a10", "10");*/ //在size为16 时会哈希冲突
        map.put("a1", "16");
        map.put("a2", "16");
        map.put("a3", "16");
        map.put("a4", "16");
        map.put("a5", "16");
        map.put("a6", "16");
        map.put("a7", "16");
        map.put("a8", "16");
        map.put("a10", "10");

        String a15 = map.get("a10");
        System.out.println(a15);

    }
}
