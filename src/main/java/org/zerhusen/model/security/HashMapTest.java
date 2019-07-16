package org.zerhusen.model.security;

import java.util.HashMap;

/**
 * @desc: -.
 * @Author: lipei
 * @CreateDate: 2019/7/10 14:29
 * @Version: 1.0
 */

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<>();
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
        map.put("a9", "16");
        map.put("a10", "16");
        map.put("a11", "16");
        map.put("a12", "16");
        map.put("a13", "16");
        map.put("a14", "16");
        map.put("a15", "16");
    }
}

