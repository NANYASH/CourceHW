package cource.task4.model.entities;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by nanya on 7/28/17.
 */
public class Notebook {
    private static volatile Notebook instance;
    private static List<Note> noteList;

    public static Notebook getInstance() {//multithreading+lazy initialization,
        if (instance == null) {
            synchronized (Notebook.class) {
                if (instance == null){
                    instance = new Notebook();
                    noteList = new LinkedList<Note>();
                }
            }
        }

        return instance;
    }

    public static void addNote(Note note){
        noteList.add(note);
    }
    public static void removeNote(int i){
        noteList.remove(i);
    }
    public static void editNote(int i,Note note){
        noteList.set(i,note);
    }

    public static List<Note> getNoteList() {
        return noteList;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "noteList=" + noteList +
                '}';
    }


}
