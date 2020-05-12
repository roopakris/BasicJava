package org.example;

import java.util.Scanner;

public class MortgageCalculator {
    long mortgareamount;
    double formula;

    Scanner input = new Scanner(System.in);

    public void knowyourinstallments(){
        System.out.println("Enter Mortgage amount to know your monthly installments");
        mortgareamount= input.nextLong();
        formula=((mortgareamount*1.5)/(25*12));
        System.out.println("your monthly installments is :"+formula);


    }
}
