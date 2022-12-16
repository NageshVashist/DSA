package com.leetcode.level_1;

public class MultiplyNumbersWithoutUsingOperator {
    public static void main(String[] args) {
        int a=50,b=20;
        if(a>b){
            a=a+b;
            b=a-b;
            a=a-b;
        }

        int res=0;
        while(a>0){
            res+=b;
            a--;
        }

        System.out.println(res);
        System.out.println( russianPeasant(20,50));
    }
    static int russianPeasant(int a, int b)
    {
        // initialize result
        int res = 0;
        int i =1;
        // While second number doesn't become 1
        while (b > 0)
        {
            i++;
            // If second number becomes odd,
            // add the first number to result
            if ((b & 1) != 0)
                res = res + a;

            // Double the first number
            // and halve the second number
            a = a << 1;
            b = b >> 1;
        }

        return res;
    }
}
