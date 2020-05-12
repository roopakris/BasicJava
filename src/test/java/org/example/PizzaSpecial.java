package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PizzaSpecial  {



   public void pizzSpecialOrder(){
    //public static void main(String[] args )  {

        String name;

        Scanner input = new Scanner(System.in);

        Pizza obj1= new Pizza("Golden Veggie special",12.0,500);
        Pizza obj2= new Pizza("Juicy Chicken special",16.0,800);
        Pizza obj3= new Pizza("Cream Stuffed Garden Party",19.0,1000);
        Pizza obj4= new Pizza("Macroni cheese special",22.0,1500);
        Pizza obj5= new Pizza("Bangalore veg special",22.0,1500);



        ArrayList<Pizza> list = new ArrayList<Pizza>();
        list.add(obj1);
        list.add(obj2);
        list.add(obj3);
        list.add(obj4);
        list.add(obj5);

       Collections.sort(list);
        System.out.println("Our PizzaSpecial Latest pizza menu is here");
        for(Pizza p:list){

            System.out.println(p.getName()+" |price - "+p.getPrice()+" |calories- "+p.getCalories());
            System.out.println("---------------------------------------------");
        }


        System.out.println("Enter your Choice of pizza to order");
        name=input.nextLine();
        for(int i=0; i<list.size();i++)
            if(list.get(i).getName().contains(name)){
                System.out.println("***********You have ordered********************");
                System.out.println(list.get(i).getName()+", "+"price :"+list.get(i).getPrice()+", "+"Calories :"+list.get(i).getCalories());
                System.out.println("Your order will ready soon to collect");
            }
        //System.out.println("You have entered wrong name");

    }


  }


