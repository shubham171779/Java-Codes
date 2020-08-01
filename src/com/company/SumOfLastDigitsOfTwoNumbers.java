package com.company;

import java.util.Scanner;

public class SumOfLastDigitsOfTwoNumbers
{
    public static void main(String[] args) {
        int number1,number2, result, result2,sum;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2=sc.nextInt();
        number1=Math.abs(number1);// Math.abs() se -ve number positive ho jata h
        number2=Math.abs(number2);

        result = number1 % 10;
        result2 =number2 %10;
        sum=result+result2;
        System.out.println(sum);
    }
}
