package com.addressbook;

import java.util.ArrayList;

public class AddressBook {

    ArrayList<Person> addressbook = new ArrayList<Person>();

    /*
    Adding Contacts using addContact method in the arraylist of address book and checking duplicates entry
    */
    public void addContact(Person person) {

        boolean isDuplicate = duplicateEntry(person.getFirstName(), person);
        if (!isDuplicate) {
            addressbook.add(person);
        }
    }

    public boolean duplicateEntry(String firstname, Person person) {
    /*
    checking duplicate entry in address book using for-each loop if person firstname matches with
    the existing person first name in the address book means it is duplicate entry and return true else false
     */

        for (Person person1 : this.addressbook) {
            if (person1.getFirstName().equals(firstname)) {

                return true;
            }
        }
        return false;
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


