package org.example;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BanksExtra {

    long accountNumber;
    String accountName;
    String bankName;
    long balance=500;
    char option= '\0';
    char option2='\0';
    //int previousTransaction;

    Scanner input = new Scanner(System.in);
    HashMap<Long, String> custNameAndAccountNumber = new HashMap<>();
    HashMap<String, Long> bankNameAndAccountNumber = new HashMap<>();

    void deposit(int amount) {
        if (amount != 0) {
            balance = balance + amount;
            //previousTransaction=amount;
        }
    }

    void withdraw(int amount1){
        if(amount1>balance){
            System.out.println("Your balance amount is less and you cannot wihdraw.");
        }else if(amount1 !=0){
            balance=balance-amount1;
            System.out.println("Balance after withdraw = "+balance);
            //previousTransaction= -amount;

        }


    }

    //---------------------------//
    //void addCustomertoBank(String bankName, long accountNumber, String accountName) {
    void addCustomertoBank() {

//        char option= '\0';
//        char option2='\0';

        Scanner input = new Scanner(System.in);
        System.out.println("Do you wish to create new customer (y/n)? ");
        option = input.nextLine().charAt(0);

        if (option=='y') {
            do {
                System.out.println("Enter name of the BANK = ");
                bankName = input.nextLine();

                System.out.println("Enter name of the customer = ");
                accountName = input.nextLine();

                System.out.println("Enter account number = ");
                accountNumber = input.nextLong();

                custNameAndAccountNumber.put(accountNumber,accountName);
                bankNameAndAccountNumber.put(bankName, accountNumber);

                System.out.println("Details of new customer: BANK=" + bankName + ", CustName=" + accountName + ", AccNum=" + accountNumber);
                System.out.println("\nDo you wish to add another customer (y/n)? ");
                option2 = input.next().charAt(0);

            } while (option2 == ('y'));
        }

    }


    public void modifycustomer(){
        System.out.println("DO you want to modify customer y/n");
        option = input.nextLine().charAt(0);
        if(option=='y')
        {
            System.out.println("Enter Bank name");

            String bankName= input.nextLine();
            System.out.println("Enter AccountNumber");
            long accountNumber= input.nextLong();
            System.out.println("Enter AccountName");
            String newAccountName=input.nextLine();

            modifyCustomertoBank(bankName, accountNumber,  newAccountName );
        }

    }


    void modifyCustomertoBank(String bankName, long accountNumber, String newAccountName) {
        if (bankNameAndAccountNumber.containsKey(bankName)) {
            if (custNameAndAccountNumber.containsKey(accountNumber)) {
                custNameAndAccountNumber.remove(accountNumber);
                custNameAndAccountNumber.put(accountNumber, newAccountName);
                System.out.println("Details of Updated customer are:  BANK=" + bankName + ", CustName=" + newAccountName + ", AccNum=" + accountNumber);
            }
        }
    }


    void bankAdminMenu(String bankName, String accountName, long accountNumber) {
        char option = '\0';
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Internet Banking ADMINISTRATION menu for " + bankName);
        System.out.println("Your Account Number : " + accountNumber);
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("E. Exit");

        do {
            System.out.println("Enter your option: ");
            option = input.next().charAt(0);

            switch (option) {

                case 'A':
                    System.out.println("Balance = " + balance);
                    break;
                case 'B':
                    System.out.println("Enter amount to deposit");
                    int amount = input.nextInt();
                    deposit(amount);
                    System.out.println("Deposited amount is = " + amount);
                    System.out.println("Balance = " + balance);
                    break;
                case 'C':
                    System.out.println("Enter amount you want to withdraw");
                    int amount1 = input.nextInt();
                    withdraw(amount1);

                    break;
                case 'E':
                    System.out.println("See you");
                    break;


            }


        } while (option != 'E');

        System.out.println("**** Thank you hope you have enjoyed our services");

    }

}
