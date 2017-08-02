package cource.task4.Controller;

import java.awt.*;

/**
 * Created by nanya on 7/28/17.
 */
public class RegEx {
    private static final String SURNAME = "^[A-z'-]{1,20}$";
    private static final String NAME = "^[A-z'-]{1,20}$";
    private static final String PATRONYMIC ="^[A-z'-]{1,20}$";

    //Фамилия + Пробел + Первая буква Имени + точка

    private static final String NICKNAME = "^[A-z'-]{1,20}$";

    private static final String COMMENT = "^[A-z0-9-!-.-]{1,100}$";



    private static final String MOB_PHONE = "^+380\\d{3}\\d{2}\\d{2}\\d{2}$";


    private static final String EMAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
    private static final String SKYPE = "^[a-z][a-z0-9]{5,31}$";


    private static final String INDEX = "^\\b[0-9]{5}\\b$";
    private static final String CITY = "^[a-zA-Z'-]{1,20}$";
    private static final String STREET = "[a-zA-Z'-]{1,20}$";
    private static final String BUILDING_NUMBER = "^[0-9]{1,3}$" ;
    private static final String APARTMENT_NUMBER = "^[0-9]{1,3}$";

    private static final String CREATE_DATE = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";//YYYY-MM-DD
    private static final String EDIT_DATE = "^[0-9]{4}-(0[1-9]|1[012])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";//YYYY-MM-DD

    private static final String GROOP = "^FAMILY|FRIENDS|WORK$";

    private static final String[] regexArray = {SURNAME,NAME,PATRONYMIC,NICKNAME,
            COMMENT,GROOP,MOB_PHONE,EMAIL, SKYPE,INDEX,CITY,STREET,BUILDING_NUMBER,
            APARTMENT_NUMBER,CREATE_DATE,EDIT_DATE};

    public static String getSURNAME() {
        return SURNAME;
    }

    public static String getNAME() {
        return NAME;
    }

    public static String getPATRONYMIC() {
        return PATRONYMIC;
    }

    public static String getNICKNAME() {
        return NICKNAME;
    }

    public static String getCOMMENT() {
        return COMMENT;
    }

    public static String getGROOP() {
        return GROOP;
    }

    public static String getMobPhone1() {
        return MOB_PHONE;
    }

    public static String getEMAIL() {
        return EMAIL;
    }

    public static String getSKYPE() {
        return SKYPE;
    }

    public static String getINDEX() {
        return INDEX;
    }

    public static String getCITY() {
        return CITY;
    }

    public static String getSTREET() {
        return STREET;
    }

    public static String getBuildingNumber() {
        return BUILDING_NUMBER;
    }

    public static String getApartmentNumber() {
        return APARTMENT_NUMBER;
    }

    public static String getCreateDate() {
        return CREATE_DATE;
    }

    public static String getEditDate() {
        return EDIT_DATE;
    }

    public static String[] getRegexArray() {
        return regexArray;
    }
}
