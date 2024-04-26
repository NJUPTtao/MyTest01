package com.test;

/**
 * ClassName:Test2_do_while
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/25 - 下午 4:11
 */
public class Test2_do_while {
    public static void main(String[] args) {
        int i = 2;
        int num = 0;
        int count = 0;
        do {
            if (i % 2 == 0) {
                System.out.println(i);
                count++;
                num += i;
            }
            i++;
        }while (i <= 100);
        System.out.println("------");
        System.out.println(num);
        System.out.println(count);
    }
}
