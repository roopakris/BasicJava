package org.example;

import java.util.Scanner;

public class Banks extends MortgageCalculator {

    long accountNumber;
    String accountName;
    int balance=500;
    //int previousTransaction;



    void deposit(int amount){
        if(amount !=0){
            balance=balance+amount;
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
    void bankMenu(String accountName, long accountNumber){
        char option='\0';
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Internet Banking "+accountName);
        System.out.println("Your Account Number : "+accountNumber);
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("E. Exit");

        do{
            System.out.println("Enter your option: ");
            option= input.next().charAt(0);

            switch (option){

                case 'A':
                    System.out.println("Balance = "+balance);
                    break;
                case 'B':
                    System.out.println("Enter amount to deposit");
                    int amount = input.nextInt();
                    deposit(amount);
                    System.out.println("Deposited amount is = "+amount);
                    System.out.println("Balance = "+balance);
                    break;
                case 'C':
                    System.out.println("Enter amount you want to withdraw");
                    int amount1= input.nextInt();
                    withdraw(amount1);

                    break;
                case 'E':
                    System.out.println("See you");
                    break;


            }


        }while(option !='E');

        System.out.println("**** Thank you hope you have enjoyed our services");

    }



}
