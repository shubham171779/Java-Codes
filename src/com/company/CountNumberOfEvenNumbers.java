package com.company;

import java.util.Scanner;

public class CountNumberOfEvenNumbers
{
    public static void main(String[] args) {
        int result,count=0;
        int arr[]=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%2==0)
            {
                count++;
            }
        }

        System.out.println(count);

    }
}
