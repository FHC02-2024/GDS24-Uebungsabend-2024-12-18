package org.campus02.oop;

import java.util.ArrayList;

public class GenderAnalyzer extends PersonAnalyzer {

    @Override
    public void analyze() {
        int countM = 0;
        int countW = 0;
        int sizeM = 0;
        int sizeW = 0;

        for (Person person : super.getPersons()) {
            if (person.getGender() == 'M') {
                countM++;
                // countM += 1;
                sizeM += person.getSize();
            } else {
                countW++;
                sizeW += person.getSize();
            }
        }

        int avgM = sizeM / countM;
        System.out.println("In der Liste existieren "
                                   + countM +
                                   " Männer mit einer durchschnittlichen Körpergröße von "
                                   + avgM + " cm");
        System.out.println("In der Liste existieren "
                                   + countW +
                                   " Frauen mit einer durchschnittlichen Körpergröße von "
                                   + (sizeW / countW) + " cm");
    }
}
