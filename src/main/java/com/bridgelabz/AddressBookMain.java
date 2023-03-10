package com.bridgelabz;

import java.io.IOException;

public class AddressBookMain {

    public static void main(String[] args) throws IOException {

        Contacts person1 = new Contacts("Sarfaraz", "Khan", "Nagpur", "Maharashtra", "123456879", "Khansar@gmail.com");
        Contacts person2 = new Contacts("Sartaj", "Khan", "Nagpur", "Maharashtra", "856426879",  "Khansartaj@gmail.com");
        Contacts person3 = new Contacts("Sahil", "Khan", "Nagpur", "Maharashtra", "896325279", "Khansahil@gmail.com");
        Contacts person4 = new Contacts("Sohel;", "Khan", "Nagpur", "Maharashtra", "12622552279", "Khansohail@gmail.com");

        //creating some multiple addressBook
        AddressBook  ab1 =new AddressBook("Sibling");
        ab1.addContact(person1);
        ab1.addContact(person2);

        AddressBook  ab2 =new AddressBook("Cousins");
        ab2.addContact(person3);
        ab2.addContact(person4);

        AddressBookManager addressBookManager = new AddressBookManager();
        addressBookManager.addAddressBook(ab1);
        addressBookManager.addAddressBook(ab2);
      //  addressBookManager.getAddressBookList();
        addressBookManager.getCityMap();
        addressBookManager.getStateMap();
        addressBookManager.writeAddressBookToFile("AddressBook");

    }
}
