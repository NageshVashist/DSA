package com.practice;

public class RunlengthEncoding {
    public static void main(String[] args) {
        String encode ="wweseerrrrvfcccdddh";
        String result="";
        String decode="w2e1s1e2r4v1f1c3d3h1";

//        Encoding
        System.out.println("==============Encoding==============");
        System.out.println("String to encode:"+encode);
        int count=1;
        for(int i=0; i<encode.length();i++){
            if(i<encode.length()-1&&encode.charAt(i)==encode.charAt(i+1)){
                count++;
            }
            else {
                result += encode.charAt(i) +""+ count;
                count=1;
            }
        }
        System.out.println(result);

//        Decoding
        System.out.println("==============Decoding==============");
        System.out.println("String to decode:"+decode);
//      String decode="w2e1s1e2r4v1f1c3d3h1";
        String numbers="123456789";
        result="";
        for(int i=0; i<decode.length();i++){
            if(numbers.contains(decode.charAt(i)+"")){
                int c=Integer.parseInt(decode.charAt(i)+"");
                while (c>0){
                    result+=decode.charAt(i-1);
                    c--;
                }
            }

        }
        System.out.println(result);
    }
}
