package com.bridgelabz;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class AddressBookManager {

    private List<AddressBook> addressBookList;

    public AddressBookManager(){
        addressBookList = new ArrayList<>();
    }

    public void addAddressBook(AddressBook addressBook){
        addressBookList.add(addressBook);
    }

    public List<AddressBook> getAddressBookList(){
        return addressBookList;
    }

    public Map<String,List<Contacts>> getCityMap(){
        return addressBookList.stream().flatMap(a-> a.getContactsList().stream()).
                collect(Collectors.groupingBy(Contacts::getCity));
    }

    public Map<String,List<Contacts>> getStateMap(){
        return addressBookList.stream().flatMap(a-> a.getContactsList().stream()).
                collect(Collectors.groupingBy(Contacts::getState));
    }

    public void writeAddressBookToFile(String fileName) throws IOException{

        try(FileWriter writer = new FileWriter(fileName)){
            for (AddressBook ab: addressBookList) {
                writer.write(ab.getName() + "\n");
                for (Contacts contacts: ab.getContactsList()) {
                    writer.write(contacts.getFirstName() +"," +
                                    contacts.getLastName() + "," +
                                    contacts.getCity() + "," +
                                    contacts.getState() + "," +
                                    contacts.getEmail() + "," +
                                    contacts.getPhone() + "\n");
                }
                writer.write("\n");
            }
        }
    }
}
