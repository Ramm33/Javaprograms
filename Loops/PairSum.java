package com.Loops;

import java.util.*;

public class PairSum {

    public static void main(String[] args) {

        int arr[] = {1,2,7,8,9};
        int target = 9;

        HashSet<Integer> set = new HashSet<>();

        for(int x : arr){

            int diff = target-x;

            if(set.contains(diff)){
                System.out.println("(" + diff + "," + x + ")");
            }

            set.add(x);

        }

    }

}