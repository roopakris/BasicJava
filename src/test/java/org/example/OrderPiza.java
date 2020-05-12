package org.example;

import org.junit.Test;

import java.util.Scanner;

public class OrderPiza  {

    public static void main(String[] args){

        int name;
        PizzaDeluxe oder1 = new PizzaDeluxe();
        PizzaSpecial order = new PizzaSpecial();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter which Pizza you want to odrder");
        System.out.println("Enter 1 for Deluxe Pizzas");
        System.out.println("Enter 2 for Special Pizzas");

        name = input.nextInt();

        switch (name){
            case 1:
                oder1.orderPizzaDeluxe();
                break;
            case 2:
                order.pizzSpecialOrder();
                break;



        }





    }





}

