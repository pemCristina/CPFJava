package com.cristina;

import java.util.LinkedList;
import java.util.Scanner;

public class Contacts {
    private LinkedList<Contact> contacts = new LinkedList<>();

    public LinkedList<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(LinkedList<Contact> contacts) {
        this.contacts = contacts;
    }

    public int size() {
        return contacts.size();
    }

    public void addContact() {
        LinkedList<String> stringLinkedList = new LinkedList<>();
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Name: ");
        String name = keyboard.nextLine();

        System.out.print("Phone: ");
        String phone = keyboard.nextLine();

        Contact contact = new Contact(name, phone);
        contacts.add(contact);

        System.out.println("Saved new contact!");
    }

    public void deleteContact() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Position to delete? ");
        try {
            int position = keyboard.nextInt();
            if (position < 0 || position >= contacts.size()) {
                System.out.println("Error!");
            } else {
                contacts.remove(position);
                System.out.println("Deleted contact!");
            }
        } catch (Exception e) {
            System.out.println("Error!");
        }
    }
}

