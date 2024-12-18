package org.campus02.oop;

import java.util.HashMap;

public class CountryAnalyzer extends PersonAnalyzer {

    // Key -> Land
    // Value -> Anzahl der Personen in diesem Land
    private HashMap<String, Integer> result = new HashMap<>();

    public HashMap<String, Integer> getResult() {
        return result;
    }

    @Override
    public void analyze() {
        for (Person person: super.getPersons()) {
            String country = person.getCountry(); // STRG + ALT + V -> variable erzeugen

//            if (result.containsKey(country)) {
//                Integer countOfPersons = result.get(country);
//                result.put(country, countOfPersons + 1);
//            } else {
//                result.put(country, 1);
//            }

            Integer count = result.getOrDefault(country, 0);
            result.put(country, count + 1);
        }
    }
}
