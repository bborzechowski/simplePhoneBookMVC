package bb.orzechowski.services.impl;

import bb.orzechowski.models.ContactModel;
import bb.orzechowski.services.ContactService;


import java.util.HashSet;


public class ContactServiceSetImpl implements ContactService {

    private HashSet<ContactModel> contacts = new HashSet<>(); //baza danych numerów

    @Override
    public void addContact(ContactModel contactModel) {
        if (isContactExistsInDatabase(contactModel)) {

            //jeśli istnieje nic niezwraca
            return;
        }
        contacts.add(contactModel); //jeśli nie istnieje dodaj kontakt
    }


    @Override
    public HashSet<ContactModel> removeContact(ContactModel contactModel) {

            contacts.removeIf( n -> (n.getNumber().equals(contactModel.getNumber())));

        return contacts;
    }


    @Override
    public HashSet<ContactModel> getAllContact() {
        return contacts;
    }

    private boolean isContactExistsInDatabase(ContactModel contactModel) { // jeśli istnieje nazwisko w bazie to zrwaca prawde a jak nie istnieje zwraca fałsz
        for (ContactModel contact : contacts){
            if (contact.equals(contactModel)){

                return true;
            }
       }
        return false;
    }



}
