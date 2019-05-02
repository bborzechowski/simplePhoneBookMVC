package bb.orzechowski.controller;

import bb.orzechowski.models.ContactModel;
import bb.orzechowski.services.ContactService;
import bb.orzechowski.services.impl.ContactServiceImpl;

import bb.orzechowski.services.impl.ContactServiceSetImpl;
import bb.orzechowski.views.MenuView;

import java.util.Scanner;

public class PhoneController {

    private MenuView menuView;
    private Scanner scanner;
    private ContactService contactService;

    public PhoneController(){
        menuView = new MenuView();
        scanner = new Scanner(System.in);
//     contactService = new ContactServiceImpl();

        contactService = new ContactServiceSetImpl();
    }
    public void start(){
        String answer;
        do{
            menuView.printMenu();
            menuView.askForAnswer(); //bierze z MenuView metode askForAnswer
            answer = scanner.nextLine();
            parseAnswer(answer);
        }
        while (!answer.equals("exit"));

    }

    private void parseAnswer(String answer) {
        switch (answer){
            case "1":{

                 contactService.addContact(getContactFromUser());


                break;
            }
            case "2":{
                menuView.printContactList(contactService.getAllContact());

                break;
            }
            case "3":{
                contactService.removeContact(getContactFromUser());

                break;
            }

        }
    }

    private ContactModel getContactFromUser() {
        menuView.askForNumber();
        String number = scanner.nextLine();

        menuView.askForName();
        String name = scanner.nextLine();

        menuView.askForSurname();
        String surname = scanner.nextLine();

        return new ContactModel(name, surname, number);
    }
}
