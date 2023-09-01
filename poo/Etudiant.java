package poo;

public class Etudiant{
    public Etudiant(String matricule, String nom, String prenom) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }
    private String matricule;
    private String nom;
    private String prenom;

    
    public String getMatricule(){
        return matricule;
        
    }
    public String getNom(){
        return this.nom;
    }
    public String getPrenom(){
        return this.prenom;
    }
    public void setMatricule(String matricule){
            this.matricule = matricule;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
}