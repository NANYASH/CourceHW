package cource.task4.Controller;

import cource.task4.Model.Model;
import cource.task4.Model.entities.Address;
import cource.task4.Model.entities.Groop;
import cource.task4.Model.entities.Note;
import cource.task4.View.View;

import java.util.Scanner;
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
    private String homePhone;
    private String mobPhone1;
    private String mobPhone2;
    private String email;
    private String skype;
    private String index;
    private String city;
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private String createDate;
    private String editDate;
    private String[] userArray = {surname,name,patronymic,nickName,comment,groop,
    homePhone,mobPhone1,mobPhone2,email,skype,index,city,street,
            buildingNumber,apartmentNumber,createDate,editDate};


    // Constructor
    public Controller(Model model,View view) {
        this.model = model;
        this.view = view;


    }

    // The Work method
    public void processUser(){
        do {
            inputStringValueWithScanner();

        }while (userArray[userArray.length-1]==null);
        setFields();

        model.getNotebook().addNote(new Note(this.surname,this.name,this.patronymic,this.nickName,
                this.comment,Groop.valueOf(this.groop),this.homePhone,this.mobPhone1,this.mobPhone2,
                this.email,this.skype,new Address(this.index,this.city,this.street,this.buildingNumber,
                this.apartmentNumber),this.createDate,this.editDate));





    }

    // The Utility methods
    public void inputStringValueWithScanner() {

        view.printMessage(view.INPUT);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0;i<userArray.length;i++) {
            userArray[i] = scanner.next();
            while (!userArray[i].matches(RegEx.getRegexArray()[i])) {
                view.printMessage(view.WRONG_INPUT + view.INPUT);
                userArray[i] = scanner.next();

            }
        }
    }
    public void setFields(){
        this.surname = userArray[0];
        this.name = userArray[1];
        this.patronymic = userArray[2];
        this.nickName = userArray[3];
        this.comment = userArray[4];
        this.groop = userArray[5];
        this.homePhone = userArray[6];
        this.mobPhone1 = userArray[7];
        this.mobPhone2 = userArray[8];
        this.email = userArray[9];
        this.skype = userArray[10];
        this.index = userArray[11];
        this.city = userArray[12];
        this.street = userArray[13];
        this.buildingNumber = userArray[14];
        this.apartmentNumber = userArray[15];
        this.createDate = userArray[16];
        this.editDate = userArray[17];


    }

}
