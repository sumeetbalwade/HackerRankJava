package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        int n=3,m=3;
        int p[][]= {{3,2,5},{8,9,1},{4,7,6}};


        int c[][]={{1,1,1},{1,1,1},{1,1,1}};



        int k=0;
        int a=0;

        int s=1;

        for (int i=0;i<n;i++){

            int min=1001;


            for (int j=0;j<m;j++){

                if (min>p[i][j]){
                    min=p[i][j];
                    k=i;
                    a=j;
                }
            }

            s=s+min;
            s=s-c[k][a];

        }
            System.out.println(s);

    }
}
