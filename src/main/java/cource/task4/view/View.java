package cource.task4.view;

public class View {

    public static final String INPUT= "Input your ";
    public static final String WRONG_INPUT = "Wrong input! Repeat please! ";
    public static final String[] FIELDS_NAMES = new String[]{"surname",
            "name", "patronymic", "nickName", "comment", "groop", "mobPhone", "email", "skype",
            "index", "city", "street", "buildingNumber", "apartmentNumber", "createDate", "editDate"};
    public void printMessage(String message){
        System.out.println(message);
    }
    public void printMessage(String message, String fieldName){System.out.println(message+""+fieldName);}
}
