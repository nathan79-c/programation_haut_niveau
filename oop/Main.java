package oop;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import oop.Data.Cote;
import oop.Data.Cours;
import oop.Promotion;
import oop.Student;
import oop.Teacher;

public class Main {
    public static void main(String[] args) {
        try {
            // Création de la promotion
            Promotion promotion = new Promotion();

            // Ajout des étudiants à la promotion
            Student student1 = new Student("John", "Doe", "kasongo", 'M');
            Student student2 = new Student("Jane", "Smith", "patience", 'F');
            promotion.add(student1);
            promotion.add(student2);

            // Création du professeur
            Teacher teacher1 = new Teacher("Jane Doe", "Jane", "Doe", 'F',"Dr");
            Teacher teacher2 = new Teacher("Pierre Dupont", "Pierre", "Dupont", 'M', "CT");

            // Création des cours
            Cours cours1 = new Cours(1, "Mathématiques");
            Cours cours2 = new Cours(2, "Physique");
            Cours cours3 = new Cours(3, "Chimie");

            // Ajout des cours aux professeurs
            teacher1.ajouterCours(cours1);
            teacher1.ajouterCours(cours2);
            teacher2.ajouterCours(cours3);

            // Attribution des cours aux professeurs
            cours1.setTeacher(teacher1);
            cours2.setTeacher(teacher1);
            cours3.setTeacher(teacher2);

            // Ajout des notes des étudiants dans les cours
            Cote cote1 = new Cote(1, "Devoir 1", 80);
            Cote cote2 = new Cote(2, "Devoir 2", 90);
            student1.ajouterCote(cote1);
            student1.ajouterCote(cote2);

            Cote cote3 = new Cote(1, "Devoir 1", 70);
            Cote cote4 = new Cote(2, "Devoir 2", 80);
            student2.ajouterCote(cote3);
            student2.ajouterCote(cote4);

            // Calcul de la moyenne des notes de chaque étudiant
            double percentage1 = student1.computePercentage(student1.getCotes());
            double percentage2 = student2.computePercentage(student2.getCotes());

          
            // Enregistrement des informations dans un fichier
            FileWriter writer = new FileWriter("informations.txt");
            writer.write("Informations des étudiants:\n");
            writer.write(student1.toString() + "\n");
            writer.write(student2.toString() + "\n");
            
            
            writer.write("Informations sur les professeurs:\n");
            writer.write(teacher1.toString() + "\n");
            writer.write(teacher2.toString() + "\n");
            writer.close();

            // Lecture du fichier et affichage des informations à l'écran
            FileReader reader = new FileReader("informations.txt");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de la manipulation du fichier.");
            e.printStackTrace();
        }
    }
}