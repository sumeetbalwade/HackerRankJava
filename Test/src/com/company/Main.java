package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int x,count=0,c=0;
        boolean f=false;
        while(true){
            x=sc.nextInt();
            if (x<0){

                break;
            }
            if (x%2!=0){
                if (x>10){
                    f=true;
                }
                count++;
            }else {
                if (f){
                    if (count>0){
                        c++;
                        count=0;
                    }
                    f=false;
                }
            }


        }

        System.out.println(c);
    }
}
