package com.addressbook;

import java.util.ArrayList;
import java.util.LinkedList;

public class AddressBook {
    ArrayList<Person> addressbook = new ArrayList<Person>();

    /*
    Adding Contacts using addContact method in the arraylist of addressbook
     */
    public ArrayList<Person> addContact(Person person) {
        this.addressbook.add(person);
        return addressbook;

    }

        /*
        Printing method to print all the contacts in the list using for each loop
         */

    public void printAddressBook() {
        for (Person person : this.addressbook) {

            System.out.println("-----------------------------------------------------");
            System.out.println("First name = " + person.getFirstName());
            System.out.println("last name = " + person.getLastName());
            System.out.println("address = " + person.getAddress());
            System.out.println("city = " + person.getCity());
            System.out.println("state = " + person.getState());
            System.out.println("zip = " + person.getZip());
            System.out.println("phone number = " + person.getPhoneNumber());
            System.out.println("-----------------------------------------------------");
        }
    }
}


