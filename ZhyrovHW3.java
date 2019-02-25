package com.epam.Lesson3;

public class ZhyrovHW3 {
    public static void main(String [] arg) {
        int katetSmall = 5;

        int j = 1;
        do {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
            j++;
        } while (j <= katetSmall);
        while (j > 0) {
            j--;
            for (int i = 1; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        j = katetSmall;
        while (j > 0) {
            for (int k = 1; k + j <= katetSmall; k++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }
        System.out.println();

        j = katetSmall;
        while (j > 0) {
            for (int k = 1; k < j; k++) {
                System.out.print(" ");
            }
            for (int i = j; i <= katetSmall; i++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }

        System.out.println();
        j = katetSmall;
        while (j > 0) {
            for (int k = 1; k < j; k++) {
                System.out.print(" ");
            }
            for (int i = j; i <= katetSmall; i++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }
        j = katetSmall-1;
        while (j > 0) {
            for (int k = 1; k + j <= katetSmall; k++) {
                System.out.print(" ");
            }
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }
        System.out.println();

        j = katetSmall;
        while (j > 0) {
            for (int k = 1; k < j; k++) {
                System.out.print(" ");
            }
            for (int i = j; i <= katetSmall; i++) {
                System.out.print("*");
            }
            for (int i = j; i < katetSmall; i++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }
        j = katetSmall;
        while (j > 0) {
            for (int k = 1; k < j; k++) {
                System.out.print(" ");
            }
            for (int i = j; i <= katetSmall; i++) {
                System.out.print("*");
            }
            for (int i = j; i < katetSmall; i++) {
                System.out.print("*");
            }
            System.out.println();
            j--;
        }
    }
}
