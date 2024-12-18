package org.campus02.oop;

import java.util.HashSet;

public class MaxSalaryAnalyzer extends PersonAnalyzer {
    @Override
    public void analyze() {
        HashSet<Person> personsWithHighestSalary = new HashSet<>();
        int highestSalary = 0;

        // iter + Tab
        for (Person person : super.getPersons()) {
            if (person.getSalary() > highestSalary) {
                highestSalary = person.getSalary();
                personsWithHighestSalary.clear(); // zuerst alle bisherigen Personen entfernen
                personsWithHighestSalary.add(person);
            } else if (person.getSalary() == highestSalary) {
                personsWithHighestSalary.add(person);
            }
        }

        for (Person person : personsWithHighestSalary) {
            System.out.println(person);
        }
    }
}
