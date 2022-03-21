package com.company;

import java.util.ArrayList;
import java.util.Iterator;

//Nick Davis 3/21/22 Exercise 10

public class Main {

    public static void main(String[] args) {
        ContactInfo myClass = new ContactInfo();
        System.out.println(myClass);
        //myClass.display();
        Contact contact1 = new Contact("Tom", 1234567890, "tom12@gmail.com");
        Contact contact2 = new Contact("Stacy", 1234567890, "stacy3245@gmail.com");
        Contact contact3 = new Contact("Jim", 1234568799, "jimjim@gmail.com");
        Contact contact4 = new Contact("Tony", 1234567898, "bigtony@gmail.com");
        myClass.add(contact1);
        myClass.add(contact2);
        myClass.add(contact3);
        myClass.add(contact4);
        for (Contact a :myClass) {
            System.out.println(a);
        }

    }
}

class Contact{
    private String name;
    private int phoneNumber;
    private String email;

    public Contact(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email=" + email +
                '}';
    }
}

class ContactInfo implements Iterable<Contact>{
    private ArrayList<Contact> listOfContacts = new ArrayList<>();

    public void add(Contact e){
        listOfContacts.add(e);
    }

    @Override
    public Iterator<Contact> iterator() {
        return listOfContacts.iterator();
    }

    @Override
    public String toString() {
        return "ContactInfo{" +
                "listOfContacts=" + listOfContacts +
                '}';
    }

    public void display(){
        for (Contact a :listOfContacts) {
            System.out.println(a);
        }
    }
}