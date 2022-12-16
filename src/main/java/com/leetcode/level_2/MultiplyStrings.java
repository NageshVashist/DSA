package com.leetcode.level_2;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
//        56088
    }

    public static String multiply(String num1, String num2) {
        int a = num1.length();
        int b = num2.length();
        int p[] = new int[a + b];
        for (int i = a - 1; i >= 0; i--) {
            for (int j = b - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + p[p2];
                p[p1] += sum / 10;
                p[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int s : p) {
            if (!(sb.length() == 0 && s == 0)) {
                sb.append(s);
            }

        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
}
