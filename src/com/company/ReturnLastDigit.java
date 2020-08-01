package com.company;

import java.util.Scanner;

public class ReturnLastDigit
{
    public static void main(String[] args)
    {
        int number,result;
        Scanner sc=new Scanner(System.in);
        number=sc.nextInt();
        result=number%10;
        System.out.println(result);
    }
}
