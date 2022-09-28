package com.addressbook;

import java.util.*;

public class AddressBookMain {

    public static void main(String[] args) {
    /*
    Adding Contacts details using Constructor of person class
    */
        Person person1 = new Person("amit", "dutt", "kaithal", "kaithal", "haryana", 54654, "845165489165");
        Person person2 = new Person("ankita", "sharma", "andheri", "mumbai", "maharashtra", 56565, "94516558498");
        Person person3 = new Person("sumit", "kumar", "antila", "pune", "maharashtra", 92226, "4849849840");
        Person person4 = new Person("anybody", "rana", "emaar", "gurgaon", "haryana", 986544, "44948270");
        Person person5 = new Person("anita", "sharma", "model", "delhi", "delhi", 26556, "2554654");

    /*
    Adding contacts to different address books by using addContact method means every single addressbook
    has multiple contacts
    */
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact(person1);
        addressBook1.addContact(person2);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact(person3);
        addressBook2.addContact(person4);
        AddressBook addressBook3 = new AddressBook();
        addressBook3.addContact(person5);
        addressBook3.addContact(person3);
        addressBook3.addContact(person1);
        AddressBook addressBook4 = new AddressBook();
        addressBook4.addContact(person2);
        addressBook4.addContact(person4);
        addressBook4.addContact(person1);

    /*
    Creating hashmap of keys String type and value of addressbook
    */

        Map<String, AddressBook> map = new HashMap<>();
    /*
    putting different address books in the map. Map has two parts first one is key
    and Second one is value
    */

        map.put("addressBook1", addressBook1);
        map.put("addressBook2", addressBook2);
        map.put("addressBook3", addressBook3);
        map.put("addressBook4", addressBook4);

    /*
    for-each loop to print keys and values. e.getkey() to print keys and getting values using calling print function of
    address book we can use toString also to override the memory otherwise it shows memory location of address book only.
    by using printAddressBook function it shows every detail of the contact.
     */

        for (Map.Entry<String, AddressBook> e : map.entrySet()) {
            System.out.println(e.getKey());
            e.getValue().printAddressBook();

        }


    }


}


