package com.practice;

import java.util.Stack;

public class FindMinValueInStack {
    public static Stack<Integer> stack = new Stack<>();
    public static Integer min;
    public static void main(String[] args) {
        push(5);
        push(8);
        push(2);
        push(7);
        push(4);

        System.out.println("Min:"+getMin());

        while(!stack.isEmpty()){
            System.out.println(pop());
            System.out.println("Min:"+getMin());
        }

    }

    public static void push(Integer a){
        if(stack.isEmpty()){
            stack.push(a);
            min=a;
        }
        else{
            if(a<min){
                int x=2*a-min;
                stack.push(x);
                min=a;
            }
            else{
                stack.push(a);
            }
        }
    }

    public static Integer pop(){
        Integer k = stack.pop();
        if(k<min){
            int t=min;
            min=2 * min - k;

            return t;

        }
        else{
         return   k;
        }
    }

    public static Integer getMin(){
        return min;
    }
}
