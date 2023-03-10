package com.bridgelabz;

import java.util.*;

public class AddressBook {

    private String name;
    private List<Contacts> contactsList;

    public  AddressBook(String name){
        this.name = name;
        this.contactsList = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public List<Contacts> getContactsList(){
        return contactsList;
    }

    public void addContact(Contacts contacts){
        contactsList.add(contacts);
    }
}
