package fr.devaux.questions;

import fr.devaux.Reponses;
import fr.devaux.questions.exeptions.BadID;
import fr.devaux.questions.exeptions.BadSynthax;
import fr.devaux.questions.exeptions.Badchar;

import java.util.ArrayList;

public abstract class QuestionsHandler {
    private String label;
    private ArrayList<Reponses> ReponsesList;

    public QuestionsHandler(String label, ArrayList<Reponses> reponsesList) {
        this.label = label;
        ReponsesList = reponsesList;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<Reponses> getReponsesList() {
        return ReponsesList;
    }

    public void setReponsesList(ArrayList<Reponses> reponsesList) {
        ReponsesList = reponsesList;
    }

    public abstract void afficheQuestion(int numquestion);

    public abstract boolean resultOfRep(String rep);


}
