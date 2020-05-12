package org.example;

public class Barclays {
    public static void main(String[] args){

       Banks obj = new Banks();
       BanksExtra banksExtra = new BanksExtra();

        banksExtra.bankAdminMenu("Barclays","roopa",80134);
        banksExtra.addCustomertoBank();
        banksExtra.modifycustomer();


    }
}
