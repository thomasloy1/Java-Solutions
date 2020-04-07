package com.company;

import java.io.Console;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
	    int[] lst = new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
	    int low = 1;
	    int high = 12;

        Scanner reader = new Scanner(System.in);
        System.out.println("What number do you want to find?");
        int v = reader.nextInt();
        reader.close();
        binarySearch(v, lst, low, high);


    }
    static boolean binarySearch(int v, int[] lst, int low, int high) {
        if (low > high) {
            System.out.println("not found");
            return false;
        }

        int middle = (low+high)/2;

        if (v == lst[middle]) {
            System.out.println("found! It is at " + middle);
            return true;
        }
        else if (v > lst[middle]) {
            return binarySearch(v, lst, middle+1, high);
        }
        else {
            return binarySearch(v, lst, low, middle-1);
        }
    }
}
