package com.encore.jcf.map;

import java.util.*;
import java.util.Map.Entry;

/*
Map Interface
- 비선형 자료구조
- key, value 로 데이터를 관리
- 값은 중복허용 o, key 중복허용 x
- 직접파일 형식처럼 direct access 가능하여 검색에 용이
- HashMap
 */
public class MapDemoMain {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        System.out.println("value 추가 >>>>");
        map.put("title", "불필요한 금요일");
        map.put("content", "병원에 가자");
        map.put("writer", "임섭순");

        System.out.println("출력 >>>> ");
        System.out.println(map);

        System.out.println();
        System.out.println("entrySet >>>> Entry(key, value) ");
        for (Entry<String, String> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + ", " + entrySet.getValue());
        }

        System.out.println();
        System.out.println("keySet >>>> ");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
        ///////////////////////////////////////////////////////////////////////
        List<String> lst01 = new ArrayList<>();
        lst01.add("A");
        lst01.add("B");
        lst01.add("C");
        List<String> lst02 = new ArrayList<>();
        lst02.add("D");
        lst02.add("E");
        lst02.add("F");

        Map<String, List<String>> multiLst = new HashMap<>();
        multiLst.put("a_section", lst01);
        multiLst.put("b_section", lst02);
        ////////
        System.out.println();
        List<String> a_section_lst = multiLst.get("a_section");
        for (String data : a_section_lst) {
            System.out.println(data);
        }

    }

}
