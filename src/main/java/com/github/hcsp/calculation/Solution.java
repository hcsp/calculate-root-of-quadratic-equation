package com.github.hcsp.calculation;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(new double[] {(-3)/(2*1)}));
        System.out.println("x^2-2x+1=0的解是：" + Arrays.toString(calculate(1, -2, 1)));
        System.out.println("x^2-4=0的解是：" + Arrays.toString(calculate(1, 0, -4)));
        System.out.println("x^2+1=0的解是：" + Arrays.toString(calculate(1, 0, 1)));
    }

    // 计算一元二次方程ax^2+bx+c=0的根。
    // 若有两个根，返回一个数组，包含这两个根，即：new double[] { root1, root2 }
    // 若有一个根，返回一个数组，包含这个根，即：n返回new double[] { root }
    // 若没有根，返回一个空数组，即：new double[] {}
    // 提示，你可利用求根公式x=[-b±√(b²-4ac)]/2a
    // 需要执行开方运算时可使用Math.sqrt()方法
    public static double[] calculate(int a, int b, int c) {
        int delta = b * b - 4 * a * c;
        if (delta > 0) {
            return new double[]{
                    //Math.sqrt(delta))返回double类型，前面就没必要强制类型转换成double类
//                    (double) (-b + Math.sqrt(delta)) / (2 * a), (double) (-b - Math.sqrt(delta)) / (2 * a)
                (-b + Math.sqrt(delta)) / (2 * a), (-b - Math.sqrt(delta)) / (2 * a)
            };
        } else if (delta == 0) {
            //定义了double类型的数组，里面就没必要强制类型转换
//            return new double[] {(double)(-b)/(2*a)};
            return new double[] {(double)(-b)/(2*a)};
        } else {
            return new double[] {};
        }
    }
}
