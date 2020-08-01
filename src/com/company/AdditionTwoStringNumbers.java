//DO NOT USE BigInteger class
//BigInteger class ka object bnake usme string pass krke fr objects add krke ho jata yeh code but BigInteger use nhi krna h
package com.company;

public class AdditionTwoStringNumbers
{
    public static String addition(String input1,String input2)
    {
        int carry=0;
        String result="";
        int i1=input1.length();
        int i2=input2.length();
        int sum=0;
        if(i1>=i2)
        {
            for(int i=input2.length()-1;i>=0;i--)
            {
                sum=input1.charAt(i1-1)+input2.charAt(i2-1)-96+carry;//carry can be converted into integer so -96
                if(sum>9)
                {
                    carry=1;
                    sum%=10;
                }
                else
                {
                    carry=0;
                }
                result=result+sum;
                i2--;
            }
        }
        return result;
    }

}
