package com.test;

import java.util.Scanner;

/**
 * ClassName:Test3_while_true
 * Package:com.test
 * Description:
 * Author:陶牛柱
 * Create:2024/2/26 - 下午 1:31
 */
public class Test3_while_true {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        int p_count = 0;
        int n_count = 0;
        while (flag) {
            int i = scan.nextInt();
            if (i > 0) {
                p_count++;
            }
            else if(i < 0) {
                n_count++;
            }
            else {
                flag = false;
            }
        }
        System.out.println("正数个数："+p_count);
        System.out.println("负数个数："+n_count);
    }
}
