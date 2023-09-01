package oop.Data;

import oop.Super.Person;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Contact{

//    protected ArrayList<Person> directory = new ArrayList<>();
    private final Set<Person> directory = new HashSet<>();

    public Contact store(Person person) {
        directory.add(person);
        return this;
    }

    public Set<Person> getAll() {
        return directory;
    }
}
