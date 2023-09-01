package oop;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import oop.Data.Cote;
import oop.Data.Cours;
public class principal3 {
   public static void main(String[] args) throws IOException {
        // Créer un fichier pour enregistrer les informations
        File fichier = new File("enregistrements.txt");
        FileWriter ecrivain = new FileWriter(fichier);

        // Créer un étudiant
        Student etudiant = new Student("John Doe", "John", "Doe", 'M');

        // Créer une cote
        Cote cote = new Cote();
        cote.setNom("Examen final");
        cote.setValeur(18);

        // Créer un cours
        Cours cours = new Cours();
        cours.setNom("Programmation");
        cours.setTeacher(new Teacher("Jane Doe", "Jane", "Doe", 'F', null));

        // Ajouter l'étudiant au cours
       // cours.addStudent(etudiant);

        // Ajouter la cote à l'étudiant
        etudiant.ajouterCote(cote);

        // Enregistrer les informations dans le fichier
        ecrivain.write("Étudiant : " + etudiant.toString() + "\n");
        ecrivain.write("Cours : " + cours.toString() + "\n");
        ecrivain.write("Cote : " + cote.toString() + "\n");

        // Fermer le fichier
        ecrivain.close();

        // Parcourir le fichier pour afficher les informations
        List<String> lignes = new ArrayList<>();
        FileReader lecteur = new FileReader(fichier);
        int i;
        while ((i = lecteur.read()) != -1) {
            lignes.add((char) i + "");
        }
        lecteur.close();

        for (String ligne : lignes) {
            System.out.println(ligne);
        }
    }
    
    
}
