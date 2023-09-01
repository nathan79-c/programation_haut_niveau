package oop;

import java.util.ArrayList;

public class Promotion {
    private String name;
    private ArrayList<Student> db = new ArrayList<Student>();
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getDb() {
        return db;
    }

    public void setDb(ArrayList<Student> db) {
        this.db = db;
    }

    public Promotion add(Student student) {
        this.db.add(student);
        return this;
    }

    public void displayStudent() {
        for (Student student: db) {
            System.out.println(student);
        }
    }
}
