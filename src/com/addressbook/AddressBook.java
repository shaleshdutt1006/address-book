package com.addressbook;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Person> addressbook = new ArrayList<Person>();

    /*
    Adding Contacts using addContact method in the arraylist of address book and checking duplicates entry
    */
    public void addContact(Person person) {

        addressbook.add(person);
    }


    public void search(String city) {
    /*
    Searching Contacts which are in same city using for-each loop if City matches with
    the existing person city then print it using print Address book Method
     */

        for (Person person1 : this.addressbook) {

            if (person1.getCity().equals(city)) {
                printAddressBook(person1);
            }

        }

    }

        /*
        Printing method to print all the details in the list using for each loop
         */

    public void printAddressBook(Person person) {

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



