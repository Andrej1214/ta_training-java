package com.epam.training.Andrej_Paulau.fundamental.main_task;

import java.util.Arrays;

public class ReverseInputOrder {
    public static void main(String[] args) {
        for (int i = args.length-1; i >= 0; i--) {
            System.out.print(args[i] + " ");
        }
    }
}
