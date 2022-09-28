package com.addressbook;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Person> addressbook = new ArrayList<Person>();

    public ArrayList<Person> createContact(Person person) {
        this.addressbook.add(person);
        return this.addressbook;
    }

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

