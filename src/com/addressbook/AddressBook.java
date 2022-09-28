package com.addressbook;

import java.util.ArrayList;

public class AddressBook {
    ArrayList<Person> addressbook = new ArrayList<Person>();

    public ArrayList<Person> addContact(Person person) {
        this.addressbook.add(person);
        return addressbook;

    }

    public void editContact(Person editedContact) {
        /*
        Searching the person in the addressbook using for eachloop if found then change its details
        with the new information provided
         */

        for (Person person : this.addressbook) {
            /*
            if person first name matches with the name provided in the editedContact then change its details
            to the new information provided in the editedContact.
             */

            if (person.getFirstName().equals(editedContact.getFirstName())) {
                person.setLastName(editedContact.getLastName());
                person.setAddress(editedContact.getAddress());
                person.setCity(editedContact.getCity());
                person.setState(editedContact.getState());
                person.setPhoneNumber(editedContact.getPhoneNumber());
                person.setZip(editedContact.getZip());
                return;

            }
        }
        System.out.println("Name not found in the list");

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

