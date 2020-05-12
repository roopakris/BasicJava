package org.example;

import org.junit.Test;

public class NewBank implements DummyBank{


    @Test
    public void addbalance(){


        deposit(900);

    }

    long balance=500;

    @Override
    public void deposit(int amount) {
        if(amount !=0){
            balance=balance+amount;
            System.out.println("your balance is "+balance);
            //previousTransaction=amount;


        }





        }
}



