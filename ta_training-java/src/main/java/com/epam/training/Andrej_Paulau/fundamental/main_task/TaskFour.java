package com.epam.training.Andrej_Paulau.fundamental.main_task;

//Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.
public class TaskFour {
    public static void main(String[] args) {
        if(args.length>0) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);
            System.out.println("Sum = " + (x + y));
            System.out.println("Multiplication = " + (x * y));
        }
    }
}
