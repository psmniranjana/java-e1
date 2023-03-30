/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;


class Customer {
   //add all necessary attributes here
   
       String firstName;
       String secondName;
       int age;
       int roomNumber;
   public void saveCustomerInfo() {
        System.out.println("First name: " + firstName);
       System.out.println("Second name: " + secondName);
       System.out.println("Age: " + age);
       System.out.println("Room number: " + roomNumber);
   }
   }
  
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner read = new Scanner(System.in);
       String firstName = read.nextLine();
       String secondName = read.nextLine();
       int age = read.nextInt();
       int roomNumber = read.nextInt();
       Customer customer = new Customer();
       //set customer's data to object here
       
      customer.firstName = firstName;
      customer.secondName = secondName;
      customer.age = age; 
      customer.roomNumber = roomNumber;
       customer.saveCustomerInfo();
    }
    
}
