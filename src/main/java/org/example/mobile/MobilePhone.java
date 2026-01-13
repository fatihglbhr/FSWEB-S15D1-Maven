package org.example.mobile;

import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContacts;

    public String getMyNumber(){
        return myNumber;
    }

    public List<Contact> getMyContacts(){
        return myContacts;
    }

    public MobilePhone(String myNumber, List<Contact> myContacts){
        this.myNumber = myNumber;
        this.myContacts = myContacts;
    }

    public boolean addNewContact(Contact contact){
        if(!myContacts.contains(contact)){
            myContacts.add(contact);
            return false;
        } else {
            return true;
        }
    }

    public boolean updateContact(Contact oldCont, Contact newCont){
        if(myContacts.contains(oldCont)){
            oldCont = newCont;
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact){
            if(!myContacts.contains(contact))
                return false;
            myContacts.remove(contact);
            return true;
    }

    public int findContact(Contact contact){
        if(myContacts.contains(contact)){
            return myContacts.indexOf(contact);
        } else {
            return -1;
        }
    }

    public int findContact(String contact){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact))
                return i;
        }
        return -1;
    }

    public Contact queryContact(String contact){
        int cont = -1;
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(contact))
                cont = i;
        }
        if(cont == -1)
            return null;
        return myContacts.get(cont);
    }

    public void printContact(){
        for(Contact contact: myContacts){
            System.out.println("1. " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    @Override
    public String toString() {
        return myNumber;
    }
}
