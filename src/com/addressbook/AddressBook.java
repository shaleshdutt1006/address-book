package com.addressbook;

import java.util.ArrayList;


public class AddressBook {

    ArrayList<Person> addressbook = new ArrayList<>();

    public ArrayList<Person> getAddressbook() {
        return addressbook;
    }

    public void setAddressbook(ArrayList<Person> addressbook) {
        this.addressbook = addressbook;
    }

    /*
        Adding Contacts using addContact method in the arraylist of address book and checking duplicates entry
        */
    public void addContact(Person person) {

        addressbook.add(person);
    }

    /*
    Printing method to print all the details in the list using for each loop
     */
//    }
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


