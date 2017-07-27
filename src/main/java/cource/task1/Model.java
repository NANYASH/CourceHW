package cource.task1;

/**
 * Created by nanya on 7/20/17.
 */
public class Model {
    private String firstWord;
    private String secondWord;

    // The Program logic


    public String addOurWords(){
        return firstWord +"\u0020"+ secondWord;
    }

    public String getFirstWord() {
        return firstWord;
    }

    public void setFirstWord(String firstWord) {
        this.firstWord = firstWord;
    }

    public String getSecondWord() {
        return secondWord;
    }

    public void setSecondWord(String secondWord) {
        this.secondWord = secondWord;
    }
}
