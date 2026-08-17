package com.Loops;


public class MatrixReverse {

    public static void main(String args[]) {

        int[][] a = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int n = 4;

        for(int i=0;i<n;i++){

            for(int j=0;j<n/2;j++){

                int temp=a[i][j];
                a[i][j]=a[i][n-1-j];
                a[i][n-1-j]=temp;
            }
        }

        for(int i=0;i<n;i++)
            a[i][i]=a[i][i]*a[i][i];

        for(int i=0;i<n;i++){

            for(int j=0;j<n;j++)
                System.out.printf("%4d",a[i][j]);

            System.out.println();
        }

    }
}
