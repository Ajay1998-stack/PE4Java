package com.stackroute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Transpose {
    public String transpose(String str){
        String[] arr= str.split(" ");
        StringBuffer sbf= new StringBuffer();
        for (String i:arr){
            StringBuffer sbf2 = new StringBuffer(i);
            sbf.append(sbf2.reverse()+" ");
        }
        return sbf.toString().trim();
    }
}
