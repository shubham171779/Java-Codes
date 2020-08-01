
package com.company;

import java.util.Scanner;

public class EvenOddDigitSum
{
    static int reverse(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev=(rev*10)+(n%10);
            n=n/10;
        }
        return rev;
    }
    public static void calculate(int x1)
    { int even=0,odd=0;
        int count=0;
        int a=0;
        int x=reverse(x1);
        while(x>0)
        {
            a=x%10;
            count++;
            if(count%2==0)
            {
                even=even+a;
            }
            else
            {
                odd=odd+a;
            }
            x=x/10;
        }
        System.out.println("Sum of odd digits:"+ odd);
        System.out.println("Sum of even digits:"+ even);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        calculate(num);
    }
}
