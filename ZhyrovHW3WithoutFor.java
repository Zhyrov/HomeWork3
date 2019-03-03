package com.epam.lesson3;

import java.util.Scanner;

public class ZhyrovHW3WithoutFor {
    public static void main(String [] arg) {
        System.out.print("Enter the triangle option from 1 to 5. Or 0 if you want to exit the application.");
        Scanner sc = new Scanner (System.in);
        int var = sc.nextInt();
        if (var != 0){
            System.out.print("Enter the leg size in whole units (greater than 1).");
            int katetSmall = sc.nextInt();
            switch (var){
                case 1:
                    int j = 1;
                    do {
                        int i = 1;
                        while (i <= j){
                            i++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j++;
                    } while (j <= katetSmall);
                    while (j > 0) {
                        j--;
                        int i = 1;
                        while (i < j){
                            i++;
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    j = katetSmall;
                    while (j > 0) {
                        int k = 1;
                        while (k + j <= katetSmall){
                            k++;
                            System.out.print(" ");
                        }
                        int i = 1;
                        while (i <= j){
                            i++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j--;
                    }
                    break;
                case 3:
                    j = katetSmall;
                    while (j > 0) {
                        int k = 1;
                        while (k < j){
                            k++;
                            System.out.print(" ");
                        }
                        int i = j;
                        while (i <= katetSmall){
                            i++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j--;
                    }
                    break;
                case 4:
                    j = katetSmall;
                    while (j > 0) {
                        int k = 1;
                        while (k < j){
                            k++;
                            System.out.print(" ");
                        }
                        int i = j;
                        while (i <= katetSmall){
                            i++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j--;
                    }
                    j = katetSmall-1;
                    while (j > 0) {
                        int k = 1;
                        while (k + j <= katetSmall){
                            k++;
                            System.out.print(" ");
                        }
                        int i = 1;
                        while (i <=j){
                            i++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j--;
                    }
                    break;
                case 5:
                    j = katetSmall;
                    while (j > 0) {
                        int k = 1;
                        while (k < j){
                            k++;
                            System.out.print(" ");
                        }
                        int i = j;
                        while (i <= katetSmall){
                            i++;
                            System.out.print("*");
                        }
                        int m = j;
                        while (m < katetSmall){
                            m++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j--;
                    }
                    j = katetSmall;
                    while (j > 0) {
                        int k = 1;
                        while (k < j){
                            k++;
                            System.out.print(" ");
                        }
                        int i = j;
                        while (i <= katetSmall){
                            i++;
                            System.out.print("*");
                        }
                        int m = j;
                        while (m < katetSmall){
                            m++;
                            System.out.print("*");
                        }
                        System.out.println();
                        j--;
                    }
                    break;
                default:
                    System.out.println("Invalid value of variant!");
                    break;
            }
        }
    }
}
