package com.company;

import java.util.Scanner;

public class CountNoOfEvenOddElement {

    public static void main(String[] args) {
        int result, zero = 0, even = 0, odd = 0;
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            arr[i] = Math.abs(arr[i]);
            if (arr[i] == 0) {
                zero++;
            } else if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even:" + even);
        System.out.println("Odd:" + odd);
        System.out.println("Zero:" + zero);
    }
}
