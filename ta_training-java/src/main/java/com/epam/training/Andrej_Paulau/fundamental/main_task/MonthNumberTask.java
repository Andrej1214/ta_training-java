package com.epam.training.Andrej_Paulau.fundamental.main_task;

// Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу. Осуществить проверку корректности ввода чисел.
public class MonthNumberTask {
    public static void main( String[] args) {
        if(args.length>0){
           // String str = "12";
            if (args[0].matches("(\\D+)")) {
                System.out.println("Incorrect input. Write number from 1 to 12, please");
            }else{
                    int input  = Integer.parseInt(args[0]);
                    switch (input) {
                        case 1:
                            System.out.println("January");
                            break;
                        case 2:
                            System.out.println("February");
                            break;
                        case 3:
                            System.out.println("March");
                            break;
                        case 4:
                            System.out.println("April");
                            break;
                        case 5:
                            System.out.println("May");
                            break;
                        case 6:
                            System.out.println("June");
                            break;
                        case 7:
                            System.out.println("July");
                            break;
                        case 8:
                            System.out.println("August");
                            break;
                        case 9:
                            System.out.println("September");
                            break;
                        case 10:
                            System.out.println("October");
                            break;
                        case 11:
                            System.out.println("November");
                            break;
                        case 12:
                            System.out.println("December");
                            break;
                        default:
                            System.out.println("Incorrect input. Please, write number from 1 to 12");
                    }
                }

        }
    }
}
