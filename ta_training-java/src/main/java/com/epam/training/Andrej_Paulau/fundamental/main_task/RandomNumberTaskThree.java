package com.epam.training.Andrej_Paulau.fundamental.main_task;

import java.util.Random;

// Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
public class RandomNumberTaskThree {
    private static  Random random = new Random();
    public static void main(String[] args) {
        if(args.length > 0) {
            int maxBorder = 100;
            int lengthMas = Integer.valueOf(args[0]);
            int[] mas = new int[lengthMas];
            for (int i = 0; i < mas.length; i++) {
                mas[i] = random.nextInt(maxBorder);
            }
            for (int i = 0; i < mas.length; i++) {
                System.out.print(mas[i] + " ");
            }
            System.out.println("\n------------------------");
            for (int i = 0; i < mas.length; i++) {
                System.out.println(mas[i]);
            }
        }
    }
}
