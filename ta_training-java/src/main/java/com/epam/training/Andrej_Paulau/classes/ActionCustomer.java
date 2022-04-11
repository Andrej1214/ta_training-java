package com.epam.training.Andrej_Paulau.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ActionCustomer {

    public List<Customer> orderItemByName(ArrayList<Customer> arrayList){
        NameCustomerComparator comparator = new NameCustomerComparator();
        Collections.sort(arrayList,comparator);
        return arrayList;
    }
    public List<Customer> issueCardNumberInterval(long fromValue,long toValue,ArrayList<Customer> arrayList){
        List<Customer> customerList = new ArrayList<>();
        for (Customer customer : arrayList){
            if ((customer.getCreditCardNumber()>fromValue)&&(customer.getCreditCardNumber()<toValue)){
                customerList.add(customer);
            }
        }
        return customerList;
    }
}
