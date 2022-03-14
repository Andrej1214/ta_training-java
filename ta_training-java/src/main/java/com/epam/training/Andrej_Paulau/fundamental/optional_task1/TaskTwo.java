package com.epam.training.Andrej_Paulau.fundamental.optional_task1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskTwo {
    // Вывести числа в порядке возрастания (убывания) значений их длины.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите числа через пробел: ");
        String[] masString;
        String input = "";
        input += scanner.nextLine();
        scanner.close();
        masString = input.split("\\s+");
        for (int i = 0; i < masString.length; i++) {
            if (masString[i].matches("(-?)(\\d*)\\.?(\\d+)")) {
                list.add(masString[i]);
            }
        }
        System.out.println("-----------------------------------");
        int counter = 0;
        int maxLength = findMaxLengthNumber(list);
        System.out.println("Числа в порядке возрастания длинны:");
        while (counter <= maxLength) {
            for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).length() == counter) {
                        System.out.print(list.get(i) + " ");
                    }
            }
            counter++;
        }
    }

    private static int findMaxLengthNumber(ArrayList<String> list){
        int maxLengthNumber = 0;
        for (String str : list) {
            if (maxLengthNumber < str.length()){
                maxLengthNumber = str.length();
            }
        }
        return maxLengthNumber;
    }
}
