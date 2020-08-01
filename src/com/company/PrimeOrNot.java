package com.company;
import java.util.Scanner;
public class PrimeOrNot {
    public static void main(String[] args) {
        int num,count=0;
        Scanner sc = new Scanner(System.in);
        num=sc.nextInt();
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                count=1;
                break;
            }
        }
        if(count==1)
        {
            System.out.println("Not a prime number");
        }
        else
        {
            System.out.println("It is a prime number");
        }
    }
}
