package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PizzaDeluxe {

    public void orderPizzaDeluxe() {

        String name;
        Scanner input = new Scanner(System.in);

        Pizza obj1 = new Pizza("Veggie Deluxe", 10.0, 500);
        Pizza obj2 = new Pizza("Chicken Deluxe", 15.0, 800);
        Pizza obj3 = new Pizza("Stuffed Garden Party", 18.0, 650);
        Pizza obj4 = new Pizza("Cheese Deluxe", 19.0, 1000);
        Pizza obj5 = new Pizza("Mozerlla Deluxe", 16.0, 1500);
        Pizza obj6 = new Pizza("Greek Stlye Deluxe", 17.0, 1400);
        Pizza obj7 = new Pizza("SweetCorn Deluxe", 22.0, 1000);
        Pizza obj8 = new Pizza("Pinapple Deluxe", 20.0, 1300);

        ArrayList<Pizza> list = new ArrayList<Pizza>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);
        list.add(obj6);
        list.add(obj7);
        list.add(obj8);

        Collections.sort(list);

        System.out.println("Pizza Deluxe Latest Pizza Menu is here");
        System.out.println("______________________________________________");
        System.out.println("________ D E L U X E _____ P I Z Z A S _______");
        for (Pizza p : list) {
            System.out.println((list.indexOf(p) + 1) + ". " + p.getName() + " | " + p.getPrice() + " | " + p.getCalories());
        }
        System.out.println("______________________________________________");
        /////////////////

        System.out.println("Enter your Choice of pizza to order");
        name = input.nextLine();
        for (int i = 0; i < list.size(); i++)
            if (list.get(i).getName().contains(name)) {
                System.out.println("\n__________________________________________");
                System.out.println("***** You have ordered ***** ");
                System.out.println(list.get(i).getName().toUpperCase() + " -- " + "Price: " + list.get(i).getPrice() + " -- " + "Calories: " + list.get(i).getCalories());
                System.out.println("Your order will be ready soon to collect");
                System.out.println("__________________________________________");
            }


    }


}


