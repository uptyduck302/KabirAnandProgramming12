package com.anand.Failfast;

import java.util.ArrayList;
import java.util.List;

public class FailFast {

    public static List<Integer> hailStone(int n){
        if(n < 1){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1){
            if(n%2 == 0){
                n = n / 2;
                list.add(n);
            }else{
                n = n * 3 + 1;
                list.add(n);
            }
        }
        return list;
    }
}

