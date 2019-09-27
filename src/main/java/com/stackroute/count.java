package com.stackroute;

public class count {
    public int CountWords(String str, char ch){
        int l1= str.length();
        int l2= str.replaceAll(String.valueOf(ch),"").length();
        return l1-l2;
    }
}
