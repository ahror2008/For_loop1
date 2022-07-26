package com.company;

public class MAin1 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i==1||i==n||j==n-i+1){
                    System.out.print("z"+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
