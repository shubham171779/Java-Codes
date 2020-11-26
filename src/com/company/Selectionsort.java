package com.company;

import java.util.Scanner;

public class Selectionsort
{
    static int[] selectionsort(int a[])
    {
        int temp=0,count=0;
        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                    count++;
                }
            }

        }
        System.out.println("no. of swaps:"+count);
        return a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        arr = selectionsort(arr);
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}
