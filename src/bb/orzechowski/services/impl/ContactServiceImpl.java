package bb.orzechowski.services.impl;

import bb.orzechowski.models.ContactModel;
import bb.orzechowski.services.ContactService;
import bb.orzechowski.views.MenuView;


import java.util.ArrayList;
import java.util.List;

public class ContactServiceImpl{ // implements ContactService {

//    private List<ContactModel> contacts = new ArrayList<>(); //baza danych numerów
//
//    @Override
//    public void addContact(ContactModel contactModel) {
////      if (isContactExistsInDatabase(contactModel.getName(), contactModel.getSurname(), contactModel.getNumber())){
//        if (isContactExistsInDatabase(contactModel)){
//
//          System.out.println("już istnieje taki kontakt"); //jeśli istnieje nic niezwraca
//          return;
//      }
//        contacts.add(contactModel); //jeśli nie istnieje dodaj kontakt
//}
//
//
//    @Override
//    public List<ContactModel> removeContact(ContactModel contactModel) {
//        List<ContactModel> li = new ArrayList<>();
//        if (isContactExistsInDatabase(contactModel)){ //sprawdza czy istnieje kontakt
//            for (ContactModel cel : contacts) {
//                if (cel.getNumber().equals(contactModel.getNumber())) { //jesli numer jest taki sam usuwa kontakt
//                    contacts.remove(cel);
//                }
//                li.add(contactModel);
//            }
//
//        }
//       return li;
//    }
//
//    private boolean isContactExistsInDatabase(ContactModel contactModel) { // jeśli istnieje nazwisko w bazie to zrwaca prawde a jak nie istnieje zwraca fałsz
//        for (ContactModel contact : contacts){
//            if(contact.getName().equals(contactModel.getName())&&contact.getSurname().equals(contactModel.getSurname()) && contact.getNumber().equals(contactModel.getNumber())){
//
//                return true;
//            }
//        }
//        return false;
//    }
//
//    @Override
//    public List<ContactModel> getAllContact() {
//        return contacts;
//    }

}
