package com.company;

import java.util.Scanner;

public class ReturnSecondLast
{

    public static void main(String[] args) {
        int number, result;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        number = number / 10;
        result = number % 10;
        if (result < 0) {
            System.out.println(result * -1);
        } else {
            System.out.println(result);
        }
    }
}
