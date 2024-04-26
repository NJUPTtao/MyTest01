package com.test;

import java.util.Scanner;

/**
 * ClassName:Test4_diamond
 * Package:com.test
 * Description:；菱形
 * Author:陶牛柱
 * Create:2024/2/26 - 下午 3:56
 */
public class Test4_diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个奇数：");
        int line_num =scan.nextInt();

        int up_line = line_num / 2 + 1;
        int under_line = line_num - up_line;

        for (int i = 1;i <= up_line;i++) {
            for (int j = 1;j <= up_line - i;j++) {
                System.out.print(" ");
            }
            for (int k = 0;k < 2 *  i - 1;k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1;i <=under_line;i++) {
            for (int j = 1;j <= i;j++) {
                System.out.print(" ");
            }
            for (int l = 0;l < 2 * (under_line - i) + 1;l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
