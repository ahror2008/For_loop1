package com.company;

public class Main2 {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1-n; i <n ; i++) {
            for (int j = 1-n; j <n ; j++) {
                if (Math.abs(i)>Math.abs(j)){
                    System.out.printf("%2d",Math.abs(i)+1);
                }else {
                    System.out.printf("%2d",Math.abs(j)+1);
                }
            }
            System.out.println();
        }


    }
}
