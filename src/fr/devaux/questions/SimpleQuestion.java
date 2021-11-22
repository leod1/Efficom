package fr.devaux.questions;


import fr.devaux.Reponses;

import java.util.ArrayList;

public class SimpleQuestion extends QuestionsHandler {

    public SimpleQuestion(String label, ArrayList<Reponses> reponsesList) {
        super(label,reponsesList);
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

    private int getIDOfGoodRep(){
        for (Reponses Reponse: super.getReponsesList()) {
            if (Reponse.isVerite()){
                return Reponse.getId();
            }
        }
        return 0;
    }

    @Override
    public void afficheQuestion(int numquestion) {
        System.out.println(numquestion + ") "+ super.getLabel());
        System.out.println("[Cette question n'attend qu'un seul choix]");
        for (Reponses Reponse: super.getReponsesList()) {
            System.out.println("    " + Reponse.getId() + ") " + Reponse.getLabel());
        }

    }

    @Override
    public boolean resultOfRep(String rep) {
        return Integer.parseInt(rep) == getIDOfGoodRep();
    }
}