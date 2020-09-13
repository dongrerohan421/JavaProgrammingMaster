package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce45;

import java.util.ArrayList;
import java.util.List;

public class Branch {

    private static final boolean FALSE = false;
    private static final boolean TRUE = true;
    private String branchName;
    private List<Customer> customers;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customers = new ArrayList<>();
    }

    public String getBranchName() {
        return branchName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return TRUE;
        }
        return FALSE;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return TRUE;
        }
        return FALSE;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getCustomerName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

}
