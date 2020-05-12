package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayingWithNumbers {

    public static void main(String[] args){

        generatingNumbers1TO10AndSum();

        multiplicatioTable();

        reverseInoutnumber();

        graterAndSmaller();

        evenAndOddnumbers();

        postiveNegativeZeroNumber();

        findGrades();


    }

    public static void generatingNumbers1TO10AndSum(){
        int i=1;
        int sum=0;

        while (i<=10){
            System.out.print(i+" ");

            sum = sum+i;


            i=i+1;



        }
        System.out.println(" ");
        System.out.println("SumofNumbers from 1 to 10 is :"+sum);
    }

    public static void multiplicatioTable(){
        System.out.println("Multiplication Table of 5 is");
        for(int i=1;i<=10;i++){
            System.out.println("5"+"X"+i+"="+5*i);
        }
    }

    public static void reverseInoutnumber(){
        int reversed=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number that you want to reverse");
        int i = input.nextInt();

        while(i !=0){
            int digit = i % 10;
            reversed = reversed * 10 + digit;
            i /= 10;
        }

        System.out.println("Reverse of this is "+reversed);

    }

    public static void graterAndSmaller(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number first number of three ToFind Greater and smaller");
        int i = input.nextInt();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Number Second number of three ToFind Greater and smaller");
        int i2 = input2.nextInt();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Number Third number of three ToFind Greater and smaller");
        int i3 = input3.nextInt();
        if(i<i2 & i<i3){
            System.out.println("smallest is "+i);
        }
        else if(i2<i3){
            System.out.println("smallest is "+i2);
        }
        else {
            System.out.println("smallest is "+i3);
        }


        if(i>=i2 & i>=i3){
            System.out.println("grater number is :"+i);
        }
        else if(i2>=i3){
            System.out.println("Grater number is :"+i2);
        }
        else {
            System.out.println("Grater number is :"+i3);
        }


    }

    public static void evenAndOddnumbers(){
        ArrayList<Integer> evenNumber = new ArrayList();
        ArrayList<Integer> oddNumber = new ArrayList();

        for(int i=1;i<=20;i++){
            if (i % 2 ==0){
                evenNumber.add(i);
            }

            else {
                oddNumber.add(i);
            }

            if (i== 20) {
                System.out.println("Even Numbers: "+evenNumber);
                System.out.println("Odd Numbers: "+oddNumber);
            }

        }


    }

    public static void postiveNegativeZeroNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number to Check number is Zero,Positive or Negative");
        int n= input.nextInt();

        if(n>0){
            System.out.println("Number is positve :"+n);
        }
        else if(n==0){
            System.out.println("Number is zero :"+n);
        }
        else {
            System.out.println("Number is negative :"+n);
        }
    }

    public static void findGrades(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the TEST SCORE TO CHECK WHICH GRADE YOU HAVE ACHIEVED");
        int n= input.nextInt();
        if(n>=90){
            System.out.println("You have achieved **A Grade** "+n);
        }
        else if (n>=80){
            System.out.println("You have achieved **B Grade** "+n);


        }
        else if(n>=70){
            System.out.println("You have achieved **C Grade** "+n);

        }
        else {
            System.out.println("You have achieved **D Grade** "+n);
        }

    }


}
