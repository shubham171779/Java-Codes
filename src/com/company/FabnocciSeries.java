package com.company;

import java.util.Scanner;

public class FabnocciSeries
{
public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int a=0,b=1,sum=0;
    for(int i=0;i<num;i++)
    {
        System.out.println(a+ " ");
        sum=a+b;
        a=b;
        b=sum;
    }
}
}
