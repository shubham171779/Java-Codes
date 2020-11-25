package com.company;
import java.util.*;
public class Bubblesort
{
    static int[] bubblesort(int a[])
    {
        int temp=0,flag,count=0;
        for(int i=0;i<a.length;i++)
        {
            flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                    count++;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        System.out.println("no. of swaps:"+count);
        return a;
    }
    static String[] bubblesort(String a[])
    {
        int flag,count=0;
        String temp="";
        for(int i=0;i<a.length;i++)
        {
            flag=0;
            for(int j=0;j<a.length-1-i;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                    count++;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
        System.out.println("no. of swaps:"+count);
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        arr=bubblesort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        String str[]=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        str=bubblesort(str);
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }
    }
}
