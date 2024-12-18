package org.campus02.oop;

import java.util.ArrayList;

public class PersonManager {

    private ArrayList<Person> persons;

    public PersonManager() {
        this.persons = new ArrayList<>();
    }

    public void addPerson(Person p) {
        persons.add(p);
    }

    public void doAnalysis(PersonAnalyzer a) {
        a.setPersons(persons);
        a.analyze();
    }
}
