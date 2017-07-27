package cource.task2;


public class View {
    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value from: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String CONGRATULATIONS = "Congratulations! The number is ";

    public void printMessage(String message){
        System.out.println(message);
    }

    public void printCongratulationMessage(String message, int number){
        System.out.println(message+number);
    }

    public void printMessageWithInterval(String message,int min,int max){
        System.out.println(message +min+" to "+max);
    }




}
