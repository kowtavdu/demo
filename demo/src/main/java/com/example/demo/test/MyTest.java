package com.example.demo.test;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    public static void main(String[] args) {


        String s = "iamgivingfirstroundinterview";
        String[] str = s.split("");
        Map<String, Integer> map = new HashMap<>();
        int i=1;
        for(String st: str){
            if(map.containsKey(str)){
                System.out.println("First Repeated String"+str);
            }else{
                if(!map.containsKey(st)){
                    map.put(st,1);
                }else {
                    map.put(st, map.get(st) + 1);
                }
            }
            if(!s.substring(i).contains(st)){
                System.out.println("not repeating"+st);
            }
            i++;
        }
    }

}
