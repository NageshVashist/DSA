package com.practice;

import java.util.Stack;

public class FindMaxValueInStack {
    public static Stack mainStack= new Stack();
    public static Stack maxStack = new Stack();

    public static void main(String[] args) {
        push(5);
        push(8);
        push(11);
        push(7);
        push(4);

        System.out.println("Max:"+getMax());

        while(!maxStack.isEmpty()){
            System.out.println("Max:"+getMax());
            System.out.println(pop());
        }
    }

    public static int pop(){
        maxStack.pop();
        return (int) mainStack.pop();
    }
    public static void push(int val ){
        mainStack.push(val);
        if(maxStack.isEmpty()){
            maxStack.push(val);
        }
        else if (val > (int) maxStack.peek()) {
            maxStack.push(val);
        }
        else{
            maxStack.push(maxStack.peek());
        }
    }

    public static int getMax(){
        return (int) maxStack.peek();
    }

}
