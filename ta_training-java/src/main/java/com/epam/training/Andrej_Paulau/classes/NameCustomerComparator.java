package com.epam.training.Andrej_Paulau.classes;

import java.util.Comparator;

public class NameCustomerComparator implements Comparator<Customer> {

    @Override
    public int compare(Customer o1, Customer o2) {
        String str1 = o1.getName();
        String str2 = o2.getName();
        return str1.compareTo(str2);
    }
}
