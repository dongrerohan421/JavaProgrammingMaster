package com.section8_arrays_javainbuiltlists_autoboxing_unboxing.ce45;

public class BankingApplication {

    private static final String CHARLOTTE_BRANCH = "Charlotte";
    private static final String SYDNEY_BRANCH = "Sydney";

    public static void main(String[] args) {
        Bank bank = new Bank("Chase");

        if (bank.addBranch(CHARLOTTE_BRANCH)) {
            System.out.println(CHARLOTTE_BRANCH + " branch created.");
        }

        bank.addCustomer(CHARLOTTE_BRANCH, "Tim", 50.05);
        bank.addCustomer(CHARLOTTE_BRANCH, "Mike", 174.34);
        bank.addCustomer(CHARLOTTE_BRANCH, "Percy", 220.12);

        bank.addBranch(SYDNEY_BRANCH);
        bank.addCustomer(SYDNEY_BRANCH, "Bob", 150.54);

        bank.addCustomer(CHARLOTTE_BRANCH, "Tim", 44.22);
        bank.addCustomer(CHARLOTTE_BRANCH, "Tim", 12.44);
        bank.addCustomer(CHARLOTTE_BRANCH, "Mike", 1.65);

        bank.listCustomers(CHARLOTTE_BRANCH, true);
        bank.listCustomers(SYDNEY_BRANCH, false);

        bank.addBranch("Melbourne");

        if (!bank.addCustomer("Melbourne", "Brian", 5.53)) {
            System.out.println("Error Melbourne branch does not exist.");
        }

        if (!bank.addBranch(CHARLOTTE_BRANCH)) {
            System.out.println(CHARLOTTE_BRANCH + " branch already exist.");
        }

        if (!bank.addCustomerTransaction(CHARLOTTE_BRANCH, "Fergus", 52.33)) {
            System.out.println("Customer does not exist at " + CHARLOTTE_BRANCH);
        }

        if (!bank.addCustomer(CHARLOTTE_BRANCH, "Tim", 12.21)) {
            System.out.println("Customer Tim already exist.");
        }
    }
}
