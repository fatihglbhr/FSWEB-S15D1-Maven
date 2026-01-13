package org.example.mobile;

import java.net.ContentHandler;
import java.util.Objects;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this)
            return true;
        if(obj == null && obj.getClass() != this.getClass())
            return false;

        Contact contact = (Contact)obj;
        return contact.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
