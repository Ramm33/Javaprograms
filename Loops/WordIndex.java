package com.Loops;

public class WordIndex {

    public static void main(String[] args) {

        String s="Java is simple by Srikanth sir";

        int start=0;

        for(int i=0;i<=s.length();i++){

            if(i==s.length() || s.charAt(i)==' '){

                System.out.println(
                        s.substring(start,i)+" - ("+start+", "+(i-1)+")"
                );

                start=i+1;
            }

        }

    }

}