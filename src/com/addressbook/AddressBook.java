package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Person> addressbook = new ArrayList<Person>();

    public ArrayList<Person> addContact(Person person) {
        this.addressbook.add(person);
        return addressbook;

    }


    public void deleteContact(String name) {
        /*
        Searching the person in the addressbook using for eachloop if found then delete the contact

         */
        Person findPerson = null;
        for (Person person : this.addressbook) {
            if (person.getFirstName().equals(name)) {
                findPerson = person;
            }
        }
        if (findPerson == null) {
            System.out.println("Name not found in the list");
        } else {
            addressbook.remove(findPerson);
        }
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

