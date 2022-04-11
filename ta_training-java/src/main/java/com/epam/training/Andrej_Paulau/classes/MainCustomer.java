package com.epam.training.Andrej_Paulau.classes;

import java.util.ArrayList;

public class MainCustomer {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1,"Alex","Rogov","Viktorovicn",1234_3456_7654_1234L);
        Customer customer2 = new Customer(2,"Nick","Grin","Jonson",1034_3476_2354_1957L);
        Customer customer3 = new Customer(3,"Mike","Volt","Adamson",7890_6756_3424_6789L);
        ActionCustomer actionCustomer = new ActionCustomer();
        ArrayList<Customer> arrayList = new ArrayList<>();
        arrayList.add(customer1);
        arrayList.add(customer2);
        arrayList.add(customer3);
        System.out.println(actionCustomer.orderItemByName(arrayList));
        System.out.println(actionCustomer.issueCardNumberInterval(1234_3456_1111_1111L,8990_3456_7654_1115L,arrayList));

    }

}
