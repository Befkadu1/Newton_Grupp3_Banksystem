/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newtonbank.sysjm2.grupp3;

import java.util.ArrayList;
import java.util.List;
import static newtonbank.sysjm2.grupp3.BankLogic.allCustomersArrayList;

/**
 *
 * @author Befkadu Degefa
 */
public class Test

{
    public static BankLogic bankLogic;
 
    public static List <Customer> arrayList = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        bankLogic = BankLogic.getInstance();
       
        allCustomersArrayList = new ArrayList<>();
        
        Customer customer1 = new Customer("AA1", 11 );
        Customer customer2 = new Customer("BB1", 22 );
        allCustomersArrayList.add(customer1);
        allCustomersArrayList.add(customer2);
        
        
        //Returns all allCustomersArrayList of the bank(Personal number and name)
        System.out.println(bankLogic.getCustomers());

        
        /*To get the information about the specific allCustomersArrayList after 
         entering the personal number, I added the balance and checked the AccountID*/

        customer1.custumerAccountsList.add(new SavingsAccount("Saving", 2));
        customer1.custumerAccountsList.get(0).setBalance(1000);
        customer1.custumerAccountsList.get(0).getAccountID();
        System.out.println("Customer 1 balance " + customer1.custumerAccountsList.get(0).getBalance());
        System.out.println("Customer 1 Account 1 ID " + customer1.custumerAccountsList.get(0).getAccountID());
       
        System.out.println(bankLogic.getCustomer(11));
        
        //Adding the customers, only if not exist in the system. 
        //Returns true if the allCustomersArrayList created
        System.out.println(bankLogic.addCustomer("DD", 33));
        System.out.println(bankLogic.getCustomers());  //print out the result after adding the customer
        
        //To change the customer name
        System.out.println("Is the name changed " + bankLogic.changeCustomerName("changed name", 22));
        System.out.println(bankLogic.getCustomers());
        System.out.println(bankLogic.addSavingsAccount(11));
        System.out.println(bankLogic.addSavingsAccount(11));
        //Removing a customer
        //System.out.println(bankLogic.removeCustomer(11));
        
        
       // System.out.println(bankLogic.addSavingsAccount(11));
        System.out.println(customer1.custumerAccountsList.size());
//        System.out.println("index 0 of customer 1 " + customer1.custumerAccountsList.get(2).getAccountID());
//        System.out.println("index 1 " + customer1.custumerAccountsList.get(1).getAccountID());

        //Testing getAccount
        System.out.println(bankLogic.getAccount(11, 1002));
        
        //Test deposit
        System.out.println(bankLogic.deposit(11, 1003, 100));
        
        //Test withdraw
        System.out.println(bankLogic.withdraw(11, 1003, 10));
        System.out.println(bankLogic.withdraw(11, 1003, 10));
        System.out.println(bankLogic.closeAccount(11, 1003));


       
    }
   
}