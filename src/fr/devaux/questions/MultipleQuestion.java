package fr.devaux.questions;

import fr.devaux.Reponses;

import java.util.ArrayList;

public class MultipleQuestion extends QuestionsHandler{

    public MultipleQuestion(String label, ArrayList<Reponses> reponsesList) {
        super(label, reponsesList);
    }

    public String getLabel() {
        return super.getLabel();
    }

    public void setLabel(String label) {
        super.setLabel(label);
    }

    public ArrayList<Reponses> getReponsesList() {
        return super.getReponsesList();
    }

    public void setReponsesList(ArrayList<Reponses> reponsesList) {
        super.setReponsesList(reponsesList);
    }

    private Reponses getReponsesByID(int id){
        for (Reponses Reponse: super.getReponsesList()) {
            if (Reponse.getId() == id){
                return Reponse;
            }
        }
        return null;
    }

    @Override
    public void afficheQuestion(int numquestion) {
        System.out.println(numquestion + ") "+ super.getLabel());
        System.out.println("[Cette question attend plusieurs choix]");
        for (Reponses Reponse: super.getReponsesList()) {
            System.out.println("    " + Reponse.getId() + ") " + Reponse.getLabel());
        }
    }

    @Override
    public boolean resultOfRep(String rep) {
        Integer.parseInt(rep);
        return false;
    }

}
