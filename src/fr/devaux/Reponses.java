package fr.devaux;

public class Reponses {
    private String label;
    private boolean verite;
    private int id;

    public Reponses(String label, boolean verite,int id) {
        this.label = label;
        this.verite = verite;
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean isVerite() {
        return verite;
    }

    public void setVerite(boolean verite) {
        this.verite = verite;
    }

    public int getId() {
        return id;
    }
}
