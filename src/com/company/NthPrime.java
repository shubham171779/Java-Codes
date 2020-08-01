//error
package com.company;

import java.util.*;
import java.lang.*;

 class NthPrime
{
     static boolean isPrimeNum(int x)
    {
        for(int i=2;i<x/2;i++)
        {
            if(x%i==0)
            {
                return false;
            }
        }
        return true;
    }
     static int findNthPrime(int num)
    {
        int count=0;
        int number=2;
        int result=0;
        while(count!=num-1)
        {
            if (isPrimeNum(number)) {
                result = number;
                number++;
                count++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int pos1;
        pos1=sc.nextInt();
       // System.out.println(pos);
        int ans=findNthPrime(pos1);
        System.out.println(ans);
    }
}
