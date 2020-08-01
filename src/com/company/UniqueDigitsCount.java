package com.company;
import java.util.*;
public class UniqueDigitsCount
{
    public static int digitCount(int n)
    {
        int arr[]=new int[20];
        int k=1,a=0;
        while(n>0)
        {
            int res=n%10;
            arr[k]=res;
            n=n/10;
            k++;
        }
        for(int i=1;i<k;i++)
        {
            int count=0;
            for(int j=i+1;j<k;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[i]=0;
                }

            }
            if(count==0)
            {
                a++;
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=digitCount(num);
        System.out.println(result);
    }
}
