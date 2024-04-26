package com.test;

/**
 * ClassName:Test1_while
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/25 - 下午 3:56
 */
public class Test1_while {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
