package com.test;

/**
 * ClassName:Test6_prime_number
 * Package:com.test
 * Description:质数
 * Author:陶牛柱
 * Create:2024/2/26 - 下午 6:50
 */
public class Test6_prime_number {
    public static void main(String[] args) {
        int k = 1;
        long start = System.currentTimeMillis();
        for (int i = 2;i <= 10000;i++) {
            for (int j = 2;j <= Math.sqrt(i);j++) { //优化二
                if (i % j == 0) {
                    k = 0;
                    break; //优化一
                }
            }
            if (k == 1) {
                System.out.println(i);
            }
            k = 1;
        }
        long end = System.currentTimeMillis();
        System.out.println("花费时间为："+(end - start));
    }
}
