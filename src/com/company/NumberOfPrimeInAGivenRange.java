package com.company;

import java.util.*;

public class NumberOfPrimeInAGivenRange
{
    public static int primeCount(int x,int y)
    {
        int count,prime=0;
        for(int i=x;i<=y;i++)
        {
            count=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    count=1;
                    break;
                }
            }
            if(count==0)
            {
                prime++;
            }
        }
        return prime;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start of the range:");
        int start=sc.nextInt();
        System.out.println("Enter end of the range:");
        int end=sc.nextInt();
       int result=primeCount(start,end);
       System.out.println("No. of prime between "+start+" and "+end+" is: "+result);
    }
}
