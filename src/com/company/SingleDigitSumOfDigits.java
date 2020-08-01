package com.company;

import java.util.*;

public class SingleDigitSumOfDigits
{
    public static int singleDigitSum(int y)
    {
        int r=0,sum=0;
        while(y>0)
        {
            r=y%10;
            sum=sum+r;
            y=y/10;
        }
        if(sum>9)
        {
            sum=singleDigitSum(sum);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int res=singleDigitSum(num);
        System.out.println("Single digit sum of "+num+ " is: "+res);
    }
}
