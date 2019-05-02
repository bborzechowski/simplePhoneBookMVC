package bb.orzechowski.services;

import bb.orzechowski.models.ContactModel;

import java.util.HashSet;
import java.util.List;

public interface ContactService {
    void addContact(ContactModel contactModel);
   // List<ContactModel> removeContact(ContactModel contactModel);
  //  List<ContactModel> getAllContact();
   HashSet<ContactModel> removeContact(ContactModel contactModel);
   HashSet<ContactModel> getAllContact();

}
