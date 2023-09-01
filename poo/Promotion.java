package poo;

import java.util.ArrayList;

/**
 * Promotion
 */
public class Promotion {
    private String namePromotion;
    private ArrayList<Etudiant> promotion = new ArrayList<>();
    private static int i = 0;

    public Promotion(String noMPromotion){
             this.namePromotion = noMPromotion;
    }
    public ArrayList<Etudiant> getPromotion() {
        return promotion;
    }
    public void setPromotion(ArrayList<Etudiant> promotion, Etudiant etudiant) {
        promotion.add(i++, etudiant);
    }
    
    public String getNamePromotion() {
        return this.namePromotion;
    }
    public void setNamePromotion(String namePromotion) {
        this.namePromotion = namePromotion;
    }
    
}