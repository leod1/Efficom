package fr.devaux;

import fr.devaux.questions.MultipleQuestion;
import fr.devaux.questions.QuestionsHandler;
import fr.devaux.questions.SimpleQuestion;

import java.util.ArrayList;
import java.util.Scanner;

public class Quizz {
    private ArrayList<QuestionsHandler> QuestionList;
    private int score;
    private int currentquestion;

    public Quizz() {
        QuestionList = new ArrayList<>();
        score = 0;
    }

    public void remplirQuizz(){
        ArrayList Reponses = new ArrayList<Reponses>();
        Reponses.add(new Reponses("vert", false,1));
        Reponses.add(new Reponses("rouge", false,2));
        Reponses.add(new Reponses("jaune", false,3));
        Reponses.add(new Reponses("bleu", true,4));

        ArrayList Reponses1 = new ArrayList<Reponses>();
        Reponses1.add(new Reponses("vert", false,1));
        Reponses1.add(new Reponses("rouge", true,2));
        Reponses1.add(new Reponses("jaune", false,3));
        Reponses1.add(new Reponses("bleu", false,4));

        ArrayList Reponses2 = new ArrayList<Reponses>();
        Reponses2.add(new Reponses("Léo", true,1));
        Reponses2.add(new Reponses("Noemie", true,2));
        Reponses2.add(new Reponses("Jaque", false,3));
        Reponses2.add(new Reponses("Elias", true,4));

        QuestionsHandler Question = new SimpleQuestion("Quel est la couleur du ciel ?",Reponses);
        QuestionsHandler Question1 = new SimpleQuestion("Quel est la couleur de ma voiture ?",Reponses1);
        QuestionsHandler Question2 = new MultipleQuestion("Qui sont les membres du groupe",Reponses2);


        QuestionList.add(Question);
        QuestionList.add(Question1);
        QuestionList.add(Question2);
    }
    public void quizzStart(){
        this.score = 0;
        this.currentquestion = 1;
        System.out.println("Bienvenue sur le quizz !!!");
        for (QuestionsHandler Question: QuestionList) {
            Question.afficheQuestion(currentquestion);
            Scanner scanner = new Scanner(System.in);
            System.out.println(Question.resultOfRep(scanner.nextLine()));
            currentquestion++;
        }
    }

}
