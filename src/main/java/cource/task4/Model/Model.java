package cource.task4.Model;

import cource.task4.Model.entities.Notebook;

/**
 * Created by nanya on 7/28/17.
 */
public class Model {

    private Notebook notebook;

    public Model() {
        this.notebook = new Notebook();
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public void setNotebook(Notebook notebook) {
        this.notebook = notebook;
    }
}
