package bb.orzechowski.views;

import bb.orzechowski.models.ContactModel;

import java.util.HashSet;
import java.util.List;

public class MenuView {
    public void printMenu(){

        System.out.println("1 - Doaj kontakt");
        System.out.println("2 - Wyświetl wszystkie kontakty");
        System.out.println("3 - Usuń kontakt");
        System.out.println("exit - Zakończenie programu");

    }
    public void askForAnswer(){
        System.out.println("Podaj odpowiedz: ");
    }

    public void askForNumber(){
        System.out.println("Podaj numer: ");
    }

    public void askForName(){
        System.out.println("Podaj imię: ");
    }

    public void askForSurname(){
        System.out.println("Podaj nazwisko: ");
    }

//    public void printContactList(List<ContactModel> contactModelList){
    public void printContactList(HashSet<ContactModel> contactModelList){
        for (ContactModel contact : contactModelList){
            System.out.println(contact.getName() + " " + contact.getSurname() + ": " + contact.getNumber());
        }
    }
}
