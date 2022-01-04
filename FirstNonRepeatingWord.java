package com.h;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class FirstNonRepeatingWord {

    public static void main(String[] args) {

        String str = "morning Good morning Good hope you are doing bad  ";
        nonRepeatingWord(str);
    }

    public static void nonRepeatingWord(String str) {

        String[] strArr = str.split(" ");
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
        for (String s : strArr) {
            if (hm.containsKey(s)) {
                hm.put(s, hm.get(s) + 1);

            } else {
                hm.put(s, 1);

            }
        }

        Set<Entry<String, Integer>> map = hm.entrySet();
        for (Entry<String, Integer> ent : map) {
            if (ent.getValue() > 1) {
            } else {
                System.out.println(ent.getKey());
                break;
            }

        }

    }

}
