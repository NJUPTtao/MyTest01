package com.test;

/**
 * ClassName:Test5_nine_nine_table
 * Package:com.test
 * Description:九九乘法表
 * Author:陶牛柱
 * Create:2024/2/26 - 下午 4:48
 */
public class Test5_nine_nine_table {
    public static void main(String[] args) {
        for (int i = 1;i <= 9;i++) {
            for (int j = 1;j <=i;j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + " ");
            }
            System.out.println();
        }
    }
}
