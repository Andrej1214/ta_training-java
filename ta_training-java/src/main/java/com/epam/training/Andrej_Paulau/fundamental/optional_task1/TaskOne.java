package com.epam.training.Andrej_Paulau.fundamental.optional_task1;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskOne {
    //Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.println("Введите целые числа через пробел: ");
        String[] masString;
        String input = "";
        input += scanner.nextLine();
        scanner.close();
        masString = input.split("\\s+");
        for (int i = 0; i < masString.length; i++) {
            if(masString[i].matches("(-?)(\\d*)\\.?(\\d+)")) {
                list.add(masString[i]);
            }
        }
        System.out.println("-----------------------------------");
        int maxLength = findMaxLengthNumber(list);
        ArrayList<String>arrayList = findNumberWithGivenLength(list,maxLength);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("LongestNumber is " + arrayList.get(i) + " with maxlength " + maxLength);
        }
        int minLength = findMinLengthNumber(list);
        ArrayList<String>arrayList2 = findNumberWithGivenLength(list,minLength);
        for (int i = 0; i < arrayList2.size(); i++) {
            System.out.println("ShortestNumber is " + arrayList2.get(i) + " with minlength " + minLength);
        }
    }
    private static int findMaxLengthNumber(ArrayList<String> list){
        int maxLengthNumber = 1;
        for (String str : list) {
            if (maxLengthNumber < str.length()){
                maxLengthNumber = str.length();
            }
        }
        return maxLengthNumber;
    }
    private static int findMinLengthNumber(ArrayList<String> list){
        int minLengthNumber = list.get(0).length();
        for (String str : list) {
            if (minLengthNumber > str.length()){
                minLengthNumber = str.length();
            }
        }
        return minLengthNumber;
    }
    private static ArrayList<String> findNumberWithGivenLength(ArrayList<String> list, int lengthNumber){
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == lengthNumber){
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
