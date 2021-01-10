package com.welson;

public class Test {
    public static void main(String[] args) {
        int[][][] arr = new int[100][100][100];
        long time = System.nanoTime();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                for (int k = 0; k < 100; k++) {
                    sum += arr[i][j][k];
                }
            }
        }
        System.out.println(System.nanoTime()-time);
    }
}
