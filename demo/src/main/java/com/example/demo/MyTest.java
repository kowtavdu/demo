package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class MyTest {


        public static boolean isValid(String s) {
            //List<String> startBracket = "(","[","{";
            Map<String,String> charMap = new HashMap();
            charMap.put("(",")");
            charMap.put("[","]");
            charMap.put("{","}");
            String[] str = s.split("");
            //Map.Entry<k,v> entryMap = charMap.entrySet();

//({([{}])})
            boolean flag = false;
            for(int i=0;i<=str.length-1;i++){
                if(charMap.containsKey(str[i])){
                    if(str[i+1].equals(charMap.get(str[i]))){
                        i = i+2;
                        flag = true;
                    }else{
                        flag = false;
                        break;
                    }
                }
            }
            return flag;

        }
    public static void main(String[] args) {

        String s = "()[]{}";
        System.out.println("Result: "+MyTest.isValid(s));
    }
}
