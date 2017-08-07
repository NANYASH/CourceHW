package cource.task4.model;

import cource.task4.model.entities.Notebook;

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
