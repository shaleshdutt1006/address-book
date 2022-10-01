package com.addressbook;

import java.util.*;

public class AddressBookMain {
    public static Person input(Scanner scanner) {

        System.out.println("Add details of a person");

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
        Person person1 = new Person("amit", "dutt", "bandra", "mumbai", "haryana", 54654, "845165489165");
        Person person2 = new Person("ankita", "sharma", "andheri", "mumbai", "maharashtra", 56565, "94516558498");
        Person person3 = new Person("sumit", "kumar", "antila", "pune", "maharashtra", 92226, "4849849840");
        Person person4 = new Person("anybody", "rana", "emaar", "gurgaon", "haryana", 986544, "44948270");
        Person person5 = new Person("anita", "sharma", "model", "mumbai", "delhi", 26556, "2554654");
    /*
    Adding contacts to different address books by using addContact method means every single address book
    has multiple contacts
    */

        AddressBook addressBook = new AddressBook();
        addressBook.addContact(new Person("sunita", "sharma", "bandra", "mumbai", "haryana", 546854, "85489165"));
        addressBook.addContact(person2);
        AddressBook addressBook1 = new AddressBook();
        addressBook1.addContact(person3);
        addressBook1.addContact(person4);
        AddressBook addressBook2 = new AddressBook();
        addressBook2.addContact(person5);
        addressBook2.addContact(person1);


        Map<String, AddressBook> map = new HashMap<>();

        map.put("addressBook", addressBook);
        map.put("addressBook1", addressBook1);
        map.put("addressBook2", addressBook2);
    /*
    Adding Person in the addressbook by calling input function
     */
        addressBook.addContact(input(scanner));

        System.out.println("Enter city you want contacts for");
        String city = scanner.next();
        System.out.println("Enter state you want contacts for");
        String state = scanner.next();
    /*
    for iterating the map we take a variable e  and iterating over every addressbook in the map and temp is a variable of
    type AddressBook like we take int a. In temp we are getting values of addressbooks one by one from map further for-each
    loop to iterate persons in the addressbook and if person city equal to the input city then printing it.
     */


        int count1 = 0;
        int count2 = 0;


        for (Map.Entry<String, AddressBook> e : map.entrySet()) {

            AddressBook temp = e.getValue();

            for (Person person : temp.getAddressbook()) {

                if (person.getCity().equalsIgnoreCase(city)) {
                    System.out.println("Contacts of person in the same city are ");
                    count1++;
                    temp.printAddressBook(person);

                } else if (person.getState().equalsIgnoreCase(state)) {
                    System.out.println("Contacts of person in the same state are ");
                    count2++;
                    temp.printAddressBook(person);

                }
            }

        }
        System.out.println("Number of persons in the same city in addressbook are : " + count1);
        System.out.println("Number of persons in the same state in addressbook are : " + count2);
    }
}





