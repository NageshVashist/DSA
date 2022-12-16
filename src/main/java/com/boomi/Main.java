package com.boomi;
public class Main {
    public static void main(String[] args) {

        int []x = {0,1,2,3,3,5};
        int target=0;
        System.out.println( findNumber(x,target,0,x.length-1));

    }
    public static int findNumber(int x[],int target,int s,int e){

        if(x[s]==target){
            while(x[s]==target){
                s++;
            }
            return s;
        }
        if(x[e]==target){
            return e+1;
        }
        if(s+1==e){
            return -1;
        }
        else if(x[s]<target && s<e){
            s=(e+s)/2;
           s= findNumber(x,target,s,e);
        }
        else if(s<e){
            e=e/2;
           s=  findNumber(x,target,s,e);
        }

        return s;
    }

}
