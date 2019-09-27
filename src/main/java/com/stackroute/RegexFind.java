package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFind {
    public String regexMethod(String str){
        String s= new String();
        Pattern pattern= Pattern.compile("Harry");
        Matcher m= pattern.matcher(str);
        if (m.find()){
            s= "Is Harry here ? true";
        }
        else
            s= "Is Harry here ? false";

        return s;
    }
}

