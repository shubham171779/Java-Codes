package com.company;

import java.util.Scanner;

public class NisExactMultipleOfM {

static int prod(int a,int b)
{
    if(b%a==0)
    {
        return 2;
    }
    else if(b==0 || a==0)
    {
        return 3;
    }
    else{
        return 1;
    }
}
    public static void main(String[] args) {
        int number1, number2, result;
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        number1 = Math.abs(number1);
        number2 = Math.abs(number2);
        result = prod(number1, number2);
        System.out.println(result);

    }
}
