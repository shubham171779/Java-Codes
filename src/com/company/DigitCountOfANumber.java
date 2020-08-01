package com.company;

import java.util.Scanner;

public class DigitCountOfANumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int count=0;
        int a=0;
        while(number>0)
        {
            a=number%10;
            count++;
            number=number/10;
        }
        System.out.println(count);

    }
}
