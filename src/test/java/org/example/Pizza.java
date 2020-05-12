package org.example;

public class Pizza implements Comparable<Pizza> {

    private double calories;
    private String name;
    private double price;
    private char size;


    public Pizza(String pizaType, double priceOfPizza, double caloriesOfPizza) {
        name = pizaType;
        calories = caloriesOfPizza;
        price = priceOfPizza;
    }


    public double getCalories() {

        return calories;
    }

    public void setCalories(double caloriesOfPizza) {
        calories = caloriesOfPizza;


    }

    public String getName() {

        return name;
    }


    public void setName(String pizaType) {
        name = pizaType;

    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double priceOfPizza) {
        price = priceOfPizza;


    }


    public void getPrice(char size) {
        switch (size) {

            case 'L':
                System.out.println("your chosen pizza price will be :" + name + " " + 2 * price);
            case 'M':
                System.out.println("your choosen piza price will be :" + name + " " + 1.5 * price);
            case 'S':
                System.out.println("your choosen will be :" + name + " " + price);


        }
    }

    ///******to Compare*********\\\\\
    @Override
    public int compareTo(Pizza compareToPizza) {
        return (int) (this.getPrice() - compareToPizza.getPrice());
    }
}

