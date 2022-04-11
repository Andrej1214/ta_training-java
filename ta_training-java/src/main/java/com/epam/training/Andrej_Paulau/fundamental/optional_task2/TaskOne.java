package com.epam.training.Andrej_Paulau.fundamental.optional_task2;

import java.util.Random;
import java.util.Scanner;

public class TaskOne {
    private static Random random = new Random();
    //Ввести с консоли n - размерность матрицы a [n] [n].
    // Задать значения элементов матрицы в интервале значений от -M до M с помощью генератора случайных чисел (класс Random).
    // Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число(размерность матрицы): ");
        while (!scanner.hasNextInt()){
            scanner.next();
            System.out.println("Введите целое число");
        }
        int sizeMatrix = scanner.nextInt();
        System.out.println(sizeMatrix);
        scanner.close();
        int value = 100;
        int [] [] mas = new int[sizeMatrix][sizeMatrix];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                mas[i][j] = 2 * random.nextInt(value) - value;
            }
        }
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas.length; j++) {
                System.out.printf( "[%3d]", mas[i][j]);
            }
            System.out.println();
        }

        boolean firstPositiveNumber = false;
        boolean secondPositiveNumber = false;
        for (int i = 0; i < mas.length; i++) {
            int rez = 0;
            for (int j = 0; j < mas.length-1; j++) {
                    boolean b1 = mas[i][j] > 0;
                    boolean b3 = mas[i][j] < 0;
                    boolean b4 = mas[i][j+1] > 0;
                    boolean b2 = mas[i][j+1] < 0;

                    boolean b5 = b1&&b2;
                    boolean b6neg = b2&&b3;
                    boolean b7 = b3&&b4;
                    boolean b8 = b1&&b4;
                if (b5) {
                    firstPositiveNumber = true;
                }
                if(firstPositiveNumber&&b7){
                    secondPositiveNumber = true;
                }
                if((b6neg &&firstPositiveNumber)||(b7&&firstPositiveNumber)&&(secondPositiveNumber==false)){
                    rez += mas[i][j];
                }


                if (j==mas.length){
                    firstPositiveNumber = false;
                    secondPositiveNumber = false;
                }
                if((j==mas.length)&&(secondPositiveNumber==false)){
                    rez = 0;
                }

                }
            System.out.println("В строке "+(i+1)+" rez= " + rez);

            }
        }
    }

