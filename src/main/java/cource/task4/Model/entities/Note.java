package cource.task4.Model.entities;

import cource.task4.Model.entities.Address;
import cource.task4.Model.entities.Groop;

/**
 * Created by nanya on 7/28/17.
 */
public class Note {
    private String surname;
    private String name;
    private String patronymic;
    //Фамилия + Пробел + Первая буква Имени + точка
    private String nickName;
    private String comment;
    private Groop groop;
    private String mobPhone;
    private String email;
    private String skype;
    private Address address;
    private String createDate;
    private String editDate;

    public Note(String surname, String name, String patronymic, String nickName,
                String comment, Groop groop, String mobPhone, String email, String skype,
                Address address, String createDate, String editDate) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.nickName = nickName;
        this.comment = comment;
        this.groop = groop;
        this.mobPhone = mobPhone;
        this.email = email;
        this.skype = skype;
        this.address = address;
        this.createDate = createDate;
        this.editDate = editDate;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Groop getGroop() {
        return groop;
    }

    public void setGroop(Groop groop) {
        this.groop = groop;
    }

    public String getMobPhone() {
        return mobPhone;
    }

    public void setMobPhone(String mobPhone) {
        this.mobPhone = mobPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getEditDate() {
        return editDate;
    }

    public void setEditDate(String editDate) {
        this.editDate = editDate;
    }

    @Override
    public String toString() {
        return "Note{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", nickName='" + nickName + '\'' +
                ", comment='" + comment + '\'' +
                ", groop=" + groop +
                ", mobPhone='" + mobPhone + '\'' +
                ", email='" + email + '\'' +
                ", skype='" + skype + '\'' +
                ", address=" + address +
                ", createDate='" + createDate + '\'' +
                ", editDate='" + editDate + '\'' +
                '}';
    }
}

