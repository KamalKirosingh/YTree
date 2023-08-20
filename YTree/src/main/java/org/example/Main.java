package org.example;

import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {
        RandomGen randomGen = new RandomGen(new int[]{-1, 0, 1, 2, 3}, new float[]{0.01f, 0.3f, 0.58f, 0.1f, 0.01f});

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < 100; i++) {
            int num = randomGen.nextNum();
            if(map.containsKey(num)) {
                int value = map.get(num);
                map.put(num, value+1);
            } else {
                map.put(num, 1);
            }
        }
        System.out.println(map);
    }
}