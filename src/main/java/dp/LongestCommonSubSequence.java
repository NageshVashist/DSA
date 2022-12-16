package dp;

public class LongestCommonSubSequence {
    public static void main(String[] args) {
        String s1 = "asedcvcvbnageshvashistnbrtgyhuj";
        String s2 = "asedcveruisdnageshvashistujyhgmkliv";

        int s1arr[][] = new int[s1.length() + 1][s2.length() + 1];
        int max=0;
        for (int i = 1; i < s1arr.length; i++) {
            for (int j = 1; j < s1arr[0].length; j++) {

                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    s1arr[i][j]=s1arr[i-1][j-1]+1;
                }
                if(s1arr[i][j]>max){
                    max= s1arr[i][j];
                }
            }
        }

        System.out.println(max);
    }
}
