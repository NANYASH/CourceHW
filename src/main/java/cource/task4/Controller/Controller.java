package cource.task4.Controller;

import cource.task4.Model.Model;
import cource.task4.Model.entities.Address;
import cource.task4.Model.entities.Groop;
import cource.task4.Model.entities.Note;
import cource.task4.Model.entities.Notebook;
import cource.task4.View.View;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by nanya on 7/28/17.
 */
public class Controller {

    Model model;
    View view;
    private String surname;
    private String name;
    private String patronymic;
    private String nickName;
    private String comment;
    private String groop;
    private String mobPhone;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private String createDate;
    private String editDate;
    //private List <String> userList;
    private String[] userArray = {surname,name,patronymic,nickName,comment,groop,
    mobPhone,email,skype,index,city,street,
            buildingNumber,apartmentNumber,createDate,editDate};


    // Constructor
    public Controller(Model model,View view) {
        this.model = model;
        this.view = view;
       //this.userList = new ArrayList<String>(15);

    }

    // The Work method
    public void processUser(){
        do {
            inputStringValueWithScanner();

        } while (userArray[userArray.length-1]==null);
        setFields();

        Notebook notebook = new Notebook();

        Address address = new Address(this.index,this.city,this.street,this.buildingNumber,
                this.apartmentNumber);
        Note note = new Note(this.surname,this.name,this.patronymic,this.nickName,
                this.comment,Groop.valueOf(this.groop),this.mobPhone,this.email,this.skype,address,this.createDate,
                this.editDate);
        notebook.addNote(note);
        System.out.println(notebook.getNoteList().get(0));


    }

    // The Utility methods

    public void inputStringValueWithScanner() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<userArray.length;i++) {
            view.printMessage(view.INPUT,view.FIELDS_NAMES[i]);
            userArray[i] = scanner.next();
            while (!userArray[i].matches(RegEx.getRegexArray()[i])) {
                view.printMessage(view.WRONG_INPUT);
                view.printMessage(view.INPUT,view.FIELDS_NAMES[i]);
                userArray[i] = scanner.next();

            }
        }
    }
   /*public void inputStringValueWithScanner(){
       Scanner scanner = new Scanner(System.in);
       for (int i = 0 ; i<userList.size();i++){
           view.printMessage(view.INPUT,view.FIELDS_NAMES[i]);
           userList.add(i,scanner.next());
           while (userList.get(i).matches(RegEx.getRegexArray()[i])){
               view.printMessage(view.WRONG_INPUT);
               view.printMessage(view.INPUT,view.FIELDS_NAMES[i]);
               userList.add(i,scanner.next());
           }

       }*/


    public void setFields(){
        this.surname = userArray[0];
        this.name = userArray[1];
        this.patronymic = userArray[2];
        this.nickName = userArray[3];
        this.comment = userArray[4];
        this.groop = userArray[5];
        this.mobPhone = userArray[6];
        this.email = userArray[7];
        this.skype = userArray[8];
        this.index = userArray[8];
        this.city = userArray[10];
        this.street = userArray[11];
        this.buildingNumber = userArray[12];
        this.apartmentNumber = userArray[13];
        this.createDate = userArray[14];
        this.editDate = userArray[15];


    }

}
