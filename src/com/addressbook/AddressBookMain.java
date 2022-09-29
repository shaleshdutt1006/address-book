package com.addressbook;

import java.util.*;

public class AddressBookMain {
    public static Person input(Scanner scanner) {

        System.out.println("add details of a person");

        System.out.println("Please provide first name");
        String firstName = scanner.next();

        System.out.println("Please provide Last name");
        String lastName = scanner.next();

        System.out.println("Please provide address");
        String address = scanner.next();

        System.out.println("Please provide city");
        String city = scanner.next();

        System.out.println("Please provide state");
        String state = scanner.next();

        System.out.println("Please provide zip");
        int zip = scanner.nextInt();

        System.out.println("Please provide phone number");
        String phoneNumber = scanner.next();
        Person person = new Person(firstName, lastName, address, city, state, zip, phoneNumber);
        return person;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    /*
    Adding Contacts details using Constructor of person class
    */
        Person person1 = new Person("amit", "dutt", "kaithal", "kaithal", "haryana", 54654, "845165489165");
        Person person2 = new Person("ankita", "sharma", "andheri", "mumbai", "maharashtra", 56565, "94516558498");

    /*
    Adding contacts to different address books by using addContact method means every single address book
    has multiple contacts
    */

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(person1);
        addressBook.addContact(person2);
        System.out.println("Address book before adding new contact is : ");
        addressBook.printAddressBook();

        System.out.println("Checking duplicate entry before adding new contact");
        addressBook.addContact(input(scanner));
        addressBook.printAddressBook();

    }


}


