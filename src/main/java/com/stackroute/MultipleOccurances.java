package com.stackroute;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurances {
    public String multipleOccurances(String str, String matching){
        StringBuffer sbf= new StringBuffer();
        Pattern pattern = Pattern.compile(matching);
        Matcher m  = pattern.matcher(str);
        int temp1=0,temp2=0;
        while (m.find()) {
            temp1 = (m.start());
            temp2 = (m.end());
            sbf.append("Found at:" +" "+ temp1+" " + "-"+" " + temp2);
        }
        return sbf.toString().trim();
    }

}
