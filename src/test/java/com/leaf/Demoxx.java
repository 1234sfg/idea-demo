package com.leaf;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest

public class Demoxx {
    @Test
    public void testList() {
        System.out.println("添加");
        List<String> list = new ArrayList<>();
        list.add("一条鱼");
        list.add("两条鱼");
        list.add("三条鱼");
        list.add("四条鱼");
        list.add("五条鱼");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("删除");
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add("四条鱼");
        list.add("五条鱼");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    @Test
    public void testSet() {

        Set<String> set = new HashSet<>();
        set.add("一条鱼");
        set.add("两条鱼");
        set.add("三条鱼");
        set.add("四条鱼");
        set.add("五条鱼");
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("添加");
        set.add("四条鱼");
        set.add("五条鱼");
        for (String s : set) {
            System.out.println(s);
        }

    }

    @Test
    public void testMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("东", "hwdwdwdw");
        map.put("南", "jaqwdsrw");
        map.put("西", "ddwawdsfedad");
        map.put("北", "dsadsadsadsak");

        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            Object value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
    @Test
    public void testInstanceof(){
        List list = new ArrayList();
        System.out.println(list instanceof Object);
    }





}

