package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce45;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerName;
    private List<Double> transactions;

    public Customer(String customerName, double initialAmount) {
        this.customerName = customerName;
        this.transactions = new ArrayList<>();
        addTransaction(initialAmount);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getCustomerName() {
        return customerName;
    }

    public List<Double> getTransactions() {
        return transactions;
    }

}
