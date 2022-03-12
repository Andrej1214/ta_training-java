package com.epam.training.Andrej_Paulau.fundamental.main_task;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HelloName {
    public static void main(String[] args) {
        String str = "Hello, " + Arrays.toString(args) + "!";
        Pattern pattern = Pattern.compile("(\\[|\\])");
        Matcher matcher = pattern.matcher(str);
        String str1 = matcher.replaceAll("");
        System.out.println(str1);
    }
}
