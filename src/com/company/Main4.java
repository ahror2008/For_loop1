package com.company;

public class Main4 {
    public static void main(String[] args) {
        int n=10;

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                if (i+j>=n+1){
                    System.out.print("1");
                }else {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
    }
}
