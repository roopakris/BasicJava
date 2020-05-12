package org.example;

import java.util.Scanner;

public class Calculator {




    void numbers(){
        int option;
        double num1;
        double num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Calculator ");

        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Exit");

        //System.out.println("Your Numbers : "+num1+""+num2);

        do{
            System.out.println("Enter your option 1 to 4 or 5 to exit");
            option= input.nextInt();

            switch (option){

                case 1:
                    System.out.println("Addtion of two numbers");
                    System.out.println("Enter two number that you want to perform");
                    num1 =input.nextDouble();
                    num2=input.nextDouble();

                    System.out.println("sum of 2 numbers is "+(num1+num2));
                    break;
                case 2:
                    System.out.println("Subtraction of two number");
                    System.out.println("Enter two number that you want to perform");
                    num1 =input.nextDouble();
                    num2=input.nextDouble();
                    System.out.println("difference of 2 numbers is "+(num1-num2));
                    break;
                case 3:
                    System.out.println("diviosn");
                    System.out.println("Enter two number that you want to perform");
                    num1 =input.nextDouble();
                    num2=input.nextDouble();
                    System.out.println("division of 2 numbers "+(num1%num2));
                    break;
                case 4:
                    System.out.println("Multiplication");
                    System.out.println("Enter two number that you want to perform");
                    num1 =input.nextDouble();
                    num2=input.nextDouble();
                    System.out.println("multiplication of 2 numbers "+(num1*num2));
                    break;



            }


        }while(option !=5);

        System.out.println("Thank you for using calculator program");

    }

}
